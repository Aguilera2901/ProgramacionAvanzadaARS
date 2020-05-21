package actividadlibro;

import javax.swing.JFrame;

// 11.12 Listas de selección múltiple
// Ejemplo de Objeto JList que permite selecciones múltiples (Main)

public class Main11_12 {
    
    public static void main( String args[] ){

        E11_12 marcoSeleccionMultiple = new E11_12();
        marcoSeleccionMultiple.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE );
        marcoSeleccionMultiple.setSize( 350, 140 ); // establece el tamaño del marco
        marcoSeleccionMultiple.setVisible( true ); // muestra el marco
    }
}