/*
Create a class called Commercial that contains code for calculating bill for a commercial user. There are setter and getter methods in this class that stores the name of the customer. Create a class Domestic for calculating the bill of a domestic user, setter and getter methods of Commercial class are also needed by Domestic class. Commercial class contains a method called CalculateBill() which calculates bill amount at the rate of Rs. 5 per unit. This method has to be overridden by the Domestic class as the price varies for a domestic customer at Rs. 2.5 per unit. Calculate the bill amount for a domestic and a commercial customer if the number of units used by both of them is 100 units.
Sample Output

Customer: Raj Kumar 
Bill amount = 500 Rs

Customer: Lalith Raj
Bill amount = 250Rs
*/

package QuestionNO1;

public class Commercial {
    int unit = 5;
    String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void calculateBill(int amt){
        System.out.println("Customer:"+name);
        System.out.println("Bill Amount:"+unit*amt);
    }
}



package QuestionNO1;

public class Domestic extends Commercial{
    double unit = 2.5;
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void calculateBill(int amt) {
        System.out.println("Customer: "+name);
        System.out.println("Bill Amount: "+(int)(unit*amt));
    }

    public static void main(String [] args){
        Commercial first_cus = new Commercial();
        first_cus.setName("Raj Kumar");
        first_cus.calculateBill(100);

        System.out.println();
        Domestic sec_cus = new Domestic();
        sec_cus.setName("Lalith Raj");
        sec_cus.calculateBill(100);
    }
}
