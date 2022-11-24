import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class AssertionsTeste {

    @Test
    void validarLancamentos() {

        int[] primeiro = {10, 20, 30, 40, 50};
        int[] segundo = {-1, 5, 2, 3, 10, 16, 17};

        assertNotEquals(primeiro, segundo);
    }

    @Test
    void validarSeObjetoEstanulo() {
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.now());
    }

    @Test
    void validarTiposDeNumeros() {
        double valor = 5.0;
        double outroValor = 5.0;
        assertEquals(valor, outroValor);
    }
}
