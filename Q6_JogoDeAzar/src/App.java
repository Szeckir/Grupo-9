public class App {
    public static void main(String[] args) {
        Dado d6 = new Dado(6);
        HistoryDecorator hd6 = new HistoryDecorator(d6);

        hd6.rolar();
        hd6.rolar();
        hd6.rolar();

        hd6.getHistorico();
    }
}