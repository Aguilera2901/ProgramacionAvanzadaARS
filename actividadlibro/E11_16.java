package actividadlibro;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//11.16 Manejo de eventos de teclas
//Ejemplo de Manejo de eventos de teclas

public class E11_16 extends JFrame implements KeyListener{

    private String linea1 = ""; // primera línea del área de texto
    private String linea2 = ""; // segunda línea del área de texto
    private String linea3 = ""; // tercera línea del área de texto
    private JTextArea areaTexto; // área de texto para mostrar la salida

    // constructor de MarcoDemoTeclas
    public E11_16(){

        super( "Demostración de los eventos de pulsacion de teclas" );

        areaTexto = new JTextArea( 10, 15 ); // establece el objeto JTextArea
        areaTexto.setText( "Oprima cualquier tecla en el teclado..." );
        areaTexto.setEnabled( false ); // deshabilita el área de texto
        areaTexto.setDisabledTextColor( Color.BLACK ); // establece el color del texto
        add( areaTexto ); // agrega areaTexto a JFrame
        
        addKeyListener( this ); // permite al marco procesar los eventos de teclas
    
    }
    
    // maneja el evento de oprimir cualquier tecla
    public void keyPressed( KeyEvent evento ){

        linea1 = String.format( "Tecla oprimida: %s", evento.getKeyText( evento.getKeyCode() ) ); // imprime la tecla oprimida
        establecerLineas2y3( evento ); // establece las líneas de salida dos y tres

    }

    // maneja el evento de liberar cualquier tecla
    public void keyReleased( KeyEvent evento ){

        linea1 = String.format( "Tecla liberada: %s",evento.getKeyText( evento.getKeyCode() ) ); // imprime la tecla liberada
        establecerLineas2y3( evento ); // establece las líneas de salida dos y tres
    
    }

    // maneja el evento de oprimir una tecla de acción
    public void keyTyped( KeyEvent evento ){

        linea1 = String.format( "Tecla oprimida: %s", evento.getKeyChar() );
        establecerLineas2y3( evento ); // establece las líneas de salida dos y tres

    }

    // establece las líneas de salida dos y tres
    private void establecerLineas2y3( KeyEvent evento ){

        linea2 = String.format( "Esta tecla %s es una tecla de accion",( evento.isActionKey() ? "" : "no " ) );
 
        String temp = evento.getKeyModifiersText( evento.getModifiers() );
 
        linea3 = String.format( "Teclas modificadoras oprimidas: %s",( temp.equals( "" ) ? "ninguna" : temp ) ); // imprime modificadoras

        areaTexto.setText( String.format( "%s\n%s\n%s\n", linea1, linea2, linea3 ) ); // imprime tres líneas de texto
    }

    

}