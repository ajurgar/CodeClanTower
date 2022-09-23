import Facilities.*;
import Guests.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Hotel hotel;
    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before() {
        bedroom1 = new Bedroom(RoomType.SINGLE, new ArrayList<>() ,1 ) ;
        bedroom2 = new Bedroom(RoomType.DOUBLE, new ArrayList<>() ,2 ) ;
        hotel = new Hotel(new ArrayList<>(), new ArrayList<>());
        conferenceRoom = new ConferenceRoom(RoomType.SINGLE, new ArrayList<>() ,"G32" ) ;
    }

    @Test
    public void canAddBedroomToHotel(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canAddConferenceRoomToHotel(){
        hotel.addConference(conferenceRoom);
        assertEquals(1, hotel.conferenceCount());
    }

    @Test
    public void canCheckInAndOut(){
        hotel.addBedroom(bedroom1);
        hotel.findRoom(bedroom1);
        bedroom1.addGuest(guest);
        assertEquals(1, bedroom1.guestCount());
        bedroom1.removeGuest(guest);
        assertEquals(0, bedroom1.guestCount());
    }
}
