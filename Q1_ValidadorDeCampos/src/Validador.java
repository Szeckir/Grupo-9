import java.util.HashMap;
import java.util.Map;

public class Validador{
    public enum Tipo { EMAIL, INTEIRO, MATRICULA }

    private final Map<Tipo, ValidadorStrategy> strategy = new HashMap<>();

    public Validador() {
        strategy.put(Tipo.EMAIL, new ValidacaoEmail());
        strategy.put(Tipo.INTEIRO, new ValidacaoInteiro());
        strategy.put(Tipo.MATRICULA, new ValidacaoMatricula());
    }

    public boolean valida(Tipo tipo, String valor) {
        ValidadorStrategy Strategy = strategy.get(tipo);
        return Strategy != null && Strategy.validar(valor);
    }
}

    

