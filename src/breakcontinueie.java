public class breakcontinueie {
    public static void main(String[] args) {
        
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue; //com break, ele vai até 2

            System.out.println(numero);
        }
    }
}
