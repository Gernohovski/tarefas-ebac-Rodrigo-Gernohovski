import java.util.ArrayList;
import java.util.List;

public class Diciplinas {
    List<Alunos> alunosCadastrados;

    public Diciplinas() {
        alunosCadastrados = new ArrayList<>();
    }

    public void adicionarAluno(Alunos aluno) {
        alunosCadastrados.add(aluno);
    }

    public void removerAluno(Alunos aluno) {
        alunosCadastrados.remove(aluno);
    }
}


