package actividadlibro;

import javax.swing.JFrame;

// 11.8 JButton
// Ejemplo de Botones de comando y eventos de acción (Main)

public class Main11_8 {
    
    public static void main( String args[] ){

        E11_8 marcoBoton = new E11_8(); // crea MarcoBoton
        marcoBoton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoBoton.setSize( 300, 110 ); // establece el tamaño del marco
        marcoBoton.setVisible( true ); // muestra el marco
    }
}