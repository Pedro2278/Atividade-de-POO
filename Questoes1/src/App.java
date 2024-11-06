/*
 * Questão 1:
 * Crie uma classe em Java chamada Fatura para uma loja de suprimentos de informática. 
 * A classe deve conter quatro atributos: o número (String), a descrição (String), a quantidade comprada de um item (int) 
 * e o preço por item (double). A classe deve ter um construtor e um método get e set para cada variável de instância. 
 * Além disso, forneça um método chamado getTotalFatura que calcula o valor da fatura e depois retorna o valor como um double.
 * Se o valor não for positivo, ele deve ser configurado como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0.
 * Crie uma classe FaturaTeste (em outro arquivo com método main) que demonstra as capacidades da classe Fatura.
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Iniciando teste de Fatura...");
        FaturaTeste.executarTeste();
        System.out.println("Teste de Fatura concluído.");
    }
}
