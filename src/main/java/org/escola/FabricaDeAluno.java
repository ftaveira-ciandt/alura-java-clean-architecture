package org.escola;

public class FabricaDeAluno {

    private Aluno aluno;



    public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero) {
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }

    public static void main(String[] args) {
        FabricaDeAluno fabrica = new FabricaDeAluno();
        fabrica.comNomeCPFEmail("Francisco", "111.222.333-22", "francisco.taveira@aluno.com.br" )
               .comTelefone("31", "999999999");
    }

}
