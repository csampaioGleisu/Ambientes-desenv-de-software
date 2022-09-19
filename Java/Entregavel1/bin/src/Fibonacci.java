public class Fibonacci {
    
        static long fibonacci(int n) {
            if (n < 2) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    
        public static void main(String[] args) {
    
            // no exemplo ele executa a estrutura de repetição até o número desejado no caso 10 vezes
            for (int i = 0; i < 10; i++) {
                System.out.print("(" + i + "):" + Fibonacci.fibonacci(i) + "\t");
            }
    
        }
    }
