package Java8;

import java.util.Scanner;

public class PermutationABCD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Characters");
		String a=sc.next();
		int b=a.length();
		
		PermutationABCD per=new PermutationABCD();
		per.permute(a,0,b-1);
		
	}
	
	private void permute(String s,int b,int d) {
		if(b==d)
			System.out.println(s);
		else {
			for(int i=b;i<d;i++) {
				s=swap(s,b,i);
				permute(s,b+1,d);
				s=swap(s,b,d);
			}
		}
	}
	public String swap(String s,int i,int j) {
		char cnt;
		char[] chararr=s.toCharArray();
		cnt=chararr[i];
		chararr[i]=chararr[j];
		chararr[j]=cnt;
		
		return String.valueOf(chararr);
		
	
		
		
	}

}
