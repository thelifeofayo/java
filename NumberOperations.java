/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;
import java.util.Scanner;
/**
 *
 * @author AJIBADE AYOBAMI
 */
public class NumberOperations {
    public static void addNumber(int a ,int b){
        int sum;
        sum = a + b;
        System.out.println("addition of two numbers is " +sum);
    }
 public static void subNumber(int a ,int b){
        int sub;
        sub = a - b;
        System.out.println("subtraction of two numbers is " +sub);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("please enter first number");
        num1 = input.nextInt();
        System.out.println("please enter second number");
         num2 = input.nextInt();
         addNumber(num1,num2);
    }
}