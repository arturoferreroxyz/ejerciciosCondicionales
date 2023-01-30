package PaqueteClases.PaqueteInterfaz;
public class Serie implements Entregable{
    //Constantes
    private static final int NUM_TEMPORADAS_DEF=3;
    private static final boolean ENTREGADO_DEF=false;
    //Atributos
    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;
    //Constructores

    /**
     * Solo numero temporadas y entregado tienen valores por defecto
     */
    public Serie(){
    this.titulo="";
    this.numeroDeTemporadas=NUM_TEMPORADAS_DEF;
    this.entregado=ENTREGADO_DEF;
    this.genero="";
    this.creador="";
    }
    /**
     * Salvo los parametros y los que usan CTES el resto por defecto
     * @param titulo
     * @param creador
     */
    public Serie(String titulo, String creador){
        this.titulo=titulo;
        this.numeroDeTemporadas=NUM_TEMPORADAS_DEF;
        this.entregado=ENTREGADO_DEF;
        this.genero="";
        this.creador=creador;
    }
    /**
     * El unico que no es parametro es el atributo entregado
     * @param titulo
     * @param numeroDeTemporadas
     * @param genero
     * @param creador
     */
    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador){
        this.titulo=titulo;
        this.numeroDeTemporadas=NUM_TEMPORADAS_DEF;
        this.entregado=ENTREGADO_DEF;
        this.genero="";
        this.creador=creador;
    }
    //Metodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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
        Serie parametroObjetoSerie=(Serie)a;
        if(this.getNumeroDeTemporadas()>parametroObjetoSerie.getNumeroDeTemporadas()){
            return this;
        } else if (this.getNumeroDeTemporadas()==parametroObjetoSerie.getNumeroDeTemporadas()) {
            return this;
        }else{
            return a;
        }
    }
}
