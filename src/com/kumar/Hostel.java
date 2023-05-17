package com.kumar;
 class HostelRoom {
    protected String roomType;
    protected int roomNumber;

    public HostelRoom(String roomType, int roomNumber) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public void allotRoom() {
        System.out.println("Allotting room " + roomNumber + " of type " + roomType);
    }

    public void allotRoom(int days) {
        System.out.println("Allotting room " + roomNumber + " of type " + roomType + " for " + days + " days");
    }
}

// ACRoom.java
class ACRoom extends HostelRoom {
    public ACRoom(int roomNumber) {
        super("AC", roomNumber);
    }

    @Override
    public void allotRoom() {
        System.out.println("Allotting AC room " + roomNumber);
    }
}

// NonACRoom.java
class NonACRoom extends HostelRoom {
    public NonACRoom(int roomNumber) {
        super("Non-AC", roomNumber);
    }

    @Override
    public void allotRoom() {
        System.out.println("Allotting Non-AC room " + roomNumber);
    }
}

    // Hostel.java
    public class Hostel {
        public static void main(String[] args) {
            HostelRoom acRoom = new ACRoom(101);
            acRoom.allotRoom();

            HostelRoom nonACRoom = new NonACRoom(102);
            nonACRoom.allotRoom();

            HostelRoom acRoom2 = new ACRoom(103);
            acRoom2.allotRoom(5);
        }
    }

