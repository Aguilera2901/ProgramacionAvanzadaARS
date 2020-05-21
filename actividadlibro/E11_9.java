package actividadlibro;

import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 11.9 Botones que mantienen el estado 
//Ejemplo de Botones JCheckBox y eventos de los elementos 

public class E11_9 extends JFrame{

    private JTextField campoTexto; // muestra el texto en tipos de letra cambiantes
    private JCheckBox negritaJCheckBox; // para seleccionar/deseleccionar negrita
    private JCheckBox cursivaJCheckBox; // para seleccionar/deseleccionar cursiva
   
    // El constructor de Tema_11_9_A agrega objetos JCheckBox a JFrame
    public E11_9(){

        super( "Prueba de JCheckBox" );
        setLayout( new FlowLayout() ); // establece el esquema del marco
    
        // establece JTextField y su tipo de letra
        campoTexto = new JTextField( "Observe como cambia el estilo de tipo de letra", 20 );
        campoTexto.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
        add( campoTexto ); // agrega campoTexto a JFrame
    
        negritaJCheckBox = new JCheckBox( "Negrita" ); // crea casilla de verificación "negrita"
        cursivaJCheckBox = new JCheckBox( "Cursiva" ); // crea casilla de verificación "cursiva"
        add( negritaJCheckBox ); // agrega casilla de verificación "negrita" a JFrame
        add( cursivaJCheckBox ); // agrega casilla de verificación "cursiva" a JFrame
    
        // registra componentes de escucha para objetos JCheckBox
        ManejadorCheckBox manejador = new ManejadorCheckBox();
        negritaJCheckBox.addItemListener( manejador );
        cursivaJCheckBox.addItemListener( manejador );

    } 
    
    // clase interna privada para el manejo de eventos ItemListener
    private class ManejadorCheckBox implements ItemListener{

        private int valNegrita = Font.PLAIN; // controla el estilo de tipo de letra negrita
        private int valCursiva = Font.PLAIN; // controla el estilo de tipo de letra cursiva
    
        // responde a los eventos de casilla de verificación
        public void itemStateChanged( ItemEvent evento ){
            
            // procesa los eventos de la casilla de verificación "negrita"
            if ( evento.getSource() == negritaJCheckBox )
            valNegrita = negritaJCheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
    
            // procesa los eventos de la casilla de verificación "cursiva"
            if ( evento.getSource() == cursivaJCheckBox ) valCursiva = cursivaJCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN;
    
            // establece el tipo de letra del campo de texto
            campoTexto.setFont(
            new Font( "Serif", valNegrita + valCursiva, 14 ) );
        
        } 
    } 
    
}