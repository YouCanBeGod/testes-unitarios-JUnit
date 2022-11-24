import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validaExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("Hoarder", 0d);
        Conta contaDestino = new Conta("God", 100d);

        TranferenciaEntreContas transferencia1 = new TranferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferencia1.transfere(contaOrigem, contaDestino, -123d));
    }

    @Test
    void validaExcecaoNaTransferencia2() {
        Conta contaOrigem = new Conta("Hoarder", 0d);
        Conta contaDestino = new Conta("God", 100d);

        TranferenciaEntreContas transferencia1 = new TranferenciaEntreContas();

        Assertions.assertDoesNotThrow(() ->
                transferencia1.transfere(contaOrigem, contaDestino, 100d));
    }

}
