package PaqueteClases;

public class Persona {
    //Atributos

    //CONSTANTES
    //Sexo de la persona por defecto
    private static final char SEX_DEFINIDO='H';
    //CONSTANTES acordes a su indice de masa corporal
    public static final int MC_INFRAPESO=-1;
    public static final int MC_IDEAL=0;
    public static final int MC_SOBREPESO=1;
    //Variables
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    //Constructores
    /**
     * Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo
     * (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.
     */
    Persona(){
        setNombre(null);
        setEdad(0);
        //El DNI no sera escrito por defecto
        setSexo(SEX_DEFINIDO);
        setPeso(0);
        setAltura(0);
    }
    /**
     * Un constructor con el nombre, edad y sexo, el resto por defecto.
     */
    Persona(String n, int e, char s){
        setNombre(n);
        setEdad(e);
        this.dni=null;//Por defecto
        setSexo(s);
        setPeso(0);
        setAltura(0);
    }
    /**
     * Un constructor con todos los atributos pedidos por parametro.
     * @param n nombre
     * @param e edad
     * @param d dni
     * @param s sexo
     * @param p peso
     * @param a altura
     */
    public Persona(String n, int e, String d, char s, double p, double a) {
        setNombre(n);
        setEdad(e);
        this.dni = d;
        setSexo(s);
        setPeso(p);
        setAltura(a);
    }
    //Metodos
    /**
     * calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m))
     *  si esta fórmula devuelve un valor menor que 20, la funcion devuelve un -1,
     *  si devuelve un numero entre 20 y 25 (incluidos),
     *  significa que esta por debajo de su peso ideal la funcion devuelve un 0
     *  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la funcion devuelve un 1
     * @return
     */
    public double devolverMC(double peso, double altura){
        double masaCorporal=peso/(altura*altura);
        if(masaCorporal<20){
            return MC_INFRAPESO;
        }else if(masaCorporal>=20 || masaCorporal<=25){
            return MC_IDEAL;
        }else if(masaCorporal>25){
            return MC_SOBREPESO;
        }
        return masaCorporal;
    }
    /**
     *
     * @param edad edad de la persona
     * @return booleano que corresponde a si es mayor de edad(18)
     */
    public boolean esMayorDeEdad(int edad){
        if(edad>=19) {
            return true;
        }else{
            return false;
        }
    }
    /**
     *
     * @param sexo
     * @return comprueba si el parametro sexo es correcto('H'/'M'), sino se devuelve 'H'
     */
    public char comprobarSexo(char sexo){
        if(sexo=='H' || sexo=='M'){
            return sexo;
        }else {
            return 'H';
        }
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    /**
     * @return genera un numero aleatorio de 8 cifras, genera a partir de este su numero su letra correspondiente.
     * Este metodo sera invocado cuando se construya el objeto. Puedes dividir el metodo para que te sea más facil.
     * No sera visible al exterior.
     *
     */
    public String generarDNI(){//de forma aleatoria
        int numero=(int)(Math.random()*10000000);
        //Calcular letra del dni
        //Corresponde a todas las letras posibles que hay en un dni
        String totalLetrasDni="TRWAGMYFPDXBNJZSQVHLCKE";
        String letra=totalLetrasDni.substring((numero%23)-1,numero%23);
        String dni=numero+""+letra;
        //Ahora pondremos los numeros a la izquierda que pueden faltar en el dni
        int contadorCifras=0;
        while(numero>0){
            numero/=10;
            contadorCifras++;
        }
        //Ahora usaremos el contador de cifras para contar los ceros que se necesitan para completar el dni
        while(contadorCifras<8)
        {
            dni="0"+dni;
            contadorCifras++;
        }
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
