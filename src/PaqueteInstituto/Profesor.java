package PaqueteInstituto;

public class Profesor extends Humano{
    //Atributos no heredados
    String materia;

    public Profesor(String nombre, String edad, char sexo, String materia) {
        super(nombre, edad, sexo);
        this.materia=materia;
    }

    /**
     *
     * @return hace un calculo aleatorio si esta disponible(20%)
     */
    @Override
    boolean disponibilidad() {
        int posibilidadDisponibilidad=(int)(Math.random()*100+1);
        if(posibilidadDisponibilidad<=20){
            return false;
        }else{
            return true;
        }
    }
    //Costructores
    //Metodos

}
