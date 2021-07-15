package Functions;

import Objects.X_Y;

import java.util.Random;

public class Random_Location {

    private static Random_Location instance = null;

    private Random_Location(){
    }

    Random random = new Random();

    public X_Y random(){
        X_Y x_y = new X_Y(random.nextInt(Variable_Reading.getInstance().getMap_size()[0])+1,random.nextInt(Variable_Reading.getInstance().getMap_size()[1])+1);
        return x_y;
    }

    public X_Y base_random(int x, int y){
        int w1 = random.nextInt(2);
        int w2 = random.nextInt(2);
        int xx;
        int yy;
        if (w1==1){
            if (x+1<=Variable_Reading.getInstance().getMap_size()[0])
                xx=x+1;
            else xx=x-1;
        }
        else {
            if (x-1>0)
                xx=x-1;
            else xx=x+1;
        }
        if (w2==1){
            if (y+1<=Variable_Reading.getInstance().getMap_size()[1])
                yy=y+1;
            else yy=y-1;
        }
        else {
            if (y-1>0)
                yy=y-1;
            else yy=y+1;
        }
        return new X_Y(xx,yy);
    }

    public static Random_Location getInstance(){
        if (instance == null)
            instance = new Random_Location();
        return instance;
    }
}
