package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailComEnderecoInvalido() {
        assertThrows(IllegalArgumentException.class,
                     () -> new Email(null));
    }

    {
        assertThrows(IllegalArgumentException.class,
                     () -> new Email(""));
    }

    {
        assertThrows(IllegalArgumentException.class,
                     () -> new Email("emailInvalido"));
    }

    @Test
    void deveriaCriarEmailComEnderecoValido() {
        String emailValido = "meuemail@gmail.com";
        Email emails = new Email(emailValido);
        assertTrue(true, emailValido);

    }

}



