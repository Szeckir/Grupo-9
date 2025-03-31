public class App {
    public static void main(String[] args) throws Exception {
        Validador validador = new Validador();


        String email = "bernardo.copstein@pucrs.br";
        boolean emailValido = validador.valida(Validador.Tipo.EMAIL, email);
        System.out.println("Email é valido?" + emailValido);

        String matricula = "23102448";
        boolean matriculaValida = validador.valida(Validador.Tipo.MATRICULA, matricula);
        System.out.println("Matricula valida?" + matriculaValida);

        String inteiro = "0000";
        boolean inteiroValida = validador.valida(Validador.Tipo.INTEIRO, inteiro);
        System.out.println("Inteiro valido?" + inteiroValida);
    }
}
