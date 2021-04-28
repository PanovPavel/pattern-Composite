package sample;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
public class Element extends Component{
    public Element() {
        prefix=new Character('-');
        name=new String("varname");
        type=new String("typevar");
        x=1.;
        y=1;
        w=20;
        h=16;
        style="-fx-background-color: darkslateblue; -fx-text-fill: black; -fx-border-insets: 3; -fx-border-width: 1; -fx-border-style: solid;";
    }
    @Override
    public void add(Component component) throws ComponentException {
        throw new ComponentException();
    }

    @Override
    public void remove(Component component) throws ComponentException {
        throw new ComponentException();
    }

    @Override
    public Component getChild(int index) throws ComponentException {
        throw new ComponentException();
    }

    @Override
    public void draw(Pane pane) {
        Label field = (Label) getPicture();// для отображения
        field.setPrefSize((pane.getWidth()*w/100.), (pane.getHeight()*h/100.));
        field.setLayoutX(pane.getWidth()*x/100.);
        field.setLayoutY(pane.getHeight()*y/100.);
        pane.getChildren().add(field);
    }

    @Override
    public Node getPicture() {
        String text=new String(prefix.toString());
        text+=" "+name+":"+type;
        Label field = new Label(text);
        field.setStyle(style);
        return field;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = x;
    }

    @Override
    public void setW(double w) {
        this.w = x;
    }

    @Override
    public void setH(double h) {
        this.h = x;
    }
}
