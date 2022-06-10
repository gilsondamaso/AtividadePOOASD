import java.util.Scanner;

import classes.Calculadora;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();;
        Calculadora c = new Calculadora();
        int opcao;

        do {
            System.out.println("ATIVIDADE ADS");
            System.out.println("--------------------");
            System.out.println("1 - CÁLCULO IMC");
            System.out.println("2 - CALCULADORA");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("INFORME SEU NOME: ");
                    sc.nextLine();
                    p.setNome(sc.nextLine());
                    System.out.println("INFORME SEU PESO: ");
                    p.setPeso(sc.nextDouble());
                    System.out.println("INFORME SUA ALTURA: ");
                    p.setAltura(sc.nextDouble());                    
                    p.ResultadoIMC();
                    break;
                
                case 2:
                    c.OperacoesCalculadora();
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
