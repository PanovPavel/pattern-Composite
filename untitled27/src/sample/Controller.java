package sample;
import java.util.ArrayList;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
public class Controller {
    @FXML
    Pane pane;
    public void action(ActionEvent actionEvent) throws Component.ComponentException {
        Element element = new Element();
       // element.draw(pane);

        Element element2 = new Element();
        element2.setX(2);
        element2.setY(100);
   //     element2.draw(pane);

        Composite composite = new Composite(new ArrayList<>());
        composite.add(element);
        composite.add(element2);
        composite.draw(pane);

    }

    public void buttonTWO(ActionEvent actionEvent) {
    }
}
