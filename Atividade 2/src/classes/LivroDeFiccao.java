package classes;

public class LivroDeFiccao extends Livro {
    private String genero;
    private String subgenero;

    public LivroDeFiccao(String titulo, String autor, int numeroPaginas, String genero, String subgenero) {
        super(titulo, autor, numeroPaginas);
        this.genero = genero;
        this.subgenero = subgenero;
    }

    public String sinopseDoLivro() {
        return "A sinopse deste livro é sobre " + genero + " e também " + subgenero + ".";
    }
    @Override
    public void informarDetalhes() {
        super.informarDetalhes();
        System.out.println("Gênero: " + genero);
        System.out.println("Subgênero: " + subgenero);
    }
}
