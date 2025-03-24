import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Observer> observadores;
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

    public void addObserver(Observer observer)
    observadores.add(observer);
}

    public void notificar(){
        for(Observer observer : observadores){
            observadores.atualizar(get.valores());
        }
    }

