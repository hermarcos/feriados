import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class CalendarioDeFeriados {
    protected final Set<DayOfWeek> diasDeSemanaFeriados = new HashSet<>();

    public boolean esFeriado(LocalDate unaFecha) {
        return diasDeSemanaFeriados.contains(unaFecha.getDayOfWeek());
    }

    public void marcarDiaDeSemanaFeriado(DayOfWeek unDiaDeSemana) {
        diasDeSemanaFeriados.add(unDiaDeSemana);
    }
}
