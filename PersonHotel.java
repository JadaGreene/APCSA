class Main{

    public static void main(String[] args) {

        Person leo = new Person("leo","red",17,196);
        System.out.println(leo.name);
        System.out.println(leo.hairColor);
        HotelRoom One = new HotelRoom(1);
        One.checkIn(leo);

    }
}