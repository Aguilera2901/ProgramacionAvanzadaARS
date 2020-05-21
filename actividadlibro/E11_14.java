package actividadlibro;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

//11.14 Clases adaptadoras
// Ejemplo de Clics de los botones izquierdo, central y derecho del ratón

public class E11_14 extends JFrame{

    private String detalles; // objeto String que representa al objeto JLabel
    private JLabel barraEstado; // que aparece en la parte inferior de la ventana

    // constructor establece String de la barra de título y registra componente de escucha del ratón
    public E11_14(){

        super( "Clics y botones del raton");

        barraEstado = new JLabel( "Haga clic en el raton" );
        add( barraEstado, BorderLayout.SOUTH );
        addMouseListener( new ManejadorClicRaton() ); // agrega el manejador
        
    }

    // clase interna para manejar los eventos del ratón
    private class ManejadorClicRaton extends MouseAdapter{

        // maneja evento de clic del ratón y determina cuál botón se oprimió
        public void mouseClicked( MouseEvent evento ){

            int xPos = evento.getX(); // obtiene posición x del ratón
            int yPos = evento.getY(); // obtiene posición y del ratón

            detalles = String.format( "Se hizo clic %d vez(veces)", evento.getClickCount() );

            if ( evento.isMetaDown() ) detalles += " con el boton derecho del raton"; // botón derecho del ratón
            else if ( evento.isAltDown() ) detalles += " con el boton central del raton"; // botón central del ratón
            else detalles += " con el boton izquierdo del raton"; // botón izquierdo del ratón

            barraEstado.setText( detalles ); // muestra mensaje en barraEstado
        }
    }
    
}