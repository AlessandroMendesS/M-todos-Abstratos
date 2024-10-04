package mains;
import classes.*;


public class Biblioteca {
    public static void main(String[] args) {
        LivroDidatico livroDidatico = new LivroDidatico("Matemática Moderna", "John Doe", 200, "Matemática", 9, "Fundamental");
        livroDidatico.informarDetalhes();
        System.out.println("Compatível com nível Fundamental: " + livroDidatico.verificarCompatibilidade("Fundamental"));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        LivroDeFiccao livroFiccao = new LivroDeFiccao("Guerra nas Estrelas", "Jane Doe", 350, "Ficção Científica", "Espacial");
        livroFiccao.informarDetalhes();
        System.out.println(livroFiccao.sinopseDoLivro());
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        LivroNaoFiccao livroNaoFiccao = new LivroNaoFiccao("O Mundo da Matemática", "Albert Smith", 150, "Matemática", "Números Complexos");
        livroNaoFiccao.informarDetalhes();
        System.out.println(livroNaoFiccao.recomendarOutrosTitulos());
    }
}
