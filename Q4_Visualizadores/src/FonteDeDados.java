import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<iObserver> observadores;
    private List<Integer> lst;

    public FonteDeDados(){
        lst = new LinkedList<>();
        observadores = new ArrayList<>();
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }

    public void addObserver(iObserver observer)
    observadores.add(observer);
}

    public void notificar(){
        for(iObserver observer : observadores){
            observadores.atualizar(get.valores());
        }
    }

