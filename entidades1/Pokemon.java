package entidades1;

public class Pokemon {

    private int peso;
    private String color;
    private String habilidad;

    public Pokemon(int p, String c, String h){
        peso = p;
        color = c;
        habilidad = h;

    }

    // Metodos set y get de edad
        //Peso
    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
        //Habilidad
    public String getHabilidad(){
        return habilidad;
    }
    public void setHabilidad(String habilidad){
        this.habilidad = habilidad;
    }
        //Color
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}