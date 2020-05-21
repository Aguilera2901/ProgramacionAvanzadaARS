package actividadlibro;

import javax.swing.JOptionPane;  // el programa usa JOptionPane

// 11.3 Entrada/salida simple basada en GUI con JOptionPane 
// Ejemplo de Suma

public class E11_2{
    
    public static void main( String args[] ){

        // obtiene la entrada del usuario de los diálogos de entrada de JOptionPane
        String primerNumero = JOptionPane.showInputDialog( "Introduzca el primer entero" );
        String segundoNumero = JOptionPane.showInputDialog( "Introduzca el segundo entero" );

        // convierte las entradas String en valores int para usarlos en un cálculo
        int numero1 = Integer.parseInt( primerNumero ); 
        int numero2 = Integer.parseInt( segundoNumero );

        int suma = numero1 + numero2;  // suma números

        // muestra los resultados en un diálogo de mensajes de JOptionPane  
        JOptionPane.showMessageDialog( null, "La suma es " + suma, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE );
    }
}