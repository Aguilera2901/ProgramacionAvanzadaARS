package entidades1;

public class Calculadora {

    private int modelo;
    private String color;
    private String tipo;

    public Calculadora(int m, String c, String t){
        modelo = m;
        color = c;
        tipo = t;

    }

    // Metodos set y get de edad
            //Modelo
        public int getModelo(){
            return modelo;
        }
        public void setModelo(int modelo){
            this.modelo = modelo;
        }
            //Color
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
            //Tipo
        public String getTipo(){
            return tipo;
        }
        public void setTipo(String tipo){
            this.tipo = tipo;
        }

    
}