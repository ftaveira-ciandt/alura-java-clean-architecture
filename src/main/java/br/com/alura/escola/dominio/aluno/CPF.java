package br.com.alura.escola.dominio.aluno;

public class CPF {

    private String numero;

    public CPF(String numero) {
        if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF Invalido!");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

}
