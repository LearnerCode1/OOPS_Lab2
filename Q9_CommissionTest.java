/*Write a class, Commission, which has an instance variable, sales; an appropriate
constructor; and a method, commission() that returns the commission. Now write a
demo class to test the Commission class by reading a sale from the user, using it to
create a Commission object after validating that the value is not negative. Finally, call
the commission() method to get and print the commission. If the sales are negative,
your demo should print the message “Invalid Input”.*/

class Commission{
    private double sales;
    
    Commission(double sales){
        setSales(sales);
    }
    public void setSales(double sales){
        if(sales > 0){
            this.sales = sales;
        }else{
            this.sales =0;
        }
    }
    
    public double getSales(){
        return this.sales;
    }
    
    public double commission(){
        return this.sales*0.1;
    }
}

public class CommissionTest{
    public static void main(String args[]){
        Commission comis = new Commission(50);
        System.out.println(comis.commission());
    }
}
