import Guests.Guest;
import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Guest guest1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom(2, "C1", 100.00);
        conferenceRoom2 = new ConferenceRoom(3, "C2", 200.00);
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.addGuest(guest1);
    }

    @Test
    public void getCapacity() {
        assertEquals(2, conferenceRoom1.getCapacity());
    }


    @Test
    public void roomHasSpace__FullRoom() {
        assertEquals(false, conferenceRoom1.roomHasSpace());
    }

    @Test
    public void roomHasSpace__NotFullRoom() {
        assertEquals(true, conferenceRoom2.roomHasSpace());
    }

    @Test
    public void addGuest__NotFullRoom() {
        conferenceRoom2.addGuest(guest1);
        assertEquals(1, conferenceRoom2.guestsInRoom());
    }

    @Test
    public void addGuest__FullRoom() {
        conferenceRoom1.addGuest(guest1);
        assertEquals(2, conferenceRoom1.guestsInRoom());
    }

    @Test
    public void removeGuest__RoomEmpty() {
        conferenceRoom2.removeGuest();
        assertEquals(0, conferenceRoom2.guestsInRoom());
    }

    @Test
    public void removeGuest__RoomHasGuest() {
        conferenceRoom1.removeGuest();
        assertEquals(1 , conferenceRoom1.guestsInRoom());
    }

    @Test
    public void guestsInRoom() {
        assertEquals(2, conferenceRoom1.guestsInRoom());
    }

    @Test
    public void getName() {
        assertEquals("C1", conferenceRoom1.getName());
    }

    @Test
    public void setName() {
        conferenceRoom1.setName("C3");
        assertEquals("C3", conferenceRoom1.getName());
    }

    @Test
    public void getRate() {
        assertEquals(100.00, conferenceRoom1.getRate(), 1.0);
    }

    @Test
    public void setRate() {
        conferenceRoom1.setRate(200.00);
        assertEquals(200.00, conferenceRoom1.getRate(), 1.0);
    }
}
