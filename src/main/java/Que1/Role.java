package Que1;

public class Role {

	 private Role(){
		 
	 }
	 
	 public static Role getRole() {
		 return new Role();
	 }
	 
	public void show() {
		System.out.println("Role based object is created");
	}
}
