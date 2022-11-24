import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    void validarSomenteNoUsuarioAndre() {
        Assumptions.assumeTrue("André".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Hoarder")
    void validarSomenteNoUsuarioAndre2() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void validarSomenteNoUsuarioAndre3() {
        Assertions.assertEquals(10, 5 + 5);
    }
    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void validarSomenteNoUsuarioAndre4() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
