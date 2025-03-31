public class ValidacaoMatricula implements ValidadorStrategy {
    @Override
    public boolean validar(String valor) {
        // Verifica se todos os caracteres são dígitos
        for (int i = 0; i < valor.length(); i++) {
            if (!Character.isDigit(valor.charAt(i))) {
                return false;
            }
        }

        if (valor.length() < 2) return false;

        int soma = 0;
        for (int i = 0; i < valor.length() - 1; i++) {
            soma += Character.getNumericValue(valor.charAt(i));
        }
        int verificador = soma % 10;
        return verificador == Character.getNumericValue(valor.charAt(valor.length() - 1));
    }
}