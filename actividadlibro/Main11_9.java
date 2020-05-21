package actividadlibro;

import javax.swing.JFrame;

// 11.9 Botones que mantienen el estado 
//Ejemplo de Botones JCheckBox y eventos de los elementos (Main)

public class Main11_9 {
    
    public static void main( String args[] ){

        E11_9 marcoCasillaVerificacion = new E11_9();
        marcoCasillaVerificacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoCasillaVerificacion.setSize( 350, 100 ); // establece el tamaño del marco
        marcoCasillaVerificacion.setVisible( true ); // muestra el marco
    }
}