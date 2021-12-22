public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {
        Conta c = new Conta(123, 321);
        try {
            c.deposita();
        } catch (MinhaExcecao2 ex) {
            System.out.println("tratamento ...");
        }
    }
}
