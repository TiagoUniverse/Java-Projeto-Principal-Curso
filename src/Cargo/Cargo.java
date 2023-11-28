package Cargo;

public class Cargo {

    // Atributos
    public String nome;

    private double SalarioBase;

    public String beneficios;

    //Metodos

    public Cargo() {
        this.nome = "Desenvolvedor";
        SalarioBase = 50;
        this.beneficios = "Vale alimentação";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public double getSalarioBase(int i) {
        if (i == 1){
            return SalarioBase;
        } else {
            return 0;
        }
    }

    public  void verificarSalario(double SalarioBase){
        if (SalarioBase == 0){
            System.out.println("Você não tem acesso para ver o salário base!");
        } else {
            System.out.println(SalarioBase);
        }
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
}
