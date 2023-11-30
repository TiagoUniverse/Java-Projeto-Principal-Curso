package Cargo;

import Interfaces.Beneficios;
import Senioriadade.Senioriedade;

public class CargoSenior extends Cargo implements Beneficios {

    public CargoSenior() {
        super();
        this.senioriedade = Senioriedade.SENIOR;
    }

    @Override
    public String getNome() { return super.nome + " " + senioriedade.name(); }

    @Override
    public double calcularSalario() { return salario + (20 * senioriedade.ordinal()); }

    @Override
    public String beneficios() { return null; }

    // Direto da Interface
    @Override
    public String obterBeneficios() { return beneficios + ", GymPass"; }
}

