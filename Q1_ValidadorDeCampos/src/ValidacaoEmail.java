public class ValidacaoEmail implements ValidadorStrategy {
    @Override
    public boolean validar(String valor) {
        int posA = valor.indexOf('@');
        int posPt = valor.lastIndexOf('.');
        return posA > 0 && posPt > posA;
    }
}