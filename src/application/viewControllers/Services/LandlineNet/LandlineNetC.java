package application.viewControllers.Services.LandlineNet;

import application.sceneControler.SceneControler;
import application.tools.date.DateTool;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


import java.net.URL;
import java.util.ResourceBundle;

public class LandlineNetC extends AbstractLandlineNetC {

    @FXML
    protected Label endOfPeriod;

    @Override
    protected void onBackButton(ActionEvent event) {
        SceneControler.getInstance().setSceneWithClear("services","landlineAb");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        super.initialize(url,resourceBundle);
        endOfPeriod.setText(DateTool.getDateWithMonthNames.YearFirst(DateTool.addMonths_(user.getServiceDate(),landlineNetl.getServicesDuration())));
    }
}
