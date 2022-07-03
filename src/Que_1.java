//hcf=highest comman factor

public class Que_1 {
	public static int findhcf(int a,int b){
	      int i, hcf = 0;

	      for(i = 1; i <= a || i <= b; i++) {
	         if( a%i == 0 && b%i == 0 )
	         hcf = i;
	      }
	      return hcf;
	      
	}
	public static void main(String[] args) {
		System.out.println(Que_1.findhcf(321,745));
	}
}

