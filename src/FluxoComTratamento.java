import com.sun.org.apache.bcel.internal.generic.NEW;

public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println(ex);
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new ArithmeticException("Deu ruim");
        // o método throw só funciona com exceções;
//        System.out.println("Fim do metodo2");
    }

}
