package Cargo;

import Interfaces.Beneficios;
import Senioriadade.Senioriedade;

public class CargoPleno extends Cargo implements Beneficios {

    public CargoPleno() {
        super();
        this.senioriedade = Senioriedade.PLENO;
    }

    @Override
    public String getNome() { return super.nome + " " + senioriedade.name(); }

    @Override
    public double calcularSalario(int nivel) {
        if (nivel == 1){
            return salario + (10 * senioriedade.ordinal());
        } else {
            System.err.println("Acesso negado!");
            return 0;
        }

    }

    @Override
    public String beneficios() { return null; }

    // Direto da Interface
    @Override
    public String obterBeneficios() { return beneficios; }
}

