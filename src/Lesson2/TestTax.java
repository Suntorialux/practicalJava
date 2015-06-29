package Lesson2;

/**
 * Created by Андрей on 29.06.2015.
 */
public class TestTax {

    public static void main(String[] args) {
        Tax t =new Tax();




        double yourTax=t.calcTax();
        System.out.println("Your tax is " + yourTax);
    }

}
