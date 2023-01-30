package PaqueteClases.PaqueteElectrodomesticos;

public class Electrodomestico {
    //Constantes
    static final double PRECIO_BASE_DEF=100;
    static final String COLOR_DEF="blanco";
    static final char CONSUMO_ENERGETICO_DEF='F';
     static final double PESO_DEF=5;

    //Atributos
    double precioBase;//€
    String color;
    char consumoEnergetico;// (letras entre A y F)
    double peso;//Kg


    //Constructores
    /**
     * Constructor con todos los atributos por defecto
     */
    public Electrodomestico(){
    this.precioBase=PRECIO_BASE_DEF;
    this.color=COLOR_DEF;
    this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
    this.peso=PESO_DEF;
    }

    /**
     * Salvo los dos parametros de abajo, el resto van por defecto como el constructor por defecto
     * @param precioBase
     * @param peso
     */
    public Electrodomestico(double precioBase, double peso){
        this.precioBase=precioBase;
        this.peso=peso;
        //Atributos definidos por defecto
        this.color=COLOR_DEF;
        this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
    }

    /**
     *
     * @param precioBase
     * @param color se comprueba que sea del rango correcto
     * @param peso
     * @param consumoEnergetico se comprueba que sea del rango correcto
     */
    public Electrodomestico(double precioBase, String color, double peso, char consumoEnergetico){
        this.precioBase=precioBase;
        this.peso=peso;
        this.color=comprobarColor(color);
        this.consumoEnergetico=comprobarConsumoEnergetico(consumoEnergetico);
    }
    //Metodos
    public double getPrecioBase() {
        return precioBase;
    }
    public String getColor() {
        return color;
    }
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }

    /**
     *
     * @param cE caracter que define el tipo de consumo energetico del electrodomestico
     * @return si el char no es de A-F se devuelve por defecto F
     */
    public char comprobarConsumoEnergetico(char cE){
        if(cE=='A'||cE=='B'||cE=='C'||cE=='D'||cE=='E'||cE=='F'){
            return cE;
        }else {
            return CONSUMO_ENERGETICO_DEF;
        }
    }

    /**
     * @return "blanco", "negro", "rojo", "azul", "gris", si no pertenece a este rango, "blanco" por defecto
     */
    public String comprobarColor(String color){
        if(color=="blanco"||color=="rojo"||color=="azul"||color=="gris"){
            return color;
        }else {
            return COLOR_DEF;
        }
    }

    /**
     *
     * @return según el consumo energetico y tamanio aumentara su precio
     */
    public double precioFinal() {
        double precioF = getPrecioBase();
        switch (getConsumoEnergetico()) {
            case 'A':
                precioF += 100;
                break;
            case 'B':
                precioF += 80;
                break;
            case 'C':
                precioF += 60;
                break;
            case 'D':
                precioF += 50;
                break;
            case 'E':
                precioF += 30;
                break;
            case 'F':
                precioF += 10;
                break;
        }
        if (getPeso() >= 0 || getPeso() <= 19)
        {
            precioF += 10;
        } else if (getPeso() >= 20 || getPeso() <= 49)
        {
            precioF += 50;
        } else if (getPeso() >= 50 || getPeso() <= 79)
        {
            precioF += 80;
        } else if (getPeso() > 80)
        {
            precioF += 100;
        }
        return precioF;
    }

}
