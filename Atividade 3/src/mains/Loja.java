package mains;
import classes.*;

public class Loja {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Carlos Silva", "123456789", 1500.0);
        vendedor.registrarVenda(2000.0);
        vendedor.registrarVenda(3000.0);
        System.out.println("Nome vendedor: " + vendedor.getNome());
        System.out.println("Holerite do vendedor: " + vendedor.calcularHolerite());
        System.out.println("----------------------------------------------------------------");
        Administrativo administrativo = new Administrativo("Maria Oliveira", "987654321", 2000.0);
        administrativo.registrarHoraExtra(10);
        administrativo.registrarHoraExtra(5);
        System.out.println("Holerite do administrativo: " + administrativo.getNome());
        System.out.println("Holerite do administrativo: " + administrativo.calcularHolerite());
    }
}