/**
 * Created by Jeff on 7/12/17.
 */
public class FooCorporation {

    /*
    Foo Corporation needs a program to calculate how much to pay their hourly employees. The US Department of Labor
requires that employees get paid time and a half for any hours over 40 that they work in a single week. For example, if an
employee works 45 hours, they get 5 hours of overtime, at 1.5 times their base pay. The State of Massachusetts requires
that hourly employees be paid at least $8.00 an hour. Foo Corp requires that an employee not work more than 60 hours in
a week.

An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours.
For every hour over 40, they get overtime = (base pay) × 1.5.
The base pay must not be less than the minimum wage ($8.00 an hour). If it is, print an error.
If the number of hours is greater than 60, print an error message.

    * Write a method that takes the base pay and hours worked as parameters, and prints the total pay or an error. Write a main
method that calls this method for each of these employees:
Base Pay Hours Worked
Employee 1 $7.50 35
Employee 2 $8.20 47
Employee 3 $10.00 73
*/

    public static void calculatePay(double rate, int hoursWorked){

        if (rate >= 8.00) { // Minimum pay is $8.00/hour

            if (hoursWorked <= 60.0) { // Cannot work more than 60 hours/week

                double basePay = rate * 40.0;
                double overtimeHours = hoursWorked - 40.0;
                double overtimePay = overtimeHours * (rate * 1.5);

                System.out.println("Employee base pay     = $" + basePay);
                System.out.println("Employee overtime pay = $" + overtimePay);
                System.out.println("Employee Total Pay    = $" + (basePay + overtimePay));
            }else{

                System.out.println("Employee worked more than 60 hours. Hours worked = " + hoursWorked);
            }

        }else{
            System.out.println("Employee hourly rate $" + rate + " is below minimum rate allowed ($8.00) ");
        }

    }

    public static void main(String[] args){

      //  FooCorporation myFoo = new FooCorporation();

        calculatePay(7.50, 35);
        calculatePay(8.20, 47);
        calculatePay(10.00, 73);

    }
}
