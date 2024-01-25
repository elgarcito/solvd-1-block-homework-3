
/*
Hardware store
In this project, we have a hardware store that sells different products.
We represent this product using classes.
Now we can se the classes and some examples of the kind of product that they are going to content:
1-ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
10 kg of sand
2-ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3-HandTool: hammer, hand saw
4-GardenProduct:shovel, plant pot
5-HouseholdItem: kettle, broom, brush
6-WaterProduct:water filter, water pump
7-GasProduct: gas valve,etc

Also, we have:
Employee: the employee of the store.
Supplier: the one that sells the product.
Client: the one that buys the product.
 */

import finalclasess.PayingRates;

public class Main {
    public static void main(String[] args) {
        //Instantiations of the different implemented classes after the implementation of abstract

        System.out.println("Hello and welcome to hardware store!! \n");
        //classes
        //humans or companies
        BigClient bigClient=new BigClient("Edward Cullen","Edward@gmail.com","+224586634");
        Supplier rinoMax= new Supplier("Jason Krueger","jason@gmail.com","+12812516","sand");
        Employee carlosRusso = new Employee("carlos Russo", "123@gmail.com", "12345678", "Deposit");
        Employee joseAntonio = new Employee("Jose Antonio", "123@gmail.com", "12345678", "seller");

        //Products
        ConstructionProduct sand = new ConstructionProduct("Sand", "White sand", "Tn");
        //Creating ElectricProducts Objects
        ElectricProduct lightBulb = new ElectricProduct("Light bulb 2", "led light bulb");
        lightBulb.setPower(10);
        ElectricProduct lightBulb2 = new ElectricProduct("Light bulb 1", "led light bulb");
        //Creating GardenProduct Objects
        GardenProduct gardenScissors = new GardenProduct("Big scissors", "Big size scissors to cut grass", false);
        GardenProduct gardenScissors1 = new GardenProduct("Medium scissors", "Medium size scissors to cut grass", false);
        GardenProduct gardenScissors2 = new GardenProduct("Small scissors", "Small size scissors to cut grass", false);
        //Creating GasProduct Objects
        GasProduct gasBurner = new GasProduct("Gas Burner", "Gas kitchen burner");
        GasProduct gasBurner2 = new GasProduct("Gas Burner", "Gas kitchen burner");
        gasBurner2.setStock(8);
        //Creating a HandTool Objects
        HandTool handSaw=new HandTool("Hand saw","Small hand saw");
        //Creating HouseholdItem Objects
        HouseholdItem broom =new HouseholdItem("Big broom","Industrial boom");
        HouseholdItem broom1 =new HouseholdItem("Small broom","House boom");
        //Creating a WaterProduct Object
        WaterProduct pump1=new WaterProduct("Excelsior pump","20 hp power pump");

        //Polymorphism with Person abstract class in BigClient, Employee and Supplier classes example
        rinoMax.setSupplierAge(21);
        bigClient.setBigClientAge(60);
        carlosRusso.setEmployeeAge(30);
        rinoMax.checkAge();
        System.out.println();
        bigClient.checkAge();
        System.out.println();
        carlosRusso.checkAge();
        System.out.println();

        //Polymorphism with Available, Costable, Priceable, Sellable, Stockable and TransactionDateable interfaces
        //implemented in classes ElectricProduct and GasProduct
        lightBulb.setStock(20);
        gasBurner.setStock(10);
        //Available interface
        lightBulb.checkAvailability(10);
        gasBurner.checkAvailability(5);
        //Costable interface
        double lightBulbCost= lightBulb.defineCost(10.0,1,1);
        double gasBurnerCost= gasBurner.defineCost(10.0,1,1);
        //Priceable interface
        lightBulb.definePrice(lightBulbCost,10);
        gasBurner.definePrice(gasBurnerCost,10);
        //Sellable interface
        lightBulb.removeStockDueSell(5);
        gasBurner.removeStockDueSell(1);
        //TransactionDateable.java
        lightBulb.transactionDate();
        gasBurner.transactionDate();

        //Create final class, method, variable
        //Final Class
        PayingRates payingRates=new PayingRates();
        //Final method
        payingRates.showRates();
        //Final variables
        payingRates.getOwnerRate();
        payingRates.getSellerRate();
        payingRates.getDepositRate();

        //Create a static block, method, variable
        //Static block in ElectricProduct class
        //Static method
        ElectricProduct.showAmountOfElectricProducts();
        //Static variable
        int electricProductCounter = ElectricProduct.electricProductCounter;
    }
}
