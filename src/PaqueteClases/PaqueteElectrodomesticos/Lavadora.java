package PaqueteClases.PaqueteElectrodomesticos;

public class Lavadora extends Electrodomestico{
    //Constantes
    static final double PESOCARGA_DEF=5;
    //Atributos no heredados
    double carga;// Kg
    //Constructores
    /**
     *Tambien se inicializan los atributos heredados de clase padre Electrodomestico
     */
    public Lavadora(){
        //Atributos por defecto heredados
         super.precioBase=PRECIO_BASE_DEF;
         super.color=COLOR_DEF;
         super.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
         super.peso=PESO_DEF;
        //Atributos por defecto no heredados
        carga=PESOCARGA_DEF;


    }
    /**
     * Salvo los dos parametros de abajo, el resto van por defecto como el constructor por defecto
     * @param precioBase
     * @param peso
     */
    public Lavadora(double precioBase, double peso){
        super.precioBase=precioBase;
        super.peso=peso;
        //Atributos heredados definidos por defecto
        super.color=COLOR_DEF;
        super.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        //Atributos por defecto no heredados
        carga=PESOCARGA_DEF;
    }

    /**
     *Parametros heredados de superclase Electrodomestico
     * @param precioBase
     * @param color
     * @param peso
     * @param consumoEnergetico
     * Parametros no heredados
     * @param carga
     */
    public Lavadora(double precioBase, String color, double peso, char consumoEnergetico, double carga){
        super.precioBase=precioBase;
        super.peso=peso;
        super.color=comprobarColor(color);
        super.consumoEnergetico=comprobarConsumoEnergetico(consumoEnergetico);
        //No heredados
        this.carga=carga;
    }
    //Metodos
    public double getCarga() {
        return carga;
    }

    /**
     *
     * @return si tiene una carga mayor de 30 kg, aumentara el precio 50 €,
     * sino es asi no se incrementara el precio. Llama al método padre y aniade el código necesario.
     * Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
     */
    public double precioFinal(){
        if(getCarga()>30){
            return super.precioFinal()+50;
        }
        return super.precioFinal();
    }
}
