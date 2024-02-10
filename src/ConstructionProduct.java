import abstract_classes.RawMaterial;

public class ConstructionProduct extends RawMaterial {


    private double fraction;//How you divide it, for example price per 1 kg, 10 kg, etc
    private boolean needLicense;// If you need a license to buy this product, for example, gasoline.
    private int licenceNumberLength;// if you need a license the amount of numbers in it


    //Constructor

    public ConstructionProduct(String rawMaterialName, String rawMaterialDescription, String unitType) {
        super(rawMaterialName, rawMaterialDescription, unitType);
    }

    //End constructor

    //Getter and setter

    public double getFraction() {
        return fraction;
    }

    public void setFraction(double fraction) {
        this.fraction = fraction;
    }

    public boolean isNeedLicense() {
        return needLicense;
    }

    public void setNeedLicense(boolean needLicense) {
        this.needLicense = needLicense;
    }

    public int getLicenceNumberLength() {
        return licenceNumberLength;
    }

    public void setLicenceNumberLength(int licenceNumberLength) {
        this.licenceNumberLength = licenceNumberLength;
    }
    //end getter and setter

    //Abstract method implementation
    @Override
    public boolean checkLicence(boolean needLicense,String licenceId,int licenceNumberLength){
        if (needLicense){
            if (licenceNumberLength ==licenceId.length()){
                System.out.println("License is OK");
                return true;
            }else{
                System.out.println("License is not OK");
                return false;
            }
        }
        System.out.println("no licence required");
        return true;
    }
    //end Abstract method implementation

}
