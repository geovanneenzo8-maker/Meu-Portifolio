import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora---");

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite a operação +, -, *, /");
        char operacao = scanner.next().charAt(0);
        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        double resultado;

        switch (operacao){

        case'+':
            resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
            break;
            case'-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
            break;
            case'*':
                resultado= num1 * num2;
                System.out.println("Resultado: " + resultado);
            break;
            case'/':
                if(num2 !=0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Numero não divisíveis por 0");}
                break;

            default:
                System.out.println("Esta operação não consta na nossa base de dados");
    }
    scanner.close();
}}