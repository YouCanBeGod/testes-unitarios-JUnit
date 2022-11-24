import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoIdade() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(22, jessica.getIdade());
    }

    @Test
    void validarMaioridade() {
        Pessoa julia = new Pessoa("Julia", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(julia.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDate.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
