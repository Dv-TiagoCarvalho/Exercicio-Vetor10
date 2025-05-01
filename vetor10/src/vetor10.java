import java.util.Arrays;
import java.util.Scanner;

public class vetor10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int [] vetor = new int[10];

        System.out.println("Digite 10 valores");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
      
        }

        int n = vetor.length;
        boolean trocado;

        for (int i = 0; i < vetor.length; i++) {
            trocado = false;

            for (int j = 0; j < n- i -1; j++) {

                if (vetor[j]>vetor[j+1]) {

                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                    trocado = true;      
             }
                
            }
            if (!trocado) {
                break;
                
       }
            
     }

        System.out.println("\nVetor original: " + Arrays.toString(vetor));
        System.out.println("Vetor ordem crescente: " + Arrays.toString(vetor));
        scanner.close();
       
    }
}
