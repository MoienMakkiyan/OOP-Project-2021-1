public class WateringSystem {

    private int amount = 5;
    private int timeOfFilling = 3;

    private boolean checkTime() {
        if (this.timeOfFilling == 0)
            return true;
        else return false;
    }

    private boolean checkEmptiness() {
        if (this.amount == 0) {
            return true;
        } else return false;
    }

    public boolean startFilling() {
        if (checkEmptiness()) {
            System.out.println("Filling the well started!");
            return true;
        } else {
            System.out.println("The well is not empty!");
            return false;
        }
    }

    public void fillWell() {
        if (startFilling() && checkTime()) {
            this.amount = 5;
            System.out.println("Well is full!");
        }
    }

    public void reduceWater() {
        this.amount = this.amount - 1;
    }

    private static WateringSystem wellInstance;

    public static WateringSystem getInstance() {
        if (wellInstance == null) {
            wellInstance = new WateringSystem();
        }
        return wellInstance;
    }
}
