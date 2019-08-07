public class VehicleAdapter extends Car implements Bike {

    @Override
    public void move() {
        super.run();
        System.out.println("自行车的适配器。");
    }
}
