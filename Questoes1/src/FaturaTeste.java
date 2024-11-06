public class FaturaTeste {
    public static void executarTeste() {
        Fatura fatura = new Fatura("123", "Teclado Mecânico", 2, 150.0);

        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por Item: " + fatura.getPrecoPorItem());
        System.out.println("Total da Fatura: " + fatura.getTotalFatura());

        fatura.setQuantidade(-3);
        fatura.setPrecoPorItem(-200.0);
        System.out.println("\nApós definir valores não positivos:");
        System.out.println("Quantidade: " + fatura.getQuantidade()); // Deve ser 0
        System.out.println("Preço por Item: " + fatura.getPrecoPorItem()); // Deve ser 0.0
        System.out.println("Total da Fatura: " + fatura.getTotalFatura()); // Deve ser 0.0
    }
}
