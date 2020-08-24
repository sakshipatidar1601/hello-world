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
public class primenumbers {
      public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("please enter a value");
    int a =sc.nextInt();
    boolean isprime = true;
    for(int i=2;i<a;i++){
    if(a%i==0){
    isprime = false;
            break;
    }}
        if(isprime)
        {System.out.println(a+" is a prime number");
        }

        else
        { System.out.println(a+" is not a prime number");}
    
}
}