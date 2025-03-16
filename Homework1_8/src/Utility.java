public class Utility {
    public static boolean moveTourist(Tourist t, Hotel source, Hotel destination) {
        if(source.equals(destination)) {
            return false;
        }
        if(source.getTourists().contains(t)) {
            source.getTourists().remove(t);
            destination.getTourists().add(t);
            return true;
        } else {
            return false;
        }
    }
    public static void printHotels(City c){
        for(Hotel hotel : c.getHotels()) {
            System.out.println(hotel);
        }
    }

    public static boolean isPersonAccommodated(Hotel h, Tourist p) {
        for(Tourist t : h.getTourists()) {
            if(t.equals(p)) {
                return true;
            }
        }
        return false;
    }

    public static void printPeople(City c){
        for(Person person : c.getPeople()) {
            System.out.println(person);
        }
    }

    public static void printTourists(City c){
        for(Hotel hotel : c.getHotels()) {
            System.out.println(hotel.getName());
            for(Tourist tourist : hotel.getTourists()) {
                System.out.println(tourist);
            }
        }

    }
}
