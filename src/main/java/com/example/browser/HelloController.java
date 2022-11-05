package com.example.browser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.web.WebView;

public class HelloController {
    @FXML
    private WebView webView;

    public void btnOnet(ActionEvent actionEvent) {
        webView.getEngine().load("https://onet.pl");
    }
    public void btnWP(ActionEvent actionEvent) {
        webView.getEngine().load("https://wp.pl");
    }
    public void btnInteria(ActionEvent actionEvent) {
        webView.getEngine().load("https://interia.pl");
    }
    public void btnGazeta(ActionEvent actionEvent) {
        webView.getEngine().load("https://gazeta.pl");
    }
}