package one;

/**
 * 导演者
 */
public class ComputerDirector {

    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public X201 constructX201() {
        builder.buildRam("4GB 2333MHz");
        return (X201) builder.build();
    }
}
