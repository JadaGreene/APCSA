public class HotelRoom {
    Person guestOne;
    Person guestTwo;
    int roomNumber;

    HotelRoom(int rn){
        roomNumber = rn;
    }

    void checkIn(Person guest){
        if(guestOne == null){
            guestOne = guest;
            roomNumber = 1;
            System.out.println(guestOne + " checked into room " + roomNumber);
        }
        else if(guestTwo == null){
            guestTwo = guest;
            roomNumber = 1;
            System.out.println(guestTwo + " checked into room " + roomNumber);
        }
        else if(guestOne != null && guestTwo != null){
            System.out.println(" we are at capacity");

        }
    }

    void checkOut(Person guest){
        if(guestOne == guest){
            System.out.println(guestOne.name + " checked out of " + roomNumber);
            guestOne = null;
        }
        else if(guestTwo == guest){
            System.out.println(guestTwo.name + "checked out of " + roomNumber);
            guestTwo = null;
        }
    }
}
//to compile - javac filename
//to run - java mainclassname