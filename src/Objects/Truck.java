package Objects;

import Functions.Variable_Reading;

import java.util.ArrayList;

public class Truck {
    private int final_capacity;
    private int time_needed;
    private int currunt_capacity;
    ArrayList<String> inTruck;

    public Truck() {
        this.final_capacity = Variable_Reading.getInstance().truck_capacity();
        this.time_needed = Variable_Reading.getInstance().truck_time();
        this.inTruck = new ArrayList<>();
    }

    public boolean Load(String name){
        if (currunt_capacity+Variable_Reading.getInstance().item_capacity(name)<=final_capacity){
            inTruck.add(name);
            //TODO
            return true;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Unload (String name){
        boolean found = false;
        int index = -1;
        for (int i=0 ; i<inTruck.size() ; i++){
            if (inTruck.get(i).equals(name)){
                found = true;
                index = i;
                //TODO
                break;
            }
            else {
                found = false;
                index = -1;
                //TODO
            }
        }
        if (found){
            if (inTruck.remove(name)){
                //TODO
                return true;
            }
            else return false;
        }
        else {
            //TODO
            return false;
        }
    }

    public boolean Go (){
        //TODO
        return true;
    }

    public ArrayList<String> getInTruck() {
        return inTruck;
    }

    public void clear(){
        inTruck.clear();
    }
}

