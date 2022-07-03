package Que11;


 class Singlton{
	 // create private static instance for current class
	 private static Singlton st = new Singlton();
	  
	 //make constructor private
	 private Singlton(){
		 
	 }
    
	 //method with will return instance of singlton class
	 public static Singlton getSinglton() {
		 return st;
		
	}
	 public class SingltonCheck{
		 public static boolean Checksinglton(Singlton st1, Singlton st2) {
			 if(st1.hashCode()==st2.hashCode()) {
				 return true;
			 }
			 else
				 return false;
		}
	 }
	 
	 
 }