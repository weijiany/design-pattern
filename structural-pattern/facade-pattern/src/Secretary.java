public class Secretary {

    private Airport airport = new Airport();

    private Restaurant restaurant = new Restaurant();

    public void trip(String to, int days) {
        airport.bookTicket("唐山", to);
        System.out.println("住宿" + days + "天");
    }

    public void repast(int num) {
        restaurant.reserve(num);
    }
}
