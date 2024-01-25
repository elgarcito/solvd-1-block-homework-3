import abstractclasses.Product;
import createdinterfaces.*;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Objects;

public class GasProduct extends Product implements Available, Costable, Priceable, Sellable, TransactionDateable {
    private String typeOfGas;// compressed gas or natural gas
    private double gasPressure;// max gas pressure for that product

    private String gasId;// the unique id for that product


    //Constructor

    public GasProduct(String productName,String productDescription){
        super(productName,productDescription);
        this.setGasId();
    }
    //End constructor

    //Getter and setters

    public String getTypeOfGas() {
        return typeOfGas;
    }

    public void setTypeOfGas(String typeOfGas) {
        this.typeOfGas = typeOfGas;
    }

    public double getGasPressure() {
        return gasPressure;
    }

    public void setGasPressure(double gasPressure) {
        this.gasPressure = gasPressure;
    }

    public String getGasId() {
        return gasId;
    }

    public void setGasId() {
        this.gasId= "GS"+this.hashCode();
    }

    //end Getter and setters

    //Override equal, hashcode and toString methods.
    @Override
    public int hashCode(){
        int code= Objects.hash(getProductName(),getProductDescription());
        if (code<0){
            return code=code*-1;
        }
        return code;
    }

    @Override
    public String toString(){
        return  "The resume name of the product is:\n"+this.getProductName()
                +"\nThe full description is:\n"+this.getProductDescription();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GasProduct)) return false;
        GasProduct that = (GasProduct) o;
        return Objects.equals(gasId, that.gasId);
    }
    //End Override equal, hashcode and toString methods.

    //interfaces methods
    @Override
    public boolean checkAvailability(int stock) {
        //You consider that your minimum stock must be 10 units if this gas product
        if (this.getStock() >10){
            System.out.println("You have enough stock to sell this gas product, your stock is: "+this.getStock()+" units\n");
            return true;
        }else {
            System.out.println("You have not enough stock to sell this gas product, your stock is: "+this.getStock()+" units"+
                    " the minimum amount allowed is 10 units\n");
            return false;
        }
    }

    @Override
    public double defineCost(double supplierCost,double transportCost,double anotherCost){
        // the gas transport has a discount
        double transportDiscount=2;
        System.out.println("The gas transport has a discount of: "+transportDiscount+" usd");
        double cost=supplierCost+(transportCost-transportDiscount)+anotherCost;
        System.out.println("The final cost of: "+this.getProductName()+" is "+cost+" usd");
        return cost;
    }

    @Override
    public double definePrice(double cost, double winPercentage) {
        DecimalFormat df = new DecimalFormat("0.00");
        //An extra tax that only applies to gas products
        double gasExtraTax=1.0;
        System.out.println("The gas sell has an extra tax of: "+gasExtraTax+" usd");
        double price=cost*(1+winPercentage/100)+gasExtraTax;
        System.out.println("The final price of: "+this.getProductName()+" is "+df.format(price)+" usd");
        return price;
    }
    @Override
    public void removeStockDueSell(int amountSold) {
        boolean thereIsStock=checkAvailability(this.getStock());
        if(thereIsStock && amountSold<=this.getStock()){
            int newStock =this.getStock()-amountSold;
            this.setStock(newStock);
            System.out.println("Your new stock of this gas related product is: "+newStock+".\n");
        }else{
            System.out.println("You can't sell that amount of this gas product, you need to have at least: \n" +
                    10+" units in your stock.\n");
        }
    }

    @Override
    public String transactionDate(){
        String dateWithoutFormat=LocalDate.now().toString();
        System.out.println(dateWithoutFormat);
        return dateWithoutFormat;
    }

    //end interfaces methods

}
