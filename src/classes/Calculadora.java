package classes;

import java.util.Scanner;

public class Calculadora {
    
    private double valor1;
    private double valor2;    

    public void OperacoesCalculadora() {
        Scanner sc = new Scanner(System.in);
        char operacao;        

        do {
            System.out.println("QUAL OPERAÇÃO DESEJA RESOLVER");
            System.out.println("+ - SOMA");
            System.out.println("- - SUBTRAÇÃO");
            System.out.println("/ - DIVISÃO");
            System.out.println("* - MULTIPLICAÇÃO");
            System.out.println("p - POTENCIAÇÃO");
            System.out.println("f - FATORIAL");
            System.out.println("S - SAIR");
        
            operacao = sc.next().charAt(0);
            switch (operacao) {
                case '+':
                    System.out.println("INFORME O PRIMEIRO VALOR: ");
                    setValor1(sc.nextDouble());
                    System.out.println("INFORME O PRIMEIRO VALOR: ");
                    setValor2(sc.nextDouble());
                    System.out.println("A SOMA DOS NÚMEROS É: " + (valor1 + valor2));
                    break;
                case '-':
                    System.out.println("INFORME O PRIMEIRO VALOR: ");
                    setValor1(sc.nextDouble());
                    System.out.println("INFORME O PRIMEIRO VALOR: ");
                    setValor2(sc.nextDouble());
                    System.out.println("A SOMA DOS NÚMEROS É: " + (valor1 - valor2));
                    break;
                case '*':
                    System.out.println("INFORME O PRIMEIRO VALOR: ");
                    setValor1(sc.nextDouble());
                    System.out.println("INFORME O PRIMEIRO VALOR: ");
                    setValor2(sc.nextDouble());
                    System.out.println("A SOMA DOS NÚMEROS É: " + (valor1 * valor2));
                    break;
                case '/':
                    System.out.println("INFORME O PRIMEIRO VALOR: ");
                    setValor1(sc.nextDouble());
                    System.out.println("INFORME O PRIMEIRO VALOR: ");
                    setValor2(sc.nextDouble());
                    System.out.println("A SOMA DOS NÚMEROS É: " + (valor1 / valor2));
                    break;
                case 'p':
                    System.out.println("INFORME O VALOR DA BASE: ");
                    setValor1(sc.nextDouble());
                    int base = (int) getValor1();
                    System.out.println("INFORME O VALOR DA POTÊNCIA: ");
                    setValor2(sc.nextDouble());
                    int pot = (int) getValor2();
                    System.out.println("A POTENCIAÇÃO DA BASE INFORMADO É: " + (int) Math.pow(base,pot));
                    break;
                case 'f':
                    System.out.println("INFORME O VALOR QUE DESEJA CALCULAR O FATORIAL: ");
                    setValor1(sc.nextDouble());
                    int fat = 1;
                    for( int i = 1; i <= getValor1(); i++ ) {
                        fat *= i;
                    }
                    System.out.println( "O FATORIAL DE " + (int) getValor1() + " É: " + fat );     
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }   
        } while (operacao != 'S' || operacao != 's');
        sc.close();

    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
}
