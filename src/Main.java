import Cargo.Cargo;

public class Main {
    public static void main(String[] args) {

    Cargo desenvolvedor = new Cargo();

        System.out.println(desenvolvedor.getNome());
        desenvolvedor.verificarSalario(desenvolvedor.getSalarioBase(1));
        System.out.println(desenvolvedor.getBeneficios());

        desenvolvedor.setNome("Web Design");
        desenvolvedor.setBeneficios("GymPass");

        System.out.println(desenvolvedor.getNome());
        desenvolvedor.verificarSalario(desenvolvedor.getSalarioBase(0));
        System.out.println(desenvolvedor.getBeneficios());

    }
}