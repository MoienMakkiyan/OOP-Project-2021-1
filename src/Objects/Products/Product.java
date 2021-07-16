package Objects.Products;

import Functions.Random_Location;
import Functions.Variable_Reading;

public class Product {
    protected int x;
    protected int y;
    protected int price;
    protected int capacity;
    protected boolean InMap;
    protected boolean InWerehouse;
    protected boolean Processing;
    protected boolean transporting;
    protected boolean isDone;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isInMap() {
        return InMap;
    }

    public void setInMap(boolean inMap) {
        InMap = inMap;
    }

    public boolean isInWerehouse() {
        return InWerehouse;
    }

    public void setInWerehouse(boolean inWerehouse) {
        InWerehouse = inWerehouse;
    }

    public boolean isProcessing() {
        return Processing;
    }

    public void setProcessing(boolean processing) {
        Processing = processing;
    }

    public boolean isTransporting() {
        return transporting;
    }

    public void setTransporting(boolean transporting) {
        this.transporting = transporting;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
