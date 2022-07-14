package Que16Item;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeTest {
public static void main(String[] args) {
List<Employee> list=new ArrayList<Employee>();
list.add(new Employee("Ashish",LocalDate.of(1997, 05, 20),LocalDate.of(2020, 03, 21), LocalDate.of(2022, 03, 21),"Pune" , "Developer", 20000.0));
list.add(new Employee("Mayur",LocalDate.of(1995, 10, 02),LocalDate.of(2018, 01, 01), LocalDate.of(2021, 01, 01),"Mumabi" , "sales", 15000.0));
list.add(new Employee("Nikhil",LocalDate.of(1996, 01, 10),LocalDate.of(2021, 05, 21), LocalDate.of(2022, 10, 11),"Pune" , "Developer", 45000.0));
list.add(new Employee("Adarsh",LocalDate.of(1999, 07, 17),LocalDate.of(2021, 10, 10), LocalDate.of(2022, 05, 20),"Indore" , "Hr", 40000.0));
list.add(new Employee("Navnath",LocalDate.of(1989, 10, 15),LocalDate.of(2012, 03, 21), LocalDate.of(2022,01 , 11),"Mumbai" , "Acounting", 23000.0));
list.add(new Employee("Neha",LocalDate.of(1994, 01, 10),LocalDate.of(2015, 01, 01), LocalDate.of(2021, 01, 11),"Banglore" , "Testing", 35000.0));
list.add(new Employee("Vaishu",LocalDate.of(1998, 05, 20),LocalDate.of(2020, 9, 05), LocalDate.of(2021, 10, 01),"Mumbai" , "Hr", 28000.0));

// Employee In Particular Department
System.out.println("---------------------------------------------------------------------");
System.out.println("Employee Name With Particular Department:-");
Map<String,List<Employee>> empbydep=list.stream().collect(Collectors.groupingBy(Employee::getDepaerment));
Set <Entry <String,List<Employee>>> entryset=empbydep.entrySet();
for (Entry <String,List<Employee>> entry:entryset) {
System.out.println("Employees in "+entry.getKey()+" : ");
List<Employee> list1=entry.getValue();
for (Employee e:list1) {
	System.out.println(e.getName());
	

}
//Employee With MiXimum Salary:--

System.out.println("---------------------------------------------------------------------");
Double maxsalary=list.stream().filter(Dept->"Developer"==Dept.getDepaerment()).map(Employee ::getSalary).max(Double::compare).get();
System.out.println("Maximun Salary In Department:--"+maxsalary);
System.out.println("---------------------------------------------------------------------");
Double minsalary=list.stream().filter(Dept->"Developer"==Dept.getDepaerment()).map(Employee ::getSalary).min(Double::compare).get();
System.out.println("Minimum Salary In Department:--"+minsalary);


//Average Salary Of Each Departmeent
System.out.println("---------------------------------------------------------------------");
System.out.println("Average Salary Of Each Departmeent");
Map<String, Double> avgSalaryDep=list.stream().collect(Collectors.groupingBy(Employee::getDepaerment, Collectors.averagingDouble(Employee::getSalary)));
Set<Entry<String, Double>>entryset1=avgSalaryDep.entrySet();
for(Entry<String, Double> entry1:entryset1 ) {
System.out.println(entry1.getKey()+":"+entry1.getValue());

}

//Number Of Employee In Each Department
System.out.println("---------------------------------------------------------------------");
System.out.println("Number Of Employee In Each Department:-");
Map<String,Long> numberOfEmp=list.stream().collect(Collectors.groupingBy(Employee::getDepaerment,Collectors.counting()));
System.out.println(numberOfEmp);



}
}
}

