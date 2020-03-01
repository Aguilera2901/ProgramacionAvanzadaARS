package entidades1;

public class Profesor {

    private int edad;
    private String escuela;
    private String materia;

    public Profesor(int e, String es, String m){
        edad = e;
        escuela = es;
        materia = m;

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
            //Materia
        public String getMateria(){
            return materia;
        }
        public void setMateria(String materia){
            this.materia = materia;
        }    
}