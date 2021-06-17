package Objects;

import java.util.ArrayList;

public class Warehouse {
    private int MAX_CAPACITY;
    private int CURRENT_CAPACITY;
    ArrayList<String> inWerehouse;

    public Warehouse(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        this.CURRENT_CAPACITY = 0;
        inWerehouse = new ArrayList<>();
    }

    public boolean Add (String name,int capacity){
        if (haveSpace(name, capacity)){
            inWerehouse.add(name);
            CURRENT_CAPACITY+=capacity;
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    private boolean haveSpace (String name,int capacity){
        if (CURRENT_CAPACITY+capacity<=MAX_CAPACITY){
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Remove (String name,int capacity){
        if (haveSTH(name)){
            inWerehouse.remove(name);
            CURRENT_CAPACITY-=capacity;
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean haveSTH (String name){
        boolean found = false;
        for (int i=0;i<inWerehouse.size();i++){
            if (inWerehouse.get(i).startsWith(name)){
                found = true;
                //TODO
                break;
            }
        }
        return found;
    }
}
