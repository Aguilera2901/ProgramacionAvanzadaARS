package actividadlibro;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

//11.15 Subclase de JPanel para dibujar con el ratón
//Ejemplo de Clases adaptadoras utilizadas para implementar los manejadores de eventos (Main)

public class Main11_15 {

    public static void main( String args[] ){

        // crea objeto JFrame
        JFrame aplicacion = new JFrame( "Un programa simple de dibujo" );
 
        E11_15 panelDibujo = new E11_15(); // crea panel de dibujo
        aplicacion.add( panelDibujo, BorderLayout.CENTER ); // en el centro
 
        // crea una etiqueta y la coloca en la región SOUTH de BorderLayout
        aplicacion.add( new JLabel( "Arrastre el raton para dibujar" ),BorderLayout.SOUTH );
 
        aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        aplicacion.setSize( 400, 200 ); // establece el tamaño del marco
        aplicacion.setVisible( true ); // muestra el marco
    }
    
}