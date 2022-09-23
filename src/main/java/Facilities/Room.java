package Facilities;

import Guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;

    private ArrayList<Guest> guests;

    public Room(RoomType roomType, ArrayList<Guest> guests) {
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public int guestCount(){
        return guests.size();
    }

    public void addGuest(Guest guest){
         guests.add(guest);

    }
    public void removeGuest(Guest guest){
         guests.remove(guest);

    }

    public int getCapacity() {
        return roomType.getCapacity();
    }




}
