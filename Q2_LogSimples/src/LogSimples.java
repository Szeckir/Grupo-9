import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Iterable<String>{
    private static LogSimples instancia;
    private List<String> mensagens;

    public static LogSimples getInstance(){
        if (instancia == null) {
            instancia = new CodificadorFactory();
        }
        return instancia;
    }

    private LogSimples(){
        mensagens = new LinkedList<>();
    }

    public void log(String m){
        String logM = LocalDate.now().toString() + " : " + m;
        mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }
}
