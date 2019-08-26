package factory_new;
/*
利用 java8 新特性实现工厂方法
 */
import java.util.function.Supplier;

public interface Creator {

    static Product create(Supplier<? extends Product> supplier) {
        return supplier.get();
    }
}
