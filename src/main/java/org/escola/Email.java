package org.escola;

public class Email {

    private String endereco;


    public Email(String endereco) {
        if (endereco == null ||
            !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email Invelido");
        } else if (endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {}
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }

}

