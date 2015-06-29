package Lesson2;

/**
 * Created by Андрей on 29.06.2015.
 */
public class TestTax {
    public static void main(String[] args) {
        //Tax t =new Tax();
        NjTax t =new NjTax();

        t.dependets=2;
        t.state="NJ";
        t.grossIncome=50000;

        double yourTax=t.calcTax();
        double tax=t.adjustForStudents(yourTax);

        System.out.println("Your tax is " + tax);
    }

}
