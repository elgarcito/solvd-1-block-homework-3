
import abstract_classes.Product;

import java.util.Objects;


public class GardenProduct extends Product {

    private boolean itsPoison;//Check if the product is poison or not
    private String gardenId;// the unique id for that product

    //constructor
    public GardenProduct(String productName, String productDescription,boolean itsPoison){
        super(productName,productDescription);
        this.itsPoison=itsPoison;
        this.gardenId=setGardenId();


    }
    //End constructor

    //getter and setter

    public boolean isItsPoison() {
        return itsPoison;
    }

    public void setItsPoison(boolean itsPoison) {
        this.itsPoison = itsPoison;
    }

    public String getGardenId() {
        return gardenId;
    }

    public String setGardenId() {
        int a= this.hashCode();
        if (this.hashCode()<0){
            a*=-1;
        }
        return this.gardenId = "GR"+a;
    }

    //end getter and setter

    //Override equal, hashcode and toString methods.
    @Override
    public String toString(){
        String poison;
        if (this.itsPoison){
            poison="poisonous";
        }else {
            poison="non poisonous";}

        return  "The resume name of the product is:\n"+this.getProductName()
                +"\nThe full description is:\n"+this.getProductDescription()
                +"\nIt is a "+poison+" product";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GardenProduct)) return false;
        GardenProduct that = (GardenProduct) o;
        return itsPoison == that.itsPoison && Objects.equals(gardenId, that.gardenId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getProductName(), this.getProductDescription());
    }

    //end override equal, hashcode and toString methods.



}
