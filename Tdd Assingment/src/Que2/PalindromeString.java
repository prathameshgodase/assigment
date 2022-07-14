package Que2;

public class PalindromeString {
	   public static boolean check(String s1,String s2){
		   char[]a=s1.toCharArray();
	       int j=a.length-1;
	       int i=0;
	       while(i<j) {
	    	   char temp=a[i];
	    	   a[i]=a[j];
	    	   a[j]=temp;
	    	   i++;
	    	   j--;
	       }
	       String str=new String(a);
	 
	      if (str.equals(s2)&&str.equals(s1)) {
	         System.out.println(s1+" is a palindrome");
	         return true;
	      }
	      else {
	         System.out.println(s2+" is not a palindrome");
	      		return false;
	      }
	   }
	   }