package actividadlibro;

import javax.swing.JFrame;

// 11.13 Manejo de eventos de ratón
// Ejemplo de Manejo de eventos de ratón (Main)

public class Main11_13 {

    public static void main( String args[] ){
        
        E11_13 marcoRastreadorRaton = new E11_13();
        marcoRastreadorRaton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoRastreadorRaton.setSize( 300, 100 ); // establece el tamaño del marco
        marcoRastreadorRaton.setVisible( true ); // muestra el marco
    }
    
}