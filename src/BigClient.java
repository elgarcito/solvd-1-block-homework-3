import abstract_classes.Person;

//We only save the data of the big clients
public class BigClient extends Person {
    private int bigClientAge;//The amount of time that the client is working with us
    private String regularBuy;//The type of product that the big client buys

    //Constructor
    public BigClient(String personName, String personEmail, String phoneNumber) {
        super(personName, personEmail, phoneNumber);
    }
    //End Constructor

    //Getters and setters

    public int getBigClientAge() {
        return bigClientAge;
    }

    public void setBigClientAge(int bigClientAge) {
        this.bigClientAge = bigClientAge;
    }

    public String getRegularBuy() {
        return regularBuy;
    }

    public void setRegularBuy(String regularBuy) {
        this.regularBuy = regularBuy;
    }

    //End getter and setters
    //Abstract method override
    @Override
    public void checkAge(){
        if (this.getBigClientAge()<21){
            System.out.println("You must be older than 21 years to form part of this category.");
            if (this.getBigClientAge()==0){
                System.out.println("Please set the big client age.");
            }
        }else {
            System.out.println("You can be a big costumer.");
        }
    }
    //End abstract method override


    @Override
    public String toString() {
        return "Big Client Name=" + this.getPersonName() +
                ", big Client email ='" + this.getPersonEmail();
    }
}
