package Rooms;

public class ConferenceRoom extends Room {

    private String name;
    private Double rate;

    public ConferenceRoom(int capacity, String name, Double rate){
        super(capacity);
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
