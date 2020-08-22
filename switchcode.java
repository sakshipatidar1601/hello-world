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
public class switchcode {
     public static void main(String[] args) {
     int choice;
     System.out.println("Pick one : 1.hi\t2.hey\t3.hello\t");
     Scanner sc = new Scanner(System.in);
     choice = sc.nextInt();
     switch(choice){
         case 1: System.out.println("you said hi");
         break;
         case 2 : System.out.println("you said hey");
         break;
         case 3:System.out.println("you said hello");
         break;
         default : System.out.println("invalid choice");
     }
     }
}
