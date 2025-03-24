import java.util.Random;

public class DadoDecorator implements Dado {
    private int lados;
    private int valorJogada;
    private final Random random;

    public DadoDecorator(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;
    }

    public int getValor() {
        return valorJogada;
    }
}