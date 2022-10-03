package Cifra;

import java.io.*;
import java.util.Scanner;

class Main
{
  public static void main (String[] args) throws java.lang.Exception
  {
	
	Scanner br = new Scanner(System.in);
    String input = br.nextLine();
    leitor(input);
  }
  public static void leitor(String alguma) {
	  char[] a= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	  char [] b;
	  for(int aux=0;aux<alguma.length();aux++) {
		  for(int i=0;i<26;i++) {
			  if(a[i]==alguma.charAt(aux)) {
				 System.out.print(a[(i%26)+3]);
				
		  }
	  }	
	  }
  }
}