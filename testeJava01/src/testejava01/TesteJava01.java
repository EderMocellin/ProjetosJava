

package testejava01;

import java.util.Scanner;


public class TesteJava01 {

   
    public static void main(String[] args) {
        float n1,n2;
         
        Scanner entrada = new Scanner(System.in);
        System.out.println("****Faça a soma dos números****");
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextFloat();
        
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextFloat();
        
        float soma = n1 + n2;
        System.out.println("O resultado da soma é " + soma);
        
      
    }

}
