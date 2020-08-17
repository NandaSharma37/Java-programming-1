//Q.6: Write a program, creating a class which contains a method that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
//Name Year of joining Address
//Robert 1994 64C- WallStreet
//Sam 2000 68D- WallStreet
//John 1999 26B- WallStreet

import java.util.HashMap;
import java.util.Map.Entry;

class Employee{
	String Name;
	int year;
	String Address;
	
	Employee(String Name, int year, String Address) {
		this.Name=Name;
		this.year=year;
		this.Address=Address;
	}
	public String toString(){
		return("\n\t"+Name+"\t"+year+"\t"+Address);
	}
	public static void main(String[] args) {
		Employee s1 = new Employee("Sandeep",1998, "Bangalore");
		Employee s2 = new Employee("Sagar",2003, "Mumbai");
		Employee s3 = new Employee("Rohith",2020, "Hyderabad");
		HashMap<Integer, Employee> map = new HashMap<>();
		map.put(1,s1);
		map.put(2,s2);
		map.put(3,s3);
		System.out.println("\tName\tYear\tAddress");
		for(Entry<Integer, Employee> m:map.entrySet()) {
			System.out.println(m.getValue());
		}
	}
}