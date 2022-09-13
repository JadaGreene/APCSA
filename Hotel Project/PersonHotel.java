class Main{

    public static void main(String[] args) {
        Person leo = new Person("leo","red", 17, 196);
        Person geo = new Person("geo:", "brown", 18, 194);
        Person elios = new Person("elios", "dirty blonde", 18, 199);
        HotelRoom One = new HotelRoom(1);
        One.checkIn(leo);
        One.checkIn(geo);
        One.checkIn(elios);
        int x = 0;
        x = One.checkCapacity();
        System.out.println("there are: " + x + " guest in the room");
        One.printGuestInfo();

    }

}
