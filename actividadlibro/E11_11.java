package actividadlibro;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

// 11.11 JList
// Ejemplo de Objeto JList que muestra una lista de colores

public class E11_11  extends JFrame{

    private JList listaJListColores; // lista para mostrar colores
    private final String nombresColores[] = { "Negro", "Azul", "Cyan", 
        "Gris oscuro", "Gris", "Verde", "Gris claro", "Magenta", 
        "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo" };
    private final Color colores[] = { Color.BLACK, Color.BLUE, Color.CYAN,
        Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY,
        Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE,
        Color.YELLOW };

    // El constructor de MarcoLista agrega a JFrame el JScrollPane que contiene a JList
    public E11_11(){

        super( "Prueba de JList" );
        setLayout( new FlowLayout() ); // establece el esquema del marco

        listaJListColores = new JList( nombresColores ); // crea con nombresColores
        listaJListColores.setVisibleRowCount( 5 ); // muestra cinco filas a la vez

        // no permite selecciones múltiples
        listaJListColores.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );

        // agrega al marco un objeto JScrollPane que contiene a JList
        add( new JScrollPane( listaJListColores ) );

        listaJListColores.addListSelectionListener(new ListSelectionListener(){// clase interna anónima

            // maneja los eventos de selección de la lista
            public void valueChanged( ListSelectionEvent evento ){
                getContentPane().setBackground(colores[ listaJListColores.getSelectedIndex() ] );

            }

        }
        ); 


    }


    
}