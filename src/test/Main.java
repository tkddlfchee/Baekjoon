package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 // 테스트 케이스 입력 값 저장
        int index = sc.nextInt();
        
        // 테스트 케이스 개수만큼 반복
        for (int i = 0; i < index; i++) {
            // 반복 출력 횟수 저장
            int reqeat = sc.nextInt();
            // 반복 출력할 문자열 저장
            String str = sc.next();
            
            // 문자열 길이만큼 반복, 한글자씩 세분화 반복 
            for (int j = 0; j < str.length(); j++) {
                // 반복 출력 횟수 만큼 반복
                for (int r = 0; r < reqeat; r++) {
                    System.out.print(str.charAt(j));
                }
            }
            // 줄바꿈
            System.out.println();
        }
    }
}
//		for(int i=0; i<5; i++){ //5줄 생성 
//            for(int j=4; j>i; j--){ //삼각형 별을 출력하기 위해 공백 생성  
//                System.out.print(" ");
//            }
//            for(int j=1; j<=2*i+1; j++) { //각행의 홀수(삼각형줄) 만큼 별출력 
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//		
//		 for (int i = 0; i < 4; i++) { //4줄 출력
//	            for (int j = 0; j <= i; j++) { //삼각형 별을 출력하기 위해 공백 생성  
//	                System.out.print(" ");
//	            }
//	            for (int j = 7 ; j >= i*2+1; j--) { //각행의 홀수(삼각형줄) 만큼 별출력
//	                System.out.print("*");
//	            }
//	            System.out.println();
//	      }
//		 
//		 
//		 for (int i=0; i<5; i++) {
//			 for( int j=4; j>i; j--) {
//				 System.out.println(" ");
//			 }
//			 for (int j=1; j<=2*i+1; j++) {
//				 System.out.println("*");
//			 }
//			 System.out.println();
//		 }
//		 for (int i=0; i<4; i++) {
//			 for (int j=0; j<=i; j++) {
//				 System.out.println(" ");
//			 }
//			 for (int j=7; j>=2*i+1; j--) {
//				 System.out.println("*");
//			 }
//			 System.out.println();
//		 }
//		 
		 
//		 for (int i=0; i<5; i++) {
//			 for (int j=4; j>i; j--) {
//				 System.out.print(" ");
//			 }
//			 for (int j=1; j<=2*i+1; j++ ) {
//				 System.out.print("*");
//			 }
//			 System.out.println();
//		 }
//		 
//		 for (int i=0; i<4; i++) {
//			 for (int j=0; j<=i; j++) {
//				 System.out.print(" ");
//			 }
//			 for (int j=7; j>=(2*i)+1; j--) {
//				 System.out.print("*");
//			 }
//			 System.out.println();
//		 }
//		 }
////		 
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
	

