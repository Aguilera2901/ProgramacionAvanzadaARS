package actividadlibro;

import javax.swing.JFrame;

// 11.4 Mostrar texto e imágenes en una ventana
// Ejemplo de Objetos JLabel con texto e iconos (Main)

public class Main11_4 {

    public static void main( String args[] ){

        E11_4 marcoEtiqueta = new E11_4(); // crea objeto A11_4
        marcoEtiqueta.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoEtiqueta.setSize( 275, 180 );  // establece el tamaño del marco
        marcoEtiqueta.setVisible( true );  // muestra el marco

    }
}