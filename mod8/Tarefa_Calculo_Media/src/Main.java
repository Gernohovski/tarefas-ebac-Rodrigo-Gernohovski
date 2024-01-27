public class Main {
    public static void main(String[] args) {
        Diciplinas historia = new Diciplinas();
        Alunos a1 = new Alunos("Roberto da Silva");
        a1.adicionarNotas();
        System.out.println(a1.calcularMedia());
    }
}
