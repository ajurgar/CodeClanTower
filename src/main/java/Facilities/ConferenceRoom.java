package Facilities;

import Guests.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(RoomType roomType, ArrayList<Guest> guests, String name) {
        super(roomType, guests);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
