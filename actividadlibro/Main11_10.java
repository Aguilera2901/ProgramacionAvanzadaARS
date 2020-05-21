package actividadlibro;

import javax.swing.JFrame;

// 11.10 JComboBox y el uso de una clase interna anónima para el manejo de eventos
// Ejemplo de Objeto JComboBox que muestra una lista de nombres de imágenes (Main)

public class Main11_10 {

    public static void main( String args[] ){

    E11_10 marcoCuadroCombinado = new E11_10();
    marcoCuadroCombinado.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    marcoCuadroCombinado.setSize( 350, 150 ); // establece el tamaño del marco
    marcoCuadroCombinado.setVisible( true ); // muestra el marco

    }
    
}