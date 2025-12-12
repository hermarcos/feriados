import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

public class FeriadosTest {
    @Test
    void cualquierDiaDeSemanaPuedeSerFeriado() {
        var calendarioDeFeriados = new CalendarioDeFeriados();
        var unDomingo = LocalDate.of(2024, Month.FEBRUARY, 25);
        calendarioDeFeriados.marcarDiaDeSemanaFeriado(DayOfWeek.SUNDAY);

        assertTrue(calendarioDeFeriados.esFeriado(unDomingo));
    }

    @Test
    void cualquierFechaPuedeNoSerFeriado() {
        var calendarioDeFeriados = new CalendarioDeFeriados();
        var unaFechaNoFeriado = LocalDate.of(2024, Month.FEBRUARY, 28);

        assertFalse(calendarioDeFeriados.esFeriado(unaFechaNoFeriado));
    }

    @Test
    void masDeUnDiaDeSemanaPuedenSerFeriadosALaVez() {
        var calendarioDeFeriados = new CalendarioDeFeriados();
        var unSabado = LocalDate.of(2024, Month.FEBRUARY, 24);
        var unDomingo = LocalDate.of(2024, Month.FEBRUARY, 25);
        calendarioDeFeriados.marcarDiaDeSemanaFeriado(DayOfWeek.SATURDAY);
        calendarioDeFeriados.marcarDiaDeSemanaFeriado(DayOfWeek.SUNDAY);

        assertTrue(calendarioDeFeriados.esFeriado(unSabado));
        assertTrue(calendarioDeFeriados.esFeriado(unDomingo));
    }

    @Test
    void cualquierDiaDeMesPuedeSerFeriado() {
        var calendarioDeFeriados = new CalendarioDeFeriados();
        var unaNavidad = LocalDate.of(2024, Month.DECEMBER, 25);
        calendarioDeFeriados.marcarDiaDeMesFeriado(MonthDay.from(unaNavidad));

        assertTrue(calendarioDeFeriados.esFeriado(unaNavidad));
    }
}
