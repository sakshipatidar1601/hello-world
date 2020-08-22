/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.captain;
import java.util.Scanner;
/**
 *
 * @author ACCSLASUS
 */
public class ifelse {
     public static void main(String[] args) {
     int input ;
     System.out.println("Enter your age :");
     Scanner sc = new Scanner(System.in);
     input = sc.nextInt();
     if(input >= 18)
     System.out.println("you are eligible to vote.");
     
     
     else 
         System.out.println("you are not eligible to vote ");
     }
}
