import abstract_classes.Person;

public class Supplier extends Person {
    private String productSupplied;//What kind of product supplies
    private int supplierAge;

    //Constructor
    public Supplier(String personName, String personEmail, String phoneNumber, String productSupplied) {
        super(personName, personEmail, phoneNumber);
        this.productSupplied=productSupplied;
    }
    //end constructor

    //Getter and setter

    public String getProductSupplied() {
        return productSupplied;
    }

    public void setProductSupplied(String productSupplied) {
        this.productSupplied = productSupplied;
    }

    public int getSupplierAge() {
        return supplierAge;
    }

    public void setSupplierAge(int supplierAge) {
        this.supplierAge = supplierAge;
    }

    //end getter and setter

    //Abstract method implementation
    @Override
    public void checkAge(){
        if (this.getSupplierAge()<21){
            System.out.println("You must be older than 21 years to be a supplier.");
            if (this.getSupplierAge()==0){
                System.out.println("Please set the supplier age.");
            }
        }else {
            System.out.println("You can be a big supplier.");
        }
    }
    //End abstract method implementation


}
