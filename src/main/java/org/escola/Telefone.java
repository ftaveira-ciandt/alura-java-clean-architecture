package org.escola;

public class Telefone {

    private String ddd;

    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e Numero sao obrigadtorios!");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException(("Numero invalido!"));
        }

        if (!numero.matches("\\d{8} |\\d{9} ")) {
            throw new IllegalArgumentException("Numero invalido!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }



    public String getDdd() {
        return String.valueOf(0);
    }

    public String getNumero() {
        return String.valueOf(0);
    }

}

