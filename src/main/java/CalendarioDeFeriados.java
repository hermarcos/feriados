import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

public class CalendarioDeFeriados {
    protected final Set<DayOfWeek> diasDeSemanaFeriados = new HashSet<>();
    protected final Set<MonthDay> diasDeMesFeriados = new HashSet<>();

    public boolean esFeriado(LocalDate unaFecha) {
        return esDiaDeSemanaFeriado(unaFecha) || esDiaDeMesFeriado(unaFecha);
    }

    private boolean esDiaDeMesFeriado(LocalDate unaFecha) {
        return diasDeMesFeriados.contains(MonthDay.from(unaFecha));
    }

    private boolean esDiaDeSemanaFeriado(LocalDate unaFecha) {
        return diasDeSemanaFeriados.contains(unaFecha.getDayOfWeek());
    }

    public void marcarDiaDeSemanaFeriado(DayOfWeek unDiaDeSemana) {
        diasDeSemanaFeriados.add(unDiaDeSemana);
    }

    public void marcarDiaDeMesFeriado(MonthDay unDiaDeMes) {
        diasDeMesFeriados.add(unDiaDeMes);
    }
}
