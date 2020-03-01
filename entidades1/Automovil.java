package entidades1;

public class Automovil {

    private int anio;
    private String color;
    private String modelo;

    public Automovil(int a, String c, String m){
        anio = a;
        color = c;
        modelo = m;

    }

    // Metodos set y get de edad
            //Año
        public int getAnio(){
            return anio;
        }
        public void setAnio(int anio){
            this.anio = anio;
        }
            //Color
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }
            //Modelo
        public String getModelo(){
            return modelo;
        }
        public void setModelo(String modelo){
            this.modelo = modelo;
        }
    
}