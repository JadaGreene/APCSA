class Main{

    public static void main(String[] args) {
        Person leo = new Person("leo","red", 17, 196);
        Person geo = new Person("geo:", "brown", 18, 194);
        HotelRoom One = new HotelRoom(1);
        One.checkIn(leo);
        One.checkIn(geo);
        int x = 0;
        x = One.checkCapacity();
        System.out.println("there are: " + x + " guest in the room");
        One.printGuestInfo();

    }

}

