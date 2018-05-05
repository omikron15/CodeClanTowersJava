import Guests.Guest;
import Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom1;
    DiningRoom diningRoom2;
    Guest guest1;

    @Before
    public void before(){
        diningRoom1 = new DiningRoom(2);
        diningRoom2 = new DiningRoom(3);
        diningRoom1.addGuest(guest1);
        diningRoom1.addGuest(guest1);
    }

    @Test
    public void getCapacity() {
        assertEquals(2, diningRoom1.getCapacity());
    }


    @Test
    public void roomHasSpace__FullRoom() {
        assertEquals(false, diningRoom1.roomHasSpace());
    }

    @Test
    public void roomHasSpace__NotFullRoom() {
        assertEquals(true, diningRoom2.roomHasSpace());
    }

    @Test
    public void addGuest__NotFullRoom() {
        diningRoom2.addGuest(guest1);
        assertEquals(1, diningRoom2.guestsInRoom());
    }

    @Test
    public void addGuest__FullRoom() {
        diningRoom1.addGuest(guest1);
        assertEquals(2, diningRoom1.guestsInRoom());
    }

    @Test
    public void removeGuest__RoomEmpty() {
        diningRoom2.removeGuest();
        assertEquals(0, diningRoom2.guestsInRoom());
    }

    @Test
    public void removeGuest__RoomHasGuest() {
        diningRoom1.removeGuest();
        assertEquals(1 , diningRoom1.guestsInRoom());
    }

    @Test
    public void guestsInRoom() {
        assertEquals(2, diningRoom1.guestsInRoom());
    }
}
