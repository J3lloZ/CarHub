package com.abc.main

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    private final Listing listings;

    public Main() {
        this.listings = new Listing();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene.fxml"));
        BorderPane root = loader.load();

//        MainSceneController mainSceneController = loader.getController();
//        mainSceneController.setListings(listings);
//
//        MainToolBar mainToolBar = new MainToolBar();
//        MainToolBarController mainToolBarController = new MainToolBarController(mainToolBar, listings);
//        root.setTop(mainToolBar);

        Scene scene = new Scene(root);

        loadStylesheetIntoScene(scene);

        stage.setTitle("CARHUB");
        stage.setScene(scene);
        stage.show();
    }

    private void loadStylesheetIntoScene(Scene scene) {
        URL stylesheetURL = getClass().getResource("style.css");
        if (stylesheetURL == null) {
            return;
        }
        String urlString = stylesheetURL.toExternalForm();
        if (urlString == null) {
            return;
        }
        scene.getStylesheets().add(urlString);
    }

    public static void main(String[] args) {
        launch(args);
    }
}