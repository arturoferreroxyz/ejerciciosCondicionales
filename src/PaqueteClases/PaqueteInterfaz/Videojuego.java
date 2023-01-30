package PaqueteClases.PaqueteInterfaz;

public class Videojuego implements Entregable{
    //CONSTANTES
    private static final int HORAS_ESTIMADAS_DEF=10;
    private static final boolean ENTREGADO_DEF=false;
    //Atributos
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String company;
    //Constructores
    public Videojuego(){
        this.titulo="";
        this.horasEstimadas=HORAS_ESTIMADAS_DEF;
        this.entregado=ENTREGADO_DEF;
        this.genero="";
        this.company="";
    }

    public Videojuego(String titulo, int horasEstimadas){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.entregado=ENTREGADO_DEF;
        this.genero="";
        this.company="";
    }

    /**
     * Excepto entregado usa constante false
     * @param titulo
     * @param horasEstimadas
     * @param genero
     * @param company
     */
    public Videojuego(String titulo, int horasEstimadas, String genero, String company){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.entregado=ENTREGADO_DEF;
        this.genero="";
        this.company="";
    }
    //Metodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
    //Metodos de la interfaz Entregable
    @Override
    public void entregar() {
        this.entregado=false;
    }
    @Override
    public void devolver() {
        this.entregado=true;
    }
    @Override
    public boolean isEntregado() {
        return this.entregado;
    }
    @Override
    public Object compareTo(Object a) {
        //Hacemos un casting de objetos para usar el metodo get
        Videojuego parametroObjetoVideojuego=(Videojuego)a;
        if(this.getHorasEstimadas() > parametroObjetoVideojuego.getHorasEstimadas()){
           return this;
        } else if (this.getHorasEstimadas()==parametroObjetoVideojuego.getHorasEstimadas()) {
            return this;
        }else{
            return a;
        }
    }

}
