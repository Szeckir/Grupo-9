public class App {
    public static void main(String[] args) throws Exception {
        LogSimples log = getInstance();
        log.log("Mensagem de alerta 1");
        log.log("Mensagem de alarme 23");
        log.log("Mensagem de PANICO!!");

        LogSimples log2 = getInstance();

        for(String m:log){
            System.out.println(m);
        }

        for(String m:log2){
            System.out.println(m);
        }
    }
}
