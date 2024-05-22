class Vehicle{
    String vehicleType;
    String vehicleCategory;

    public Vehicle(String vehicleType, String vehicleCategory){
        this.vehicleType= vehicleType;
        this.vehicleCategory= vehicleCategory;
    }

    public void showDetails(){
        System.out.println("Vehicle Type is : "+vehicleType);
        System.out.println("Vehicle Category : "+vehicleCategory);
    }
}

class Car extends Vehicle{
    String carBrand;
    String carModel;

    public Car(String vehicleType, String vehicleCategory, String carBrand, String carModel){
        super(vehicleType,vehicleCategory);
        this.carBrand=carBrand;
        this.carModel=carModel;
    }

    public void showCarDetails(){
        System.out.println("Car Brand is : "+carBrand);
        System.out.println("Car Model is : "+carModel);
    }

}

class Sedan extends Car{
    String batteryType;

    public Sedan(String vehicleType, String vehicleCategory, String carBrand, String carModel,String batteryType){
        super(vehicleType,vehicleCategory, carBrand, carModel);
        this.batteryType= batteryType;
    }

    public void showSedanDetails(){
        System.out.println("Battery Type is : "+batteryType);
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        Sedan objMultilevelInheritance = new Sedan("4 wheeler",
                "LMV", "Maruti","Baleno", "Electric");

        objMultilevelInheritance.showDetails();
        objMultilevelInheritance.showCarDetails();
        objMultilevelInheritance.showSedanDetails();
    }
}
