package Objects;

public class WateringSystem {

    int time_needed;
    Bucket_of_Water bucket_of_water;

    public WateringSystem(int time_needed, Bucket_of_Water bucket_of_water) {
        this.time_needed = time_needed;
        this.bucket_of_water = bucket_of_water;
    }

    private boolean checkTime() {
        //TODO
        return true;
    }

    private boolean checkEmptiness() {
        if (bucket_of_water.getCerrunt_amount() == 0) {
            return true;
        } else return false;
    }

    private boolean startFilling() {
        if (checkEmptiness()) {
            System.out.println("Filling the well started!");
            return true;
        } else {
            System.out.println("The well is not empty!");
            return false;
        }
    }

    public boolean fillWell() {
        if (startFilling() && checkTime()) {
            bucket_of_water.setCerrunt_amount(bucket_of_water.getMAX_AMOUNT());
            System.out.println("Well is full!");
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public void reduceWater() {
        bucket_of_water.setCerrunt_amount(bucket_of_water.getCerrunt_amount()-1);
    }

    public boolean isEmpty(){
        if (bucket_of_water.getCerrunt_amount()==0){
            return true;
        }
        else return false;
    }


















    private static WateringSystem wellInstance;





    public WateringSystem() {
        this.time_needed = time_needed;
        this.bucket_of_water = bucket_of_water;
    }
    public static WateringSystem getInstance() {
        if (wellInstance == null) {
            wellInstance = new WateringSystem();
        }
        return wellInstance;
    }
}
