
import java.util.Scanner;

public class Lista10 {
 public static void main(String[] args) throws Exception{
   //Declaração de Variaveis
    double fahrenheit;
    double celsius;

   //Passo 1: Entrada de Dados  
    Scanner teclado = new Scanner(System.in);
    System.out.print("Celcius:");
    celsius  = teclado.nextDouble();
   

   //Passo 2: Converter celsius para fahrenheit

   fahrenheit =  (celsius * 1.8) + 32; 

   //Passo 3: Saida de dados
    System.out.printf("Fahrenheit: " + fahrenheit );
    teclado.close();

    }
}
