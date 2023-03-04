public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Welton";
        String segundoNome = "Pereira";
        System.out.println("Nome completo: " + nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
