package actividadlibro;

import javax.swing.JFrame;

//11.14 Clases adaptadoras
// Ejemplo de Clics de los botones izquierdo, central y derecho del ratón (Main)

public class Main11_14 {

    public static void main( String args[] ){

        E11_14 marcoDetallesRaton = new E11_14();
        marcoDetallesRaton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoDetallesRaton.setSize( 400, 150 ); // establece el tamaño del marco
        marcoDetallesRaton.setVisible( true ); // muestra el marco
    }
    
}