public class Gerente extends Funcionario {
    private static final double BONUS_POR_CINQUENTA_HORAS = 0.10; // 10% de bônus
    private static final int HORAS_PARA_BONUS = 50;

    public Gerente(String nome, double salarioPorHora) {
        super(nome, salarioPorHora);
    }

    // Método para calcular a bonificação
    public double getBonificacao() {
        // Calcula quantas vezes o gerente trabalhou 50 horas
        int vezesBonus = getHorasTrabalhadas() / HORAS_PARA_BONUS;
        // Calcula o valor do bônus usando o método getter
        double bonus = vezesBonus * (getSalarioPorHora() * HORAS_PARA_BONUS) * BONUS_POR_CINQUENTA_HORAS;
        return bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + getBonificacao();
    }
}