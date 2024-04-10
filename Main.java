import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //-------- 1 --------

        int indice = 13, soma = 0, k = 0;

        while(k < indice) {
            k++;
            soma = soma + k;
        }

        System.out.println(soma + "\n");

        //-------- 2 --------

        System.out.println("digite um número");
        int numeroFibonacci = scan.nextInt();
        int firstNumber = 0, secondNumber = 1;

        for(int i = 0; i <= numeroFibonacci;i++) {
            firstNumber = firstNumber + secondNumber;
            secondNumber = firstNumber - secondNumber;

            System.out.println(secondNumber);
            if(firstNumber == numeroFibonacci) {
                System.out.println("O número " + numeroFibonacci + " pertence a sequência");
                break;
            }

            if(firstNumber > numeroFibonacci){
                System.out.println("O número " + numeroFibonacci + " não pertence a sequência");
                break;
            }
        }

        //-------- 5 --------

        String stringInvertida = "";
        String stringPraInvercao = scan.next();

        for(int i = stringPraInvercao.length() - 1; i >= 0; i--) {
            System.out.println(stringPraInvercao.charAt(i));

            stringInvertida = stringInvertida + String.valueOf(stringPraInvercao.charAt(i));
        }
        System.out.println(stringInvertida);
    }
}
