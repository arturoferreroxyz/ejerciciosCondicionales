package PaqueteClases.PaqueteElectrodomesticos;

public class Television extends Electrodomestico{
    //CONSTANTES
    protected static final int RESOLUCION_DEF=20;
    protected static final boolean SINTONIZADOR_TDT_DEF=false;
    //Atributos
    int resolucion;//En pulgadas
    boolean sintonizadorTDT;
    //Constructores

    /**
     * Todos los atrobutos tanto heredados como no heredados con valores por defecto usando ctes
     */
    public Television(){
        //Atributos por defecto heredados
        super.precioBase=PRECIO_BASE_DEF;
        super.color=COLOR_DEF;
        super.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        super.peso=PESO_DEF;
        //Atributos por defecto no heredados
        this.resolucion=RESOLUCION_DEF;
        this.sintonizadorTDT=SINTONIZADOR_TDT_DEF;
    }

    /**
     *Salvo los dos parametros, el resto tanto heredados como no heredados con valores por defecto usando ctes
     * @param precioBase
     * @param peso
     */
    public Television(double precioBase, double peso){
        super.precioBase=precioBase;
        super.peso=peso;
        //Atributos heredados definidos por defecto
        super.color=COLOR_DEF;
        super.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
        //Atributos por defecto no heredados
        this.resolucion=RESOLUCION_DEF;
        this.sintonizadorTDT=SINTONIZADOR_TDT_DEF;
    }

    /**
     *
     * @param precioBase
     * @param color
     * @param peso
     * @param consumoEnergetico
     * @param resolucion
     * @param sintonizadorTDT
     */
    public Television(double precioBase, String color, double peso, char consumoEnergetico, int resolucion, boolean sintonizadorTDT){
        super(precioBase, color, peso, consumoEnergetico);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
    //Metodos
    public int getResolucion() {
        return resolucion;
    }
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    /**
     *
     * @return precio final que incluye las pauta de la clase padre
     */
    @Override
    public double precioFinal() {
        //Variable que almacena el precio a partir de clase Electrodomestico y permite almacenar el del TV
        double precioFinal=super.precioFinal();
        if(this.resolucion>40){
            precioFinal*=1.4;
        }
        if(this.sintonizadorTDT==true){
            precioFinal+=40;
        }
        return precioFinal;
    }
}
