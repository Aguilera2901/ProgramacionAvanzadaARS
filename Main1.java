import entidades1.Alumno;
import entidades1.Profesor;
import entidades1.Animal;
import entidades1.Gato;
import entidades1.Conejo;
import entidades1.Reptil;
import entidades1.Calculadora;
import entidades1.Pokemon;
import entidades1.Automovil;

public class Main1{

    public static void main(String[] args){
        Alumno susana = new Alumno(18,"ipn",9.4);
        Profesor ana = new Profesor(30,"ipn","matematicas");
        Animal perro = new Animal(5,"macho","cafe",25.2);
        Gato nero = new Gato(2,"hembra","naranja",15);
        Conejo bunny = new Conejo(1,"macho","blanco",1.2);
        Reptil cocodrilo = new Reptil(3,"macho","verde",800);
        Calculadora uno = new Calculadora(1234433,"blanco","cientifica");
        Pokemon pikachu = new Pokemon(20,"amarillo","no");
        Automovil carro = new Automovil(2019,"verde","iooooi");

        susana.setEdad(10);
        ana.setMateria("español");
        perro.setColor("negro");
        nero.setEdad(5);
        bunny.setColor("gris");
        cocodrilo.setEdad(5);
        uno.setTipo("Basica");
        pikachu.setColor("Amerillo");
        carro.setAnio(2020);


        System.out.println();
    
    }

}