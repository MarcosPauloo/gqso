
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BancoprojetoTest {
    Banco_projeto banc = new Banco_projeto();
    @Test
    void saldo() {

    }

    @Test
    void deposito() {
        assertEquals(0, banc.deposito(-30));
    }

    @Test
    void saque() {
        assertEquals(0, banc.saque(-35));
    }
}