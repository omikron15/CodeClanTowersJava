package Rooms;

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



}
