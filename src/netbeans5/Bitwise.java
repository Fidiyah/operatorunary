/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans5;

/**
 *
 * @author asd
 */
public class Bitwise {
  public static void main(String[] args) {
      int x = 10; //dikonversikan ke biner = 0000 1100
      int y = 20; //dikonversikan ke biner = 0001 0100
      
      int z;
      z = x | y;
      System.out.println("Hasil operasi bitwise OR: " + z);
      
      z = x & y;
      System.out.println("Hasil operasi bitwise AND:" + z );
      
      z = x ^ y;
      System.out.println("Hasil operasi bitwise XOR:" + z) ;
      
      z = ~x;
      System.out.println("Hasil operasi bitwise shift left: " + z);
      
      z = x << 3;
      System.out.println("Hasil operasi bitwise shift right: " + z);
      
      
      
      
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }  
}
