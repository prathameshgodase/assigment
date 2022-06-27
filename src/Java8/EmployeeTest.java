package Java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee>employeelist = new ArrayList<>();
        employeelist.add(new Employee(1,"Amit"));		
        employeelist.add(new Employee(2,"Amol"));
        employeelist.add(new Employee(3,"Nikhil"));
        employeelist.add(new Employee(4,"Prathamesh"));
        employeelist.add(new Employee(5,"Samir"));	
        
        
        System.out.println("Converting list to map");
        Map<Integer, String> map = employeelist.stream().collect(Collectors.toMap(E1->E1.getid(), E2->E2.getname()));
        System.out.println(map);

        
        Set<Employee> Set = employeelist.stream().collect(Collectors.toSet());
        for(Employee emp:Set) {
        	System.out.println("Employee id="+emp.id+"Employee name+"+emp.name);
        }
	}

}
