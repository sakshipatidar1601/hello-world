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
public class employee {
  private String name, address;
  private int year;
  public employee(String n, int y,  String add){
    name = n;
    year = y;
    address = add;
  }
  public String getName(){
    return name;
  }
  public int getYear(){
    return year;
  }
  
  public String getAddress(){
    return address;
  }

}
class main{
  public static void main(String[] args){
    employee e1 = new employee ("Robert", 1994,"64C- WallsStreet");
    employee  e2 = new employee ("Sam",2000,"68D- WallsStreet");
    employee  e3 = new employee ("John", 1999,"26B- WallsStreet");
    System.out.println("Name\tYear of joining \tAddress");
    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t"+e1.getAddress()); 
    System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t"+e2.getAddress()); 
    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t"+e3.getAddress());  
  }
}
