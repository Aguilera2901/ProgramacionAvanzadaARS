package entidades1;

public class Reptil {

    private int edad;
    private String genero;
    private String color;
    private double peso;

    public Reptil(int e, String g, String c, double p){
        edad = e;
        genero = g;
        color = c;
        peso = p;   
    }

    // Metodos set y get de edad
            //Edad
        public int getEdad(){
            return edad;
        }
        public void setEdad(int edad){
            this.edad = edad;
        }
            //Genero
        public String getGenero(){
            return genero;
        }
        public void setGenero(String genero){
            this.genero = genero;
        }
            //Color
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
            //Peso
        public double getPeso(){
            return peso;
        }
        public void setPeso(double peso){
            this.peso = peso;
        } 
    
}