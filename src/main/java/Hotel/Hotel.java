package Hotel;

import Guests.Guest;
import Rooms.*;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<BedRoom> bedrooms;
    private ArrayList<DiningRoom> diningrooms;
    private ArrayList<ConferenceRoom> conferencerooms;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.diningrooms = new ArrayList<>();
        this.conferencerooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int bedRoomCount(){
        return this.bedrooms.size();
    }

    public int conferenceRoomCount(){
        return this.conferencerooms.size();
    }

    public int diningRoomCount(){
        return this.diningrooms.size();
    }

    public void addBedroom(BedRoom room){
            this.bedrooms.add(room);
    }

    public void addDiningroom(DiningRoom room){
        this.diningrooms.add(room);
    }

    public void addConferenceroom(ConferenceRoom room){
        this.conferencerooms.add(room);
    }

    public void addGuestToBedroom(Guest guest, BedRoom bedroom){
        bedroom.addGuest(guest);
    }

    public void addGuestToConferenceroom(Guest guest, ConferenceRoom conferenceroom){
        conferenceroom.addGuest(guest);
    }

    public void addGuestToDiningroom(Guest guest, DiningRoom diningroom){
        diningroom.addGuest(guest);
    }

}
