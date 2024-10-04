package classes;

public class LivroNaoFiccao extends Livro {
    private String tema;
    private String topico;

    public LivroNaoFiccao(String titulo, String autor, int numeroPaginas, String tema, String topico) {
        super(titulo, autor, numeroPaginas);
        this.tema = tema;
        this.topico = topico;
    }

    public String recomendarOutrosTitulos() {
        return "Considere ler livros sobre " + tema + " e que tratam de " + topico + ".";
    }

    @Override
    public void informarDetalhes() {
        super.informarDetalhes();
        System.out.println("Tema: " + tema);
        System.out.println("Tópico: " + topico);
    }
}
