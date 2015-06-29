package Lesson2;

/**
 * Created by Андрей on 29.06.2015.
 */
public class NjTax extends Tax {



    public double adjustForStudents (double tax) {
        return tax-500;
    }

    public double calcTax (){
        if (grossIncome<50000) {
            return grossIncome*0.1;
        }
        else return grossIncome*0.13;
    }

}
