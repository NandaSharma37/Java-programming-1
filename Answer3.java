//Q.3: Write a program, creating an Employee class containing details of empId, empName, empDesignation, empSalary and empLocation. Create necessary methods like getters, setters and toString. Create 10 instances of the same.
//The problem is to generate stream of all the instances and do the following operations:
//a. Print the name of all the employees.
//b. Print all the salaries which are greater than 50,000/-
//c. Print all the locations starting with the letter ‘M’
//d. Print all the designations ending with ‘E’

import java.util.LinkedList;

public class Employee1  {
	
  static  class Employee{
        int empId, empSalary;
        String empName, empDesignation, empLocation;

        public Employee(int empId, String empName, String empDesignation, int empSalary, String empLocation){
        	this.empId = empId;
            this.empName = empName;
            this.empDesignation = empDesignation;
            this.empSalary = empSalary;
            this.empLocation = empLocation;
        }
        public int getEmpId() {
            return empId;
        }

        public int getEmpSalary() {
            return empSalary;
        }

        public String getEmpName() {
            return empName;
        }

        public String getEmpDesignation() {
            return empDesignation;
        }
        
        public String getEmpLocation() {
            return empLocation;
        }
    }

    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<>();
        Employee employee1 =new Employee(1,"Sandeep","Devloper",60000,"Banglore");
        Employee employee2=new Employee(2,"Sagar","Tester",40000,"Mumbai");
        Employee employee3=new Employee(3,"Rohith","Cyber",30000,"Maharastra");
        Employee employee4=new Employee(4,"Srikanth","Sale",70000,"Delhi");
        Employee employee5=new Employee(5,"Santhosh","ML Devloper",80000,"Mohali");
        Employee employee6=new Employee(6,"Pradeep","Technical",30000,"Banglore");
        Employee employee7=new Employee(7,"Venkat","Technical",30000,"Banglore");
        Employee employee8=new Employee(8,"Arun","Technical",30000,"Banglore");
        Employee employee9=new Employee(9,"Bimal","Technical",30000,"Banglore");
        Employee employee10=new Employee(10,"Naresh","Technical",30000,"Banglore");

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        list.add(employee6);
        list.add(employee7);
        list.add(employee8);
        list.add(employee9);
        list.add(employee10);
        
        
        System.out.println("All names of employees");
        list.stream().forEach(e->{
            System.out.println(e.getEmpName());
        });
        System.out.println("\n All salaries greater than 50,000/-");
        list.stream().filter(e->e.getEmpSalary()>50000).forEach(e->{
            System.out.println(String.format(e.getEmpName()+" "+e.getEmpSalary()));
        });
        System.out.println("\n All locations starting with letter \'M\'");
        list.stream().filter(e->e.getEmpLocation().startsWith("M")).forEach(e->{
            System.out.println(String.format(e.getEmpName()+" "+e.getEmpLocation()));

        });
        System.out.println("\n All designations stating with \'E\'");
        list.stream().filter(e->e.getEmpDesignation().endsWith("E")).forEach(e->{
            System.out.println(String.format(e.getEmpName()+" "+e.getEmpDesignation()));

        });
    }

}