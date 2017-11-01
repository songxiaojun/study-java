package com.hfuu.thread;
/**
 * volatile ¹Ø¼ü×Ö
 * @author jun
 *
 */
public class TestVolatile {
       public static void main(String[] args) {
    	   ThreadDemo td = new ThreadDemo();
    	   new Thread(td).start();
    	   
    	   
    	   while(true) {
    		   if(td.isFlag()) {
    			   System.out.println("-------------");
    			   break;
    		   }
    	   }
	}
}
