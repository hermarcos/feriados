import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

public class CalendarioDeFeriados {
    protected final Set<DayOfWeek> diasDeSemanaFeriados = new HashSet<>();
    protected final Set<MonthDay> diasDeMesFeriados = new HashSet<>();

    public boolean esFeriado(LocalDate unaFecha) {
        return diasDeSemanaFeriados.contains(unaFecha.getDayOfWeek()) ||
                diasDeMesFeriados.contains(MonthDay.from(unaFecha));
    }

    public void marcarDiaDeSemanaFeriado(DayOfWeek unDiaDeSemana) {
        diasDeSemanaFeriados.add(unDiaDeSemana);
    }

    public void marcarDiaDeMesFeriado(MonthDay unDiaDeMes) {
        diasDeMesFeriados.add(unDiaDeMes);
    }
}
