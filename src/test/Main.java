package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++){ //5줄 생성 
            for(int j=4; j>i; j--){ //삼각형 별을 출력하기 위해 공백 생성  
                System.out.print(" ");
            }
            for(int j=1; j<=2*i+1; j++) { //각행의 홀수(삼각형줄) 만큼 별출력 
                System.out.print("*");
            }
            System.out.println();
        }
		
		 for (int i = 0; i < 4; i++) { //4줄 출력
	            for (int j = 0; j <= i; j++) { //삼각형 별을 출력하기 위해 공백 생성  
	                System.out.print(" ");
	            }
	            for (int j = 7 ; j >= i*2+1; j--) { //각행의 홀수(삼각형줄) 만큼 별출력
	                System.out.print("*");
	            }
	            System.out.println();
	      }
		 
		 
		 for (int i=0; i<5; i++) {
			 for( int j=4; j>i; j--) {
				 System.out.println(" ");
			 }
			 for (int j=1; j<=2*i+1; j++) {
				 System.out.println("*");
			 }
			 System.out.println();
		 }
		 for (int i=0; i<4; i++) {
			 for (int j=0; j<=i; j++) {
				 System.out.println(" ");
			 }
			 for (int j=7; j>=2*i+1; j--) {
				 System.out.println("*");
			 }
			 System.out.println();
		 }
		 
		 
		 for (int i=0; i<5; i++) {
			 for (int j=4; j>=i; j--) {
				 System.out.println(" ");
			 }
			 for (int j=1; j<=2*i+1; j++ ) {
				 System.out.println("*");
			 }
			 System.out.println();
		 }
		 
		 for (int i=0; i<4; i++) {
			 for (int j=0; j<=i; j++) {
				 System.out.println(" ");
			 }
			 for (int j=7; j>=(2*i)+1; j--) {
				 System.out.println("*");
			 }
			 System.out.println();
		 }
		 }
//		 
//		for (int i=0; i<5; i++) {
//			for (int j=5; j>i; j--) {
//				System.out.println(" ");
//			for (int k=1; k<(2*i)+1; k++) {
//				System.out.println("*");
//			}
//			System.out.println();
//			
//			}
//		}
//		for (int i=0; i<4; i++) {
//			for (int j=1; j<i; j++) {
//				System.out.println(" ");
//			}
//			for (int k=7; k>(2*i)-1; k--) {
//				System.out.println("*");
//			}
//		}

//		for(int i=1; i<10; i+=2){   
//			  for(int j=9; j>i; j-=2){ 
//				  System.out.print(" ");
//			  }
//			  for (int j=0; j<i; j++) {
//				  System.out.print("*");
//			  
//			    }
//
//			System.out.println();
//
//			  }
//		
//		for(int i=1; i<10; i+=2){   
//			  for(int j=0; j<i; j+=2){ 
//				  System.out.print(" ");
//			  }
//			  for (int j=8; j>i; j--) {
//				  System.out.print("*");
//
//			}
//			  System.out.println();
//	}
	}

