package Lesson4.com.practicaljava.lesson6;

public class Employee extends Person  implements Payable{

	public Employee(String name){
		super(name);
	}
	public String increasePay(int percent) {
		String s=new String();
		s="Increasing salary by " + percent + "%. " + getName();
		return s;
	}
}
