package PaqueteClases;

/**
 * Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
 *
 * El titular sera obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
 *
 * Crea sus metodos get, set y toString.
 *
 * Tendrá dos metodos especiales:
 *
 *    - ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa,
 *     no se hará nada.
 *    - retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual
 *     a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
 */
public class Cuenta{
    //Atributos
    private String titular;
    private double cantidad;
    //Constructores
    Cuenta(String t){
    this.setTitular(t);
    }
    Cuenta(String t, double c){
        this.setTitular(t);
        this.setCantidad(c);
    }
    //Metodos
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    /**
     *se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hara nada.
     * @param c
     */
    public void ingresar(double c){
        if(c>=0){
            this.cantidad+=c;
        }
    }
    /**
     *se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa,
     * la cantidad de la cuenta pasa a ser 0.
     * @param c
     */
    public void retirar(double c){
        if((this.cantidad-c)<0){
            this.cantidad=0;
        }else{
            this.cantidad-=c;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}

