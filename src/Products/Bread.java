package Products;

public class Bread extends Product{
    public Bread(int x, int y) {
        this.x = x;
        this.y = y;
        this.price = 0;
        this.InMap = true;
        this.InMap = false;
        this.InWerehouse = false;
        this.Processing = false;
        this.transporting = false;
    }

    private int SetPrice (){
        return 0;
    }
}
