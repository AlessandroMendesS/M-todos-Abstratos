package classes;

public class Administrativo extends Funcionario {
    private int horasExtras;

    public Administrativo(String nome, String rg, double salario) {
        super(nome, rg, salario);
        this.horasExtras = 0;
    }
    public void registrarHoraExtra(int horas) {
        horasExtras += horas;
    }
    @Override
    public double calcularHolerite() {
        double valorHoraExtra = salario / 100;
        return salario + (valorHoraExtra * horasExtras);
    }

    public int getHorasExtras() {
        return horasExtras;
    }
}