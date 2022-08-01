package com.prodapt.CodingAssessments;

public class TesterBusinessLogic {

	public static void main(String[] args) {
		
		BusinessLogic bl=new BusinessLogic();
		
		bl.addBooks();	
		
		System.out.println("\nAfter  adding the Books ");
		bl.displayBooks();	
					
		bl.updateBooks(4,5501,"Stuart Little","E.B.White");	
		
		System.out.println("\nAfter Updating the book ");
		bl.displayBooks();
		
		bl.deleteBook(5);
		
		System.out.println("\nAfter Deleting the book ");
		bl.displayBooks();

	}

}


