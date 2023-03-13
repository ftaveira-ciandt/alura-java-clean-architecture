package org.escola;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CPFTest {
    @Test
    void naoDeveriaAceitarCpfInvalido() {
        assertThrows(IllegalArgumentException.class,
                     () -> new CPF(null));
    }

    {
        assertThrows(IllegalArgumentException.class,
                     () -> new CPF(""));
    }

    {
        assertThrows(IllegalArgumentException.class,
                     () -> new CPF("123"));
    }

    @Test
    void deveriaAceitarCpfValido() {
        String numero = "123.456.789-99";
        CPF cpf = new CPF(numero);
        assertEquals(numero, cpf.getNumero());
    }


}