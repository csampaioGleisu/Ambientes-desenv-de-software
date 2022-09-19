 import java.util.Scanner;


 public class MDC {

        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            int numero1 = 15;
            int numero2 = 48;
            int resto;
            int aux;

            //aqui a lógica será mudada caso seja alterado os números no int número 1 e 2.

            if ( numero1 < numero2 ) {
                aux = numero1;
                numero1 = numero2;
                numero2 = aux;
            }

            resto = numero1 % numero2;

            while ( resto != 0 ) {
                numero1 = numero2;
                numero2 = resto;
                resto = numero1 % numero2;
            }

            System.out.println( " O MDC é: " + numero2);
            scanner ler.close();
        }
    }
    

