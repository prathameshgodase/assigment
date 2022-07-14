package Que9;

public class RemoveCase {
public static String check(String a) {
	
	String d=a.replaceAll("[@$-]", "");
	return d;
	
}
public static void main(String[] args) {
	System.out.println(RemoveCase.check("This @ Red $car-"));
}
}
