/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.captain;

/**
 *
 * @author ACCSLASUS
 */
public class matrixmultiplication {
     public static void main(String[] args) {
     int a[][]={{1,3,4},{2,4,3},{3,4,5}};  
int b[][]={{1,3,4},{2,4,3},{1,2,4}};  
int c[][]=new int[3][3];  
for(int i=0;i<3;i++){  
    for(int j=0;j<3;j++){  
    c[i][j]=a[i][j]*b[i][j];  
     System.out.print(c[i][j]+" ");  
     }  
     System.out.println();
}
            
    
    
    
}}
