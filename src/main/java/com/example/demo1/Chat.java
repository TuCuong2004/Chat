package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Chat implements Initializable {
    @FXML
    TextArea chatText;
    @FXML
    Button sentButton;
    int maxSize = 10;
    @FXML
    VBox chatBox;
    @FXML
    public void clickSentButton () {
        TextField temp = new TextField(chatText.getText());
        temp.setMaxWidth(6.35*chatText.getText().length()+18.75);
        temp.setMaxHeight(10);
        temp.setStyle("  -fx-background-color: #ffc8dd;" +
                "  -fx-background-radius: 0 20 20 20;");
        chatBox.getChildren().add(temp);
        TextField temp1 = new TextField("some thing!");
        temp1.setMaxWidth((6.35*temp1.getText().length()+18.75));
        temp1.setMaxHeight(10);
        temp1.setStyle("  -fx-background-color: #ffc8dd;" +
                "  -fx-background-radius: 20 0 20 20;" + "-fx-alignment: baseline-right;");
        chatBox.getChildren().add(temp1);
        Insets rightMargin = new Insets(0, 0, 0, 390-(6.35*temp1.getText().length()+18.75));
        VBox.setMargin(temp1,rightMargin);
        //System.out.println(500-(6.35*temp1.getText().length()+18.75));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        chatBox.setSpacing(5);
    }
}
