import java.util.Scanner;

public class Alunos {
    private float[] notaProva;
    private String nome;

    public Alunos(String nome) {
       notaProva = new float[4];
       setNome(nome);
    }

    public void adicionarNotas () {
        int aux = 0;
        Scanner sc = new Scanner(System.in);
        while (aux < 4) {
            System.out.println("Digite a " + (aux+1) + "º nota");
            notaProva[aux] = sc.nextFloat();
            aux++;
        }
        sc.close();
    }

    public float calcularMedia() {
        int aux = 0;
        float cont = 0;
        while (aux < 4) {
            cont = cont +  notaProva[aux];
            aux++;
        }
        return (float) (cont/4.0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
