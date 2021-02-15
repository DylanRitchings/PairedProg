package com.qa.questions;

public class PeerProQ2 {
	public static void q2(int n) {
	       
	       
        for (int i=1;i<101;i++) {
           
            if (n==i) {
                System.out.println("");
            }else {
                if(11<=i && 13>=i){
                    System.out.println(i + "th");
                   
                }
                else if(i ==1 | 1==i%10) {
                    System.out.println(i + "st");
                   
                }else if (i==2 | 2==i%10) {
                    System.out.println(i + "nd");
                }else if(i==3 | 3==i%10) {
                    System.out.println(i + "rd");
                }else {
                    System.out.println(i + "th");
                }
           
            }
        }
       
	}
}
