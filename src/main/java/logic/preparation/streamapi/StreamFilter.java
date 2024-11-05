package logic.preparation.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import cr.pricingmodule.model.Employee;

public class StreamFilter {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee(1, "Pavan", 15400);
		Employee emp2 = new Employee(2, "Charan", 25400);
		Employee emp3 = new Employee(3, "Rahul", 16400);
		Employee emp4 = new Employee(4, "Vikas", 35400);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);

		System.out.println("Size: "+empList.size());
		System.out.println("New List: ");
		for(Employee empp: empList) {
			System.out.println(empp.toString());
		}

		empList.stream()
				.filter(empLi -> empLi.getSalary() < 17000)
				.peek(empLi -> empLi.setSalary(empLi.getSalary() * 1.2))
				.collect(Collectors.toList());

		System.out.println("Updated List: ");
		for(Employee empp: empList) {
			System.out.println(empp.toString());
		}

	}

}
