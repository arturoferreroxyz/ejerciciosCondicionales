package PaqueteInstituto;

public abstract class Humano {
    //Atributos
    String nombre;
    String edad;
    char sexo;

    //Costructores
    public Humano(String nombre, String edad, char sexo) {
            this.nombre=nombre;
            this.edad=edad;
            this.sexo=sexo;
    }

    //Metodos

    /**
     *
     * @return disponibilidad para estar en el instituto
     */
    abstract boolean disponibilidad();

}
