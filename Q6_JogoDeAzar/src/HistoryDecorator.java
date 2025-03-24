public class HistoryDecorator implements Dado {
    private DadoDecorator dado;
    private int[] historico;
    private int index;

    public HistoryDecorator(Dado dado, int lados) {
        this.dado = dado;
        this.historico = new int[10];
        this.index = 0;
    }

    public void rolar() {
        dado.rolar();
        historico[index] = dado.getValor();
        index = index + 1;
    }

    public int getValor() {
        return dado.getValor();
    }

    public int[] getHistorico() {
        System.out.print("Historico: ");
        for (int i = 0; i < historico.length; i++) {
            System.out.print(historico[i] + " ");
        }
        return historico;
    }
}
