import Guests.Guest;
import Hotel.Hotel;
import Rooms.BedRoom;
import Rooms.ConferenceRoom;
import Rooms.DiningRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    Hotel hotel1;
    BedRoom bedroom1;
    ConferenceRoom conferenceroom1;
    DiningRoom diningroom1;
    Guest guest1;

    @Before
    public void before(){
    hotel1 = new Hotel("My Hotel");
    bedroom1 = new BedRoom(5, 100, 50.00, RoomType.SINGLE);
    conferenceroom1 = new ConferenceRoom(25, "C1", 250.00);
    diningroom1 = new DiningRoom(100);
    }

    @Test
    public void getName() {
        assertEquals("My Hotel", hotel1.getName());
    }

    @Test
    public void addRoom() {
        hotel1.addBedroom(bedroom1);
        hotel1.addConferenceroom(conferenceroom1);
        hotel1.addDiningroom(diningroom1);
        assertEquals(1, hotel1.bedRoomCount());
        assertEquals(1, hotel1.conferenceRoomCount());
        assertEquals(1, hotel1.diningRoomCount());
    }

    @Test
    public void addGuestToBedroom(){
        hotel1.addGuest(guest1, bedroom1);
        assertEquals(1, bedroom1.guestsInRoom());
    }

    @Test
    public void addGuestToConferenceroom(){
        hotel1.addGuest(guest1, conferenceroom1);
        assertEquals(1, conferenceroom1.guestsInRoom());
    }

    @Test
    public void addGuestToDiningroom(){
        hotel1.addGuest(guest1, diningroom1);
        assertEquals(1, diningroom1.guestsInRoom());
    }

    @Test
    public void listGuests() {
        hotel1.addGuest(guest1, diningroom1);
        hotel1.addGuest(guest1, diningroom1);
        assertEquals(2, hotel1.getGuests(diningroom1).size());
    }
}
