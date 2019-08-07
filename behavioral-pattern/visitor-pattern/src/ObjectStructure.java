import java.util.Random;
import java.util.Vector;

public class ObjectStructure {

    private Vector<Element> elements;

    public ObjectStructure() {
        this.elements = new Vector<>();
        createElements();
    }

    public void action(Visitor visitor) {
        elements.forEach(element -> element.accept(visitor));
    }

    public void add(Element e) {
        elements.add(e);
    }

    private void createElements() {
        Random rand = new Random();
        for (int i = 0; i < 4; i ++)
            if (rand.nextInt(100) > 50) elements.add(new ConcreteElement1());
            else elements.add(new ConcreteElement2());
    }
}
