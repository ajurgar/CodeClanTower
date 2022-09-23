import Facilities.Bedroom;
import Facilities.ConferenceRoom;
import Guests.Guest;
import Facilities.Room;
import Facilities.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest{

    Room room;
    Room room1;
    Guest guest;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;


    @Before
    public void before(){
        room = new Bedroom(RoomType.SINGLE, new ArrayList<>() ,5 ) ;
        bedroom = new Bedroom(RoomType.SINGLE, new ArrayList<>() ,5 ) ;
        conferenceRoom = new ConferenceRoom(RoomType.SINGLE, new ArrayList<>() ,"G32" ) ;

    }

    @Test
    public void canGetRoomType(){
        assertEquals(Facilities.RoomType.SINGLE, room.getRoomType());
    }

    @Test
    public void canGetCapacityOfSingle(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canCheckRoomIsEmpty(){
        assertEquals(0, room.guestCount());
    }

    @Test
    public void canAddGuest(){
        room.addGuest(guest);
        assertEquals(1, room.guestCount());
    }

    @Test
    public void removeGuest(){
        room.addGuest(guest);
        room.removeGuest(guest);
        assertEquals(0, room.guestCount());
    }

    @Test
    public void canCheckRoomNumber(){
//        Bedroom newBedroom = (Bedroom) room;
        assertEquals(5, bedroom.getRoomNumber());
    }

    @Test
    public void canCheckConferenceName(){
        assertEquals("G32", conferenceRoom.getName());
    }



}