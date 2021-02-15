package com.qa.questions;

public class PeerProQ3 {

	 
    
    public static void Q3(int w, int t) {
        
        int[][] INArray = {{w,t}};
        int[][] WTArray = {{100, 80},{56, 67},{88,30},{150,40},{120,100}};
//        System.out.println(WTArray[0][0]);
//        int a= WTArray.length();
//        System.out.println(WTArray.length);
        for(int i=0;i<(WTArray.length);i++) {
            if(INArray[0][0]<=WTArray[i][0] && INArray[0][1]<=WTArray[i][1]) {
                System.out.println(i+1);
            }
            
        }
    }

 

}
 