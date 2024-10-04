package classes;

public class Aluno extends Pessoa {
    private int numero_matricula;
    private String nome_do_curso;

    public Aluno(String nome, int idade) {
        super(nome, idade);
    }
    public Aluno(String nome, int idade, int numero_matricula, String nome_do_curso) {
        super(nome, idade);
        this.numero_matricula = numero_matricula;
        this.nome_do_curso = nome_do_curso;
    }
    public int getNumero_matricula() {
        return numero_matricula;
    }
    public void setNumero_matricula(int numero_matricula) {
        this.numero_matricula = numero_matricula;
    }

    public String getNome_do_curso() {
        return nome_do_curso;
    }
    public void setNome_do_curso(String nome_do_curso) {
        this.nome_do_curso = nome_do_curso;
    }

    @Override
    public void mostrarDados() {
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(this.numero_matricula);
        System.out.println(this.nome_do_curso);

    }


}
