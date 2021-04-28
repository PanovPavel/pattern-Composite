package sample;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

//Composite отвечает за агрегацию элементарных объектов
public class Composite extends Component{
    ArrayList <Component> array=new ArrayList<>();// агрегатор элементарных объектов
    public Composite(ArrayList<Component> array) {// может быть реализован и с другим набором параметров
        this.array = array;
    }

    @Override
    public void add(Component component) throws ComponentException {
        array.add(component);
    }

    @Override
    public void remove(Component component) throws ComponentException {
        array.remove(component);
    }

    @Override
    public Component getChild(int index) throws ComponentException {
        return array.get(index);
    }

    @Override
    public void draw(Pane pane) {
        if (array.isEmpty()) return;
        for (Component comp: array) comp.draw(pane);
    }

    @Override
    public Node getPicture() {
        return null;
    }

    @Override
    public void setX(double x) {
        if (array.isEmpty()) return;
        for (Component comp: array) comp.setX(x);
    }

    @Override
    public void setY(double y) {
        if (array.isEmpty()) return;
        for (Component comp: array) comp.setY(y);
    }

    @Override
    public void setW(double w) {
        if (array.isEmpty()) return;
        for (Component comp: array) comp.setW(w);
    }

    @Override
    public void setH(double h) {
        if (array.isEmpty()) return;
        for (Component comp: array) comp.setH(h);
    }
}
