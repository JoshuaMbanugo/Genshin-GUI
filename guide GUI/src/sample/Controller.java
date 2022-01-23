package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML ImageView talent1;
    @FXML ImageView talent2;
    @FXML ImageView talent3;

    @FXML ImageView weapon1;
    @FXML ImageView weapon2;
    @FXML ImageView weapon3;

    @FXML Button bRefresh;

    Image book1 = new Image("graphics/Item_Guide_to_Freedom.png");
    Image book2 = new Image("graphics/talMat_resistance_GuideToResistance.png");
    Image book3 = new Image("graphics/Item_Guide_to_Ballad.png");

    Image brochure1 = new Image("graphics/Item_Guide_to_Prosperity.png");
    Image brochure2 = new Image("graphics/guide-to-diligence-genshin-impact-guide-min.png");
    Image brochure3 = new Image("graphics/Item_Guide_to_Gold.png");

    Image scroll1 = new Image("graphics/Material-Guide-to-Transience.png");
    Image scroll2 = new Image("graphics/Item_Guide_to_Elegance.png");
    Image scroll3 = new Image("graphics/Material-Guide-to-Light.png");

    Image mon1 = new Image("graphics/decabarian.png");
    Image mon2 = new Image("graphics/Item_Relic_from_Guyun.png");
    Image mon3 = new Image("graphics/Item_Jade_Branch_of_a_Distant_Sea.png");

    Image tue1 = new Image("graphics/tooth.png");
    Image tue2 = new Image("graphics/Item_Mist_Veiled_Gold_Elixir.png");
    Image tue3 = new Image("graphics/Item_Narukami's_Affection.png");

    Image wed1 = new Image("graphics/Item_Shackles_of_the_Dandelion_Gladiator.png");
    Image wed2 = new Image("graphics/Item_Bit_of_Aerosiderite.png");
    Image wed3 = new Image("graphics/Item_Mask_of_the_One-Horned.png");

    Image all = new Image("graphics/anemo.png");

    String data;

    public void displayImage() {

        Date currentDate = new Date();
        SimpleDateFormat time = new SimpleDateFormat("EEEE");
        data = time.format(currentDate);


        if(data.equals("Monday") || (data.equals("Thursday"))) {
            // Talent refreshes, Refreshes when it is Monday or Thursday
            talent1.setImage(book1);
            talent2.setImage(brochure1);
            talent3.setImage(scroll1);

            // Weapons refreshes, Refreshes when it is Monday or Thursday
            weapon1.setImage(mon1);
            weapon2.setImage(mon2);
            weapon3.setImage(mon3);

        } else if(data.equals("Tuesday") || (data.equals("Friday"))) {
            // Talent refresh
            talent1.setImage(book2);
            talent2.setImage(brochure2);
            talent3.setImage(scroll2);

            // Weapons refresh
            weapon1.setImage(tue1);
            weapon2.setImage(tue2);
            weapon3.setImage(tue3);

        } else if(data.equals("Wednesday") || (data.equals("Saturday"))) {
            // Talent Refresh
            talent1.setImage(book3);
            talent2.setImage(brochure3);
            talent3.setImage(scroll3);

            // Weapons  refresh
            weapon1.setImage(wed1);
            weapon2.setImage(wed2);
            weapon3.setImage(wed3);
        } else {
            talent1.setImage(all);
            talent2.setImage(all);
            talent3.setImage(all);
            weapon1.setImage(all);
            weapon2.setImage(all);
            weapon3.setImage(all);
        }
    }

public void switchToHome(ActionEvent event) throws IOException {

    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}

public void switchToWeaponsScene(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Weapons.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
}
