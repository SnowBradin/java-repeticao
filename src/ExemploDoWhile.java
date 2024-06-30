import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            //executado até alguém atender
            System.out.println("Telefone tocando");
        }while(tocando());
        System.out.println("Alô, Leo!!!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //aqui, para de tocar
        return ! atendeu;
    }
}
