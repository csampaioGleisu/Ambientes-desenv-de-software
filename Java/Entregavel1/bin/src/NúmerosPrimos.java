public class NúmerosPrimos {

    public static void main(String[] args) {
        for (int i = 2; i <= 200; i++) {
            if( Primo(i) )
                System.out.println(i + " é primo.");
        }
    }
//aqui a lógica irá mostrar quais são o números primos, podendo ser escolhido até que número ir, o exemplo é até 200.
    private static boolean Primo(int numero) {
        for (int p = 2; p < numero; p++) {
            if (numero % p == 0)
                return false;
        }
        return true;
    }
}