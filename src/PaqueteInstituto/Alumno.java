package PaqueteInstituto;

public class Alumno extends  Humano{
    //Atributos no heredados
    byte calificacionActual;

    public Alumno(String nombre, String edad, char sexo, byte calificacionActual) {
        super(nombre, edad, sexo);
        this.calificacionActual=calificacionActual;
    }
    /**
     *
     * @return hace un calculo aleatorio si esta disponible(50%)
     */
    @Override
    boolean disponibilidad() {
        int posibilidadDisponibilidad=(int)(Math.random()*100+1);
        if(posibilidadDisponibilidad<=50){
            return false;
        }else{
            return true;
        }
    }
    //Costructores
    //Metodos
}
