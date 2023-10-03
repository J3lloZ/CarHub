public class Vehicle {
    private String vehicleMake;
    private String vehicleModel;
    private int vehicleYear;
    private int vehiclePrice;
    private int vehicleMiles;
    private int vehicleDriveTrain;
    public Vehicle(String make, String model, int year, int price, int miles, int driveTrain) {
        this.vehicleMake = make;
        this.vehicleModel = model;
        this.vehicleYear = year;
        this.vehiclePrice = price;
        this.vehicleMiles = miles;
        this.vehicleDriveTrain = driveTrain;
    }

    public int getVehicleMiles() {
        return vehicleMiles;
    }

    public void setVehicleMiles(int vehicleMiles) {
        this.vehicleMiles = vehicleMiles;
    }

    public int getVehicleDriveTrain() {
        return vehicleDriveTrain;
    }

    public void setVehicleDriveTrain(int vehicleDriveTrain) {
        this.vehicleDriveTrain = vehicleDriveTrain;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public int getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(int vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleMake='" + vehicleMake + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleYear=" + vehicleYear +
                ", vehiclePrice=" + vehiclePrice +
                '}';
    }
}