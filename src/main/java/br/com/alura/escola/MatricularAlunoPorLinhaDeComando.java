package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

    public static void main(String[] args) {
        String nome = "fulano da silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

    MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
    matricular.executa(new MatricularAlunoDTO(nome, cpf, email));
    }

}
