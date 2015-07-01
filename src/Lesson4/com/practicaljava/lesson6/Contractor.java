package Lesson4.com.practicaljava.lesson6;



public class Contractor extends Person implements Payable {
	
	public Contractor(String name){
		super(name);
	}
	public String increasePay(int percent) {
		if(percent < Payable.INCREASE_CAP){
			String s = new String("Increasing hourly rate by " + percent + "%. "+ getName());
			return s;
		} else {
			String s=new String("Sorry, can't increase hourly rate by more than " + Payable.INCREASE_CAP + "%. "+ getName());
			return s;

		}
		
		
	}
}
