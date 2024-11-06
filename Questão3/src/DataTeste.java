public class DataTeste {
    public static void main(String[] args) {
        // Criando dois objetos da classe Data
        Data data1 = new Data(10, 12, 2024);  // Data 10/12/2024
        Data data2 = new Data(5, 7, 2023);    // Data 5/7/2023

        // Exibindo as datas
        System.out.print("Data 1: ");
        data1.displayData();  // Exibe 10/12/2024

        System.out.print("Data 2: ");
        data2.displayData();  // Exibe 5/7/2023

        // Modificando a data com os métodos set
        data1.setDia(15);
        data1.setMes(11);
        data1.setAno(2025);

        // Exibindo a data alterada
        System.out.print("Data 1 alterada: ");
        data1.displayData();  // Exibe 15/11/2025
    }
}
