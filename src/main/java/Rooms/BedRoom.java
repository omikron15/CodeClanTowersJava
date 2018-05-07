package Rooms;

import Guests.Guest;

public class BedRoom extends Room{

    private int roomNo;
    private double rate;
    private RoomType type;

    public BedRoom(int capacity, int roomNo, double rate, RoomType type){
        super(capacity);
        this.roomNo = roomNo;
        this.rate = rate;
        this.type = type;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public double getRate() {
        return rate;
    }

    public RoomType getType() {
        return type;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

}
