package actividadlibro;

import javax.swing.JFrame;

//11.17 Administradores de esquemas
//Ejemplo de FlowLayout permite a los componentes fl uir a través de varias líneas (Main)

public class Main11_17 {

    public static void main( String args[] ){

        E11_17 marcoFlowLayout = new E11_17();
        marcoFlowLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoFlowLayout.setSize( 350, 75 ); // establece el tamaño del marco
        marcoFlowLayout.setVisible( true ); // muestra el marco
    }
    
}