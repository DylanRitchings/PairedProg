package com.qa.questions;

public class PeerProQ1 {

	public static void q1(int n) {
	    int reold=0;
	    int re=n;
	       
	    for(int i = 2; i < n; i++) {
	       
	       
	        re= re/i;
	       
	       
	        if(re==1) {
	            System.out.println(reold + "!");
	            break;
	        }
	        else if(reold%i!=0){
	           
	            System.out.println("None");
	            break;
	        }
	        else {
	            reold=re;
	            System.out.println(re);
	            continue;
	       
	    }}
	               
	       
	    }
	 
}
