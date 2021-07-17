package Objects.Animal;

import Functions.Main_Manager;
import Functions.Variable_Reading;
import Objects.X_Y;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Animal {

    protected int x;
    protected int y;
    protected int speed;
    protected int lives;
    protected String type;
    protected boolean isHungry;
    protected boolean activation;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isActivation() {
        return activation;
    }

    public void setActivation(boolean activation) {
        this.activation = activation;
    }

    public void walk(){
        if (isHungry) directed_walk();
        else simple_walk();
    }

    public void Cat_walk(){
        boolean sth_in_map = false;
        for (int i = 0 ; i < Variable_Reading.getInstance().getMap_size()[0] ; i++){
            for (int j = 0 ; i < Variable_Reading.getInstance().getMap_size()[1] ; i++){
                if (Main_Manager.getInstance().getCell()[i][j].getProducts().size()>0){
                    sth_in_map = true;
                }
            }
        }
        if (sth_in_map) cat_directed_walk();
        else simple_walk();
    }

    public void simple_walk(){
        Random random = new Random();
        int a = random.nextInt(8);
        //0  1  2
        //3     4
        //5  6  7
        if (speed == 1){
            if (a == 0){
                x--;
                y--;
                if (x<1) x+=2;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=2;
                if (y<1) y+=2;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=2;
            } else if (a == 1){
                y--;
                if (x<1) x+=2;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=2;
                if (y<1) y+=2;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=2;
            } else if (a == 2){
                x++;
                y--;
                if (x<1) x+=2;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=2;
                if (y<1) y+=2;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=2;
            } else if (a == 3){
                x--;
                if (x<1) x+=2;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=2;
                if (y<1) y+=2;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=2;
            } else if (a == 4){
                x++;
                if (x<1) x+=2;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=2;
                if (y<1) y+=2;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=2;
            } else if (a == 5){
                x--;
                y++;
                if (x<1) x+=2;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=2;
                if (y<1) y+=2;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=2;
            } else if (a == 6){
                y++;
                if (x<1) x+=2;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=2;
                if (y<1) y+=2;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=2;
            } else if (a == 7){
                x++;
                y++;
                if (x<1) x+=2;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=2;
                if (y<1) y+=2;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=2;
            }
        }
        else if (speed == 2){
            if (a == 0){
                x-=2;
                y-=2;
                if (x<1) x+=4;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=4;
                if (y<1) y+=4;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=4;
            } else if (a == 1){
                y-=2;
                if (x<1) x+=4;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=4;
                if (y<1) y+=4;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=4;
            } else if (a == 2){
                x+=2;
                y-=2;
                if (x<1) x+=4;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=4;
                if (y<1) y+=4;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=4;
            } else if (a == 3){
                x-=2;
                if (x<1) x+=4;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=4;
                if (y<1) y+=4;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=4;
            } else if (a == 4){
                x+=2;
                if (x<1) x+=4;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=4;
                if (y<1) y+=4;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=4;
            } else if (a == 5){
                x-=2;
                y+=2;
                if (x<1) x+=4;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=4;
                if (y<1) y+=4;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=4;
            } else if (a == 6){
                y+=2;
                if (x<1) x+=4;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=4;
                if (y<1) y+=4;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=4;
            } else if (a == 7){
                x+=2;
                y+=2;
                if (x<1) x+=4;
                if (x> Variable_Reading.getInstance().getMap_size()[0]) x-=4;
                if (y<1) y+=4;
                if (y> Variable_Reading.getInstance().getMap_size()[1]) y-=4;
            }
        }
    }

    public void directed_walk(){
        ArrayList<X_Y> x_yArrayList = new ArrayList<>();
        ArrayList<Integer> distance = new ArrayList<>();
        for (int i = 0 ; i < Variable_Reading.getInstance().getMap_size()[0] ; i++){
            for (int j = 0 ; i < Variable_Reading.getInstance().getMap_size()[1] ; i++){
                if (Main_Manager.getInstance().getCell()[i][j].hasGrass()){
                    x_yArrayList.add(new X_Y(i+1,j+1));
                    distance.add((int) (Math.pow(x-i-1,2)+Math.pow(y-j-1,2)));
                }
            }
        }
        X_Y final_direction = x_yArrayList.get(distance.indexOf(Collections.min(distance)));
        if (x-final_direction.getX()>0){
            x--;
        }
        if (y-final_direction.getY()>0){
            y--;
        }
        if (x-final_direction.getX()<0){
            x++;
        }
        if (y-final_direction.getY()<0){
            y++;
        }
    }

    public void eat(){
            lives=100;
            isHungry=false;
    }

    public void time_pass(){
        lives*=0.9;
        if (lives<55){
            isHungry = true;
        }
        else {
            isHungry = false;
        }
    }

    public int getLives() {
        return lives;
    }

    public void cat_directed_walk(){
        ArrayList<X_Y> x_yArrayList = new ArrayList<>();
        ArrayList<Integer> distance = new ArrayList<>();
        for (int i = 0 ; i < Variable_Reading.getInstance().getMap_size()[0] ; i++){
            for (int j = 0 ; i < Variable_Reading.getInstance().getMap_size()[1] ; i++){
                if (Main_Manager.getInstance().getCell()[i][j].getProducts().size()>0){
                    x_yArrayList.add(new X_Y(i+1,j+1));
                    distance.add((int) (Math.pow(x-i-1,2)+Math.pow(y-j-1,2)));
                }
            }
        }
        X_Y final_direction = x_yArrayList.get(distance.indexOf(Collections.min(distance)));
        if (x-final_direction.getX()>0){
            x--;
        }
        if (y-final_direction.getY()>0){
            y--;
        }
        if (x-final_direction.getX()<0){
            x++;
        }
        if (y-final_direction.getY()<0){
            y++;
        }
    }

    public boolean isHungry() {
        return isHungry;
    }
}

