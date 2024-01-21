public class Carro {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    private String modelo;
    private String placa;
    private double quilometrosRodados;
    private Cor corDoCarro;

    public void adicionarQuilometragem(int quilometros) {
        this.quilometrosRodados += quilometros;
    }

    public void mudarCorCarro (Cor corNovaDoCarro) {
        this.corDoCarro = corNovaDoCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getQuilometrosRodados() {
        return quilometrosRodados;
    }

    public void setQuilometrosRodados(double quilometrosRodados) {
        this.quilometrosRodados = quilometrosRodados;
    }

    public Cor getCorDoCarro() {
        return corDoCarro;
    }

    public void setCorDoCarro(Cor corDoCarro) {
        this.corDoCarro = corDoCarro;
    }
}