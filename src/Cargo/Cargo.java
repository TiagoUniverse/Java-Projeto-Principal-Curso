package Cargo;

import Senioriadade.Senioriedade;

public abstract class Cargo {
    protected String nome;
    protected double salario;
    protected String beneficios;
    protected Senioriedade senioriedade;

    public Cargo() {
        this.nome = "Desenvolvedor";
        this.salario = 50;
        this.beneficios = "Vale alimentação";
    }

    public abstract String getNome();

   public abstract double calcularSalario(int nivel);

   public abstract String beneficios();

   public Senioriedade getSenioriedade(){ return senioriedade;}
}

