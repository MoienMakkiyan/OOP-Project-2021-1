package Objects;

public class Bucket_of_Water {
    int MAX_AMOUNT;
    int cerrunt_amount;

    public Bucket_of_Water(int MAX_AMOUNT) {
        this.cerrunt_amount = 0;
        this.MAX_AMOUNT = MAX_AMOUNT;
    }

    public int getCerrunt_amount() {
        return cerrunt_amount;
    }

    public void setCerrunt_amount(int cerrunt_amount) {
        this.cerrunt_amount = cerrunt_amount;
    }

    public int getMAX_AMOUNT() {
        return MAX_AMOUNT;
    }
}
