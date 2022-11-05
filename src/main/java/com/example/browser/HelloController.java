package com.example.browser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;

import java.util.stream.Stream;

public class HelloController {
    public Button btn3;
    public Button btn4;
    public Button btn2;
    public Button btn1;
    @FXML
    private WebView webView;

    public void btnOnet(ActionEvent actionEvent) {
        webView.getEngine().load("https://onet.pl");
        btn1.setDisable(true);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
    }
    public void btnWP(ActionEvent actionEvent) {
        webView.getEngine().load("https://wp.pl");
        btn1.setDisable(false);
        btn2.setDisable(true);
        btn3.setDisable(false);
        btn4.setDisable(false);
    }
    public void btnInteria(ActionEvent actionEvent) {
        webView.getEngine().load("https://interia.pl");
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(true);
        btn4.setDisable(false);
    }
    public void btnGazeta(ActionEvent actionEvent) {
        webView.getEngine().load("https://gazeta.pl");
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(true);
    }

}