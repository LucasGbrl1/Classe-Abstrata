public abstract class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private double salarioPorHora;

    public Funcionario(String nome, double salarioPorHora) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        horasTrabalhadas = 0;
    }

    public void adicionarHoras(int horas) {
        horasTrabalhadas += horas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    // Método para calcular o salário com base nas horas trabalhadas
    public double calcularSalario() {
        return getHorasTrabalhadas() * salarioPorHora;
    }
    
    protected double getSalarioPorHora() {
        return salarioPorHora;
    }
}