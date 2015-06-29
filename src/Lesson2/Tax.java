package Lesson2;

/**
 * Created by Андрей on 29.06.2015.
 */
public class Tax {
    double grossIncome;
    String state;
    int dependets;



    public double calcTax (){
        if (grossIncome<50000) {
            return grossIncome*0.06;
        }
        else return grossIncome*0.08;
    }


}
