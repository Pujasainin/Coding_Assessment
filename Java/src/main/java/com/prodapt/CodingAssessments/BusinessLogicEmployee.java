package com.prodapt.CodingAssessments;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BusinessLogicEmployee {
ArrayList<Employee1> addDetails() {
       
		
        ArrayList<Employee1> details= new ArrayList<Employee1>();
        details.add(new Employee1(8001, "pujasaini",21, 100000f, "SSE"));
        details.add(new Employee1(8002, "charu",19, 75000f, "SE"));
        details.add(new Employee1(8003, "priyanka",20, 50000f, "ASE"));
        details.add(new Employee1(8004, "chandana",18, 40000f, "ASE"));
        details.add(new Employee1(8005, "Vinciya",18, 60000f, "ASE"));        
        
        details.stream().forEach((i)->System.out.println(i));
        return details;
    }

    void processDetails(ArrayList<Employee1> details) {
    	System.out.println(":::::::Details After Sorting:::::::");
        
        List < Employee1 > EmployeeSortedList = details.stream().sorted(Comparator.comparing(Employee1::getSalary)).collect(Collectors.toList());    

            EmployeeSortedList.forEach(i -> System.out.println(i));
    }


}
