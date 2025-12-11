import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarioDeFeriados {
    public boolean esFeriado(LocalDate unaFecha) {
        return unaFecha.getDayOfWeek().equals(DayOfWeek.SUNDAY);
    }
}
