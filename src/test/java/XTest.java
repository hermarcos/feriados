import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

public class XTest {
    @Test
    void test01() {
        var calendarioDeFeriados = new CalendarioDeFeriados();
        var unDomingo = LocalDate.of(2024, Month.FEBRUARY, 25);

        assertTrue(calendarioDeFeriados.esFeriado(unDomingo));
    }
}
