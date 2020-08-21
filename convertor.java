
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.captain;
import java.util.Scanner;/**
 *
 * @author ACCSLASUS
 */
public class convertor{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
    System.out.println("Enter number of minutes");
    int minutes = sc.nextInt();
    int year = minutes/525600;
    int days = minutes/1440;
   int re_days =days%365;
          
    System.out.println(minutes+" minutes is approximately "+year+" years and "+re_days+" days"); // TODO code application logic here
    }
    
}
