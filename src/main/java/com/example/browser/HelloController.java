package com.example.browser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class HelloController {
    public Button btn3;
    public Button btn4;
    public Button btn2;
    public Button btn1;
    @FXML
    private WebView webView;

    @FXML
void initialize(){
       FileHelper.loadFileContent("C:/Users/Bob/Desktop");
}
    public void btn1clicked(ActionEvent actionEvent) {
        webView.getEngine().load("https://interia.pl");
        btn1.setDisable(true);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
    }
    public void btn2clicked(ActionEvent actionEvent) {
        webView.getEngine().load("https://wp.pl");
        btn1.setDisable(false);
        btn2.setDisable(true);
        btn3.setDisable(false);
        btn4.setDisable(false);
    }
    public void btn3clicked(ActionEvent actionEvent) {
        webView.getEngine().load("https://interia.pl");
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(true);
        btn4.setDisable(false);
    }
    public void btn4clicked(ActionEvent actionEvent) {
        webView.getEngine().load("https://gazeta.pl");
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(true);
    }

}