public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    // Construtor
    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal);
    }

    // Métodos get e set para nome
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    // Métodos get e set para sobrenome
    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    // Métodos get e set para salarioMensal
    public double getSalarioMensal() { return salarioMensal; }
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = Math.max(salarioMensal, 0.0); // Define como 0 se o salário for negativo
    }

    // Método para calcular o salário anual
    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    // Método para aplicar aumento no salário
    public void aplicarAumento(double percentual) {
        salarioMensal += salarioMensal * percentual / 100;
    }
}
