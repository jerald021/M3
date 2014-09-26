/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m3;
import java.util.Scanner;

/**
 *
 * @author ismael
 */
public class M3 {
    public static void main(String args[]) {
        int num1;
        int num2;
        int result;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce los dos operandos y el resultado");
        
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        result = teclado.nextInt();
        
        System.out.println(num1 * num2 == result);
    }
}