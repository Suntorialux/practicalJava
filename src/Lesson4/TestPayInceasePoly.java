package Lesson4;

import Lesson4.com.practicaljava.lesson6.*;

public class TestPayInceasePoly {

	public static void main(String[] args) {

        Payable workers[] = new Payable[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");
		
			for (Payable p: workers){
			          System.out.println(p.increasePay(30));
	 		}
		}
}
