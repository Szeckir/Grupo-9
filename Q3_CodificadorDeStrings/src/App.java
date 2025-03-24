public class App {
    public static void main(String[] args) throws Exception {
        Codificador codSimples = new Codificador(new Simples());
        Codificador codDesloca = new Codificador(new Desloca());
        String aux = "Desafio Padrões de Projeto";

        System.out.println(aux =  codSimples.codifica((aux)));
        System.out.println(aux = codSimples.decodifica((aux)));

        System.out.println(aux = codDesloca.codifica((aux)));
        System.out.println(aux = codDesloca.decodifica((aux)));
    }
}
