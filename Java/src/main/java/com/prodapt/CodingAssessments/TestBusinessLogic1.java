package com.prodapt.CodingAssessments;
import java.util.ArrayList;

public class TestBusinessLogic1 {
	public static void main(String[] args) {
		BusinessLogicEmployee be= new BusinessLogicEmployee();
		ArrayList<Employee1> details=be.addDetails();
		be.processDetails(details);

	}


}
