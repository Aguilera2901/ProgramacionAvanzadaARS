package actividadlibro;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

//11.18 Uso de paneles para administrar esquemas más complejos
//Ejemplo de Jpanel con cinco objetos JButton, en un esquema GridLayout adjunto a la región SOUTH de un 
// esquema BorderLayout

public class E11_18  extends JFrame{

    private JPanel panelBotones; // panel que contiene los botones
    private JButton botones[]; // arreglo de botones

    // constructor sin argumentos
    public E11_18(){

        super( "Demostracion de Panel" );
        botones = new JButton[ 5 ]; // crea el arreglo botones
        panelBotones = new JPanel(); // establece el panel
        panelBotones.setLayout( new GridLayout( 1, botones.length ) );

        // crea y agrega los botones
        for ( int cuenta = 0; cuenta < botones.length; cuenta++ ){

            botones[ cuenta ] = new JButton( "Boton " + ( cuenta + 1 ) );
            panelBotones.add( botones[ cuenta ] ); // agrega el botón al panel
        
        }

        add( panelBotones, BorderLayout.SOUTH ); // agrega el panel a JFrame

    }

    

}