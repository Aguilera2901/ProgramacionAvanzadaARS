import entidades.Persona;

public class Main{
    public static void main(String[] args){
    Persona beto = new Persona(30,170,85.5);
    Persona martha = new Persona(15,150,55);
    Persona jose = new Persona(18,170,67);
    Persona juan = new Persona(11,160,60);
    Persona fer = new Persona(80,170,79);
    Persona ana = new Persona(35,177,70);
    
    beto.edad = 20;
    martha.peso = 60.5;
    jose.altura = 160;
    juan.edad = 50;
    fer.peso = 50.1;
    ana.altura = 180;

        System.out.println();
}
}