public class EmpregadoTeste {
    public static void main(String[] args) {
        // Criando dois objetos Empregado
        Empregado empregado1 = new Empregado("João", "Silva", 2500.0);
        Empregado empregado2 = new Empregado("Maria", "Santos", 3000.0);

        // Exibindo o salário anual de cada empregado
        System.out.println("Salário anual de " + empregado1.getNome() + ": " + empregado1.getSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + ": " + empregado2.getSalarioAnual());

        // Aplicando aumento de 10%
        empregado1.aplicarAumento(10);
        empregado2.aplicarAumento(10);

        // Exibindo o novo salário anual de cada empregado
        System.out.println("\nApós aumento de 10%:");
        System.out.println("Salário anual de " + empregado1.getNome() + ": " + empregado1.getSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + ": " + empregado2.getSalarioAnual());
    }
}
