package com.prodapt.CodingAssessments;

public class TestController {
	public static void main(String[] age)
	{
		Employee e1=new Employee("Pujasaini m",21,"Associate Software Engineer");
		Employee e2=new Employee("moni m",21,"Associate Software Engineer");
		Employee e3=new Employee("Charmitha m",21,"Associate Software Engineer");
		Employee e4=new Employee("Priyanka m",21,"Associate Software Engineer");
	
		HR_Manager hr= new HR_Manager();
		
		hr.process_Records(e1.name, e1.age,e1.designation);
		hr.process_Records(e2.name, e2.age,e2.designation);
		hr.process_Records(e3.name, e3.age,e3.designation);
		hr.process_Records(e4.name, e4.age,e4.designation);
		
	}

}
