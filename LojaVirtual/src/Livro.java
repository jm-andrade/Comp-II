import java.util.Objects;

public class Livro extends ArtigoCultural {

    private final int codigoISBN;

    private String titulo;

    private String autor;

    private String editora;

    private int anoPublicacao;
    private Categoria categoria;

    private int numeroDePaginas;

    public Livro(int codigoISBN,
                 String titulo, String autor, String editora, int anoPublicacao, Categoria categoria) {

        super(codigoISBN,
                String.format("Livro: %s (%s, %d)",
                titulo, autor, anoPublicacao));

        this.codigoISBN = codigoISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
    }

    public String getCategoria () {return this.categoria.getCodigo();

    }
    public  void  setCategoria(Categoria categoria){ this.categoria = categoria;

    }

    public int getCodigoISBN() {
        return codigoISBN;
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Código ISBN: " + getCodigoISBN() +
                "\nTítulo: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nEditora: " + getEditora() +
                "\nAno de publicação: " + getAnoPublicacao() +
                "\nNúmero de páginas: " + getNumeroDePaginas() +
                "\nCategoria: " + getCategoria();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro1 = (Livro) o;

        return Objects.equals(this.codigoISBN, livro1.codigoISBN) &&
                Objects.equals(this.categoria, livro1.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoISBN, categoria);
    }

}
