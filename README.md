# hardware store
Progressive exercises of QA automation training, using maven and git.

## Project description:
In this project, we have a hardware store that sells different products.

<p align="center">
<img src="https://t4.ftcdn.net/jpg/03/39/67/57/360_F_339675724_zKIsiEcSss6x2KOXUfHMfBrK9b0qbYCQ.jpg" alt="Image of a hardware store" width="300" height="200">
</p>

We represent this product using classes.
We can see the classes and some examples of products that they are going to content:
1. ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
   10 kg of sand.
2. ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3. HandTool: hammer, hand saw, etc.
4. GardenProduct:shovel, plant pot, etc.
5. HouseholdItem: kettle, broom, brush, etc.
6. WaterProduct:water filter, water pump, etc.
7. GasProduct: gas valve, etc.

Besides that, we have the persons that interact with the store these are:
1. Employee: these are the employees of the store and could be: seller, deposit or owner
2. Supplier: the one that sells us the products
3. BigClient: at the moment, the store only works with big clients that are an small amount and are registered.

## Exercises and references:

### 02/11/2023

Extend your previous homework with next features:
* Add 5 interfaces
* Use polymorphism with the abstract class and interface from the hierarchy
* Create final class, method, variable.
* Create a static block, method, variable

### Solution
Created the 5 interfaces :
* Selleable, Priceable, Costable, Available,TransactionDateable

These interfaces were implemented in the classes ElectricProduct and GasProduct.
Polymorphism for these interfaces and for the abstract classes could be seen in the main method examples.

Created the final:
* Class the finalClasses package the PayingRates.java class
* Method: showRates() inside PayingRates class
* Variables: inside PayingRates class: SELLER_RATE, DEPOSIT_RATE, OWNER_RATE.

The implementation could be seen in the main method example.

Created the static:
* Block: inside the ElectricProduct class this restart to zero the counter of created product each initialization.
* Method: inside the ElectricProduct the showAmountOfElectricProducts() method.
* Variable: productCounter used in ElectricProduct.

The console messages from previous exercises were deleted to see
the console message for this exercise.
The objects created were kept to be
used in this exercise.
The implementation could be seen in the main method example.
