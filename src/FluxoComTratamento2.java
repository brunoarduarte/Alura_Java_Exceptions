import com.sun.org.apache.bcel.internal.generic.NEW;

public class FluxoComTratamento2 {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao2 ex) {
            String msg = ex.getMessage();
            System.out.println(ex);
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao2 {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao2 {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao2("Deu muito ruim");
        // o método throw só funciona com exceções;
//        System.out.println("Fim do metodo2");
    }

}
