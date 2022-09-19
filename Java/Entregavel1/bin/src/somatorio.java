public class somatorio {
    public static void main(String[] args) {
        int array[] = new int[] {129,01,5,21,48,22};
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma+=array[i];
        }
        // A lógica desse somatorio é somat todos os números de dentro do array.
        System.out.println("Resultado da soma = "+soma);
    }
}