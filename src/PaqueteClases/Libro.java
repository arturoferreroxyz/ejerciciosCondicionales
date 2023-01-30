package PaqueteClases;

public class Libro {
    //Atributos
    String isbn;
    String titulo;
    String autor;
    int numPaginas;
    //Constructores
    public Libro(){
    this.isbn="";
    this.titulo="";
    this.autor="";
    this.numPaginas=0;
    }
    public Libro(String titulo, int numPaginas){
        this.isbn="";
        this.titulo=titulo;
        this.autor="";
        this.numPaginas=numPaginas;
    }
    public Libro(String isbn, String titulo, String autor, int numPaginas){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.numPaginas=numPaginas;
    }
    //Metodos

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    //////////////////////////////////
    @Override
    public String toString() {//El libro con ISBN creado por el autor tiene página
        return "El libro "+getTitulo()+" con ISBN "+getIsbn()+" creado por el autor "+getAutor()+" tiene "+getNumPaginas()+" paginas";
    }
}
