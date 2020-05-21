package actividadlibro;

import javax.swing.JFrame;

//11.18 Uso de paneles para administrar esquemas más complejos
//Ejemplo de Jpanel con cinco objetos JButton, en un esquema GridLayout adjunto a la región SOUTH de un 
// esquema BorderLayout (Main)

public class Main11_18 extends JFrame{

    public static void main( String args[] ){

        E11_18 marcoPanel = new E11_18();
        marcoPanel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoPanel.setSize( 450, 200 ); // establece el tamaño del marco
        marcoPanel.setVisible( true ); // muestra el marco
    
    }
    
}