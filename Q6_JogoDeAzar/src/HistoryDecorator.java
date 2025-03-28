public class HistoryDecorator implements Interface {
    private Interface dado;
    private int[] historico;
    private int index;

    public HistoryDecorator(Interface dado) {
        this.dado = dado; 
        this.historico = new int[10];
        this.index = 0;
    }

    @Override
    public void rolar() {
        dado.rolar();
        historico[index] = dado.getValor(); 
        index = (index + 1) % historico.length; 
    }

    @Override
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