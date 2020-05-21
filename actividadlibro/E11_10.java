package actividadlibro;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

// 11.10 JComboBox y el uso de una clase interna anónima para el manejo de eventos
// Ejemplo de Objeto JComboBox que muestra una lista de nombres de imágenes

public class E11_10 extends JFrame{

    private JComboBox imagenesJComboBox; // cuadro combinado con los nombres de los iconos
    private JLabel etiqueta; // etiqueta para mostrar el icono seleccionado

    private String nombres[] = { "Insecto.jpg", "Insecto1.png", "Insecto2.jpg", "Insecto3.png"};
    private Icon iconos[] = { 
        new ImageIcon( getClass().getResource( nombres[ 0 ] ) ), 
        new ImageIcon( getClass().getResource( nombres[ 1 ] ) ), 
        new ImageIcon( getClass().getResource( nombres[ 2 ] ) ), 
        new ImageIcon( getClass().getResource( nombres[ 3 ] ) ) };

    // El constructor de MarcoCuadroCombinado agrega un objeto JComboBox a JFrame
    public E11_10(){
        super( "Prueba de JComboBox" );
        setLayout( new FlowLayout() ); // establece el esquema del marco

        imagenesJComboBox = new JComboBox( nombres ); // establece JComboBox
        imagenesJComboBox.setMaximumRowCount( 3 ); // muestra tres filas

        imagenesJComboBox.addItemListener( new ItemListener(){ // clase interna anónima
            
            // maneja evento de JComboBox
            public void itemStateChanged( ItemEvent evento ){

                // determina si está seleccionada la casilla de verificación
                if ( evento.getStateChange() == ItemEvent.SELECTED ) etiqueta.setIcon( iconos[imagenesJComboBox.getSelectedIndex() ] );

            }
        }
        ); 

    add( imagenesJComboBox ); // agrega cuadro combinado a JFrame
    etiqueta = new JLabel( iconos[ 0 ] ); // muestra el primer icono
    add( etiqueta ); // agrega etiqueta a JFrame

    } 
}