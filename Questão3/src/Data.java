public class Data {
    // Variáveis de instância
    private int mes;
    private int dia;
    private int ano;

    // Construtor que inicializa as variáveis
    public Data(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    // Métodos get e set para cada variável de instância
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para exibir a data no formato: dia/mês/ano
    public void displayData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
