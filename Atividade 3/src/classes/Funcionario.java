package classes;

public abstract class Funcionario {
    protected String nome;
    protected String rg;
    protected double salario;

    public Funcionario(String nome, String rg, double salario) {
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
    }

    public abstract double calcularHolerite();

    public String getNome() {
        return nome;
    }
    public String getRg() {
        return rg;
    }
    public double getSalario() {
        return salario;
    }
}