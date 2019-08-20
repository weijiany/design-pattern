package one;

/**
 * 电脑抽象类
 */
public abstract class Computer {

    private String type; // 型号

    private String ram; // 内存

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "one.Computer{" +
                "type='" + type + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
