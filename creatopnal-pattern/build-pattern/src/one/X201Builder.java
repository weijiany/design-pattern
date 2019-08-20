package one;

/**
 * one.X201 建造者
 */
public class X201Builder implements ComputerBuilder {

    private X201 x201 = new X201();

    @Override
    public void buildRam(String ram) {
        x201.setRam(ram);
    }

    @Override
    public Computer build() {
        return x201;
    }
}
