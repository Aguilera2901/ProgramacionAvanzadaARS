package actividadlibro;

import javax.swing.JFrame;

// 11.5 Campos de texto y una introducción al manejo de eventos con clases anidadas
// Ejemplo de Objetos JTextField y JPasswordField (Main)

public class Main11_5 {

    public static void main( String args[] ){
    
    E11_5 campoTextoMarco = new E11_5();
    campoTextoMarco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    campoTextoMarco.setSize( 350, 100 ); // establece el tamaño del marco
    campoTextoMarco.setVisible( true ); // muestra el marco

    }
}