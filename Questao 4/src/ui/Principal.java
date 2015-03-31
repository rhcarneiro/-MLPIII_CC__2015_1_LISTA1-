package ui;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
	    
		String TEXT= scanf.next(), test = "";
		int valor=0, x;	
	    
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher(TEXT);
		
		for (x=0;matcher.find();x++) {
		  if(x==0){
			  x = matcher.start();
		  }
		  if(x == matcher.start()){
			  test += matcher.group();
			  continue;
		  }
			 x = matcher.start();
			 valor += Integer.parseInt(test);
			 test = "";
			 test += matcher.group();	    	 	    	 
		}
		valor += Integer.parseInt(test);
		System.out.println("valor: " + valor);
		
		
		}
}
