package entidades1;

public class Alumno {

    private int edad;
    private String escuela;
    private double promedio;

    public Alumno(int e, String s, double p){
        edad = e;
        escuela = s;
        promedio = p;

    }

    // Metodos set y get de edad
        //Edad
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
        //Escuela
    public String getEscuela(){
        return escuela;
    }
    public void setEscuela(String escuela){
        this.escuela = escuela;
    }
        //Promedio
    public double getPromedio(){
        return promedio;
    }
    public void setPromedio(double promedio){
        this.promedio = promedio;
    }
}