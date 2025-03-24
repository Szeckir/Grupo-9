public class App {
    public static void main(String[] args) {
        DadoDecorator d6 = new DadoDecorator(6);
        HistoryDecorator hd6 = new HistoryDecorator(d6, 20);

        hd6.rolar();
        hd6.rolar();
        hd6.rolar();

        hd6.getHistorico();
    }
}
