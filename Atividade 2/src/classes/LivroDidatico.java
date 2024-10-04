package classes;

public class LivroDidatico extends Livro {
    private String disciplina;
    private int anoEscolar;
    private String nivelEnsino;

    public LivroDidatico(String titulo, String autor, int numeroPaginas, String disciplina, int anoEscolar, String nivelEnsino) {
        super(titulo, autor, numeroPaginas);
        this.disciplina = disciplina;
        this.anoEscolar = anoEscolar;
        this.nivelEnsino = nivelEnsino;
    }

    public boolean verificarCompatibilidade(String nivel) {
        return this.nivelEnsino.equals(nivel);
    }

    @Override
    public void informarDetalhes() {
        super.informarDetalhes();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Ano Escolar: " + anoEscolar);
        System.out.println("Nível de Ensino: " + nivelEnsino);
    }
}
