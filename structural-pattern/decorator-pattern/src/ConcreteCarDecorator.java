public class ConcreteCarDecorator extends CarDecorator {

    public ConcreteCarDecorator(Car car) {
        super(car);
    }

    private void print() {
        System.out.println("对车进行彩绘~~~");
    }

    private void setGPS() {
        System.out.println("给车安装GPS系统~~~");
    }

    @Override
    public void show() {
        super.show();
        print();
        setGPS();
    }
}
