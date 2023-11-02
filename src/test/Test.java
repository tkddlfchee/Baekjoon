package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        int r = sc.nextInt();
        String s = sc.next();
        
        for (int i=0; i<r; i++) {
        	r  += s.charAt(i);
        	
          
        }
        System.out.println(r);
        
//		String krstr = "안녕하세요";
//		
//		for (int i=0; i<krstr.length(); i++) {
//			char c = krstr.charAt(i);
//			System.out.print(str.repeat(c));
//		}
	

		
           
    }

	}
	


