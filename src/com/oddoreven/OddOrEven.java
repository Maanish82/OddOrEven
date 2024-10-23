package com.oddoreven;

import java.util.Scanner;

public class OddOrEven {

     public Boolean isEven(int number) {
    	 
    	 
    	 return (number % 2 == 0) ? true : false;
    	 
//    	 Boolean isEven = false;
//    	 if(number % 2 == 0) {
//    		 isEven = true;
//    	 }
//    	 
//    	 return isEven;
     }
	 public int getIntegerNumberFromUserKeyboard() {
		 int numberFromUserKeyboard = 0;
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Introduce your integer number: ");
		 
		 numberFromUserKeyboard = scan.nextInt();
		
		 scan.close();
		
		 
		 
		 return numberFromUserKeyboard;
	 }

}
