import abstract_classes.Product;

public class WaterProduct extends Product {

    double maxPressure;//Max pressure of the water component
    //Constructor
    public WaterProduct(String productName,String productDescription){
        super(productName,productDescription);
    }
    //End constructor

    //Getter and setter
    public double getMaxPressure() {
        return maxPressure;
    }

    public void setMaxPressure(double maxPressure) {
        this.maxPressure = maxPressure;
    }
    //end getter and setter
}
