import java.util.HashMap;
import java.util.Map;

public class Codificador {
    private CodificaStrategy codificador;

    public Codificador(CodificaStrategy tipo) {
        codificador = tipo;
    }

    public String codifica(String str) {
        return codificador.codifica(str);
    }

    public String decodifica(String str) {
        return codificador.decodifica(str);
    }
}