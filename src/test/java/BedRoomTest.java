import Guests.Guest;
import Rooms.BedRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedroom1;
    BedRoom bedroom2;
    Guest guest1;

    @Before
    public void before(){
        bedroom1 = new BedRoom(2, 100, 75.00, RoomType.SINGLE);
        bedroom2 = new BedRoom(3, 110, 80.00, RoomType.DOUBLE);
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest1);
    }

    @Test
    public void getCapacity() {
        assertEquals(2, bedroom1.getCapacity());
    }


    @Test
    public void roomHasSpace__FullRoom() {
        assertEquals(false, bedroom1.roomHasSpace());
    }

    @Test
    public void roomHasSpace__NotFullRoom() {
        assertEquals(true, bedroom2.roomHasSpace());
    }

    @Test
    public void addGuest__NotFullRoom() {
        bedroom2.addGuest(guest1);
        assertEquals(1, bedroom2.guestsInRoom());
    }

    @Test
    public void addGuest__FullRoom() {
        bedroom1.addGuest(guest1);
        assertEquals(2, bedroom1.guestsInRoom());
    }

    @Test
    public void removeGuest__RoomEmpty() {
        bedroom2.removeGuest();
        assertEquals(0, bedroom2.guestsInRoom());
    }

    @Test
    public void removeGuest__RoomHasGuest() {
        bedroom1.removeGuest();
        assertEquals(1 , bedroom1.guestsInRoom());
    }

    @Test
    public void guestsInRoom() {
        assertEquals(2, bedroom1.guestsInRoom());
    }

    @Test
    public void getRoomNumber() {
        assertEquals(100, bedroom1.getRoomNo());
    }

    @Test
    public void setRoomNumber() {
        bedroom1.setRoomNo(200);
        assertEquals(200, bedroom1.getRoomNo());
    }

    @Test
    public void getRate() {
        assertEquals(75.00, bedroom1.getRate(), 1.0);
    }

    @Test
    public void setRate() {
        bedroom1.setRate(200.00);
        assertEquals(200.00, bedroom1.getRate(), 1.0);
    }

    @Test
    public void getType() {
        assertEquals(RoomType.SINGLE ,bedroom1.getType());
    }

    @Test
    public void setType() {
        bedroom1.setType(RoomType.DOUBLE);
        assertEquals(RoomType.DOUBLE, bedroom1.getType());
    }

}
