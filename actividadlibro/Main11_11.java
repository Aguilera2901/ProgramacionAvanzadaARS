package actividadlibro;

import javax.swing.JFrame;

// 11.11 JList
// Ejemplo de Objeto JList que muestra una lista de colores (Main)

public class Main11_11 {

    public static void main( String args[] ){

        E11_11 marcoLista = new E11_11(); // crea objeto MarcoLista
        marcoLista.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoLista.setSize( 350, 150 ); // establece el tamaño del marco
        marcoLista.setVisible( true ); // muestra el marco

    }
    
}