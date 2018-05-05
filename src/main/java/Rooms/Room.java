package Rooms;

import Guests.Guest;
import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addGuest(Guest guest){
        if (roomHasSpace()) {
            this.guests.add(guest);
        }
    }

    public void removeGuest(){
        if (guests.size() > 0) {
            this.guests.remove(0);
        }
    }

    public int guestsInRoom(){
        return guests.size();
    }

    public boolean roomHasSpace(){
        if (guestsInRoom() < this.capacity){
            return true;
        }else
            return false;
    }


}
