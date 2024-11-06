/*
 * Questão 2:
 * Crie uma classe em Java chamada Empregado que inclui três informações: nome (String), sobrenome (String) e um salário mensal (double). 
 * A classe deve ter um construtor, métodos get e set para cada atributo. Escreva uma classe principal chamada EmpregadoTeste 
 * que cria dois objetos Empregado e exibe o salário anual de cada objeto. Então, dê a cada Empregado um aumento de 10% 
 * e exiba novamente o salário anual de cada Empregado.
 */

public class App {
    public static void main(String[] args) {
        // Criando dois objetos Empregado
        Empregado empregado1 = new Empregado("João", "Silva", 2500.0);
        Empregado empregado2 = new Empregado("Maria", "Santos", 3000.0);

        // Exibindo o salário anual de cada empregado
        System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " + empregado1.getSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " + empregado2.getSalarioAnual());

        // Aplicando aumento de 10%
        empregado1.aplicarAumento(10);
        empregado2.aplicarAumento(10);

        // Exibindo o novo salário anual de cada empregado
        System.out.println("\nApós aumento de 10%:");
        System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " + empregado1.getSalarioAnual());
        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " + empregado2.getSalarioAnual());
    }
}
