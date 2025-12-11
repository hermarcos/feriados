import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarioDeFeriados {
    protected DayOfWeek diaDeSemanaFeriado;

    public boolean esFeriado(LocalDate unaFecha) {
        return unaFecha.getDayOfWeek().equals(diaDeSemanaFeriado);
    }

    public void marcarDiaDeSemanaFeriado(DayOfWeek unDiaDeSemana) {
        diaDeSemanaFeriado = unDiaDeSemana;
    }
}
