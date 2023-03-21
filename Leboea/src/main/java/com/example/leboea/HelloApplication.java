package com.example.leboea;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.ObjectInputStream;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        ImageView logoImg = new ImageView();
        ImageView picImg = new ImageView();
        logoImg.setFitHeight(80);
        logoImg.setFitWidth(80);
        Button logo = new Button("Add-Logo");
        logo.setPrefWidth(120);
        Button add = new Button("Add-Header");
        add.setPrefWidth(120);
        Button add1 = new Button("Add-Body");
        add1.setPrefWidth(120);
        Button add2 = new Button("Add-Footer");
        add2.setPrefWidth(120);
        Button add3 = new Button("Add-Image");
        add3.setPrefWidth(120);
        Button add4 = new Button("Add-TextField");
        add4.setPrefWidth(120);
        Button add5 = new Button("Add-Button");
        add5.setPrefWidth(120);
        Button add6 = new Button("Add-TextArea");
        add6.setPrefWidth(120);
        VBox.setMargin(add,new Insets(5));
        VBox.setMargin(add1,new Insets(5));
        VBox.setMargin(add2,new Insets(5));
        VBox.setMargin(add3,new Insets(5));
        VBox.setMargin(add4,new Insets(5));
        VBox.setMargin(add5,new Insets(5));
        VBox.setMargin(add6,new Insets(5));
        VBox.setMargin(logo,new Insets(5));
        HBox.setMargin(picImg,new Insets(5));

        TextField header=new TextField();
        header.setPrefHeight(80);
        header.setPrefWidth(470);
        header.setStyle("-fx-background-color:yellow");

        Pane footer=new Pane();
        footer.setPrefHeight(80);
        footer.setPrefWidth(550);
        footer.setStyle("-fx-border:0");
        footer.setStyle("-fx-background-color:black");

        TextField btnname = new TextField();
        btnname.setMaxWidth(120);
        VBox.setMargin(btnname,new Insets(5));
        btnname.setStyle("-fx-background-color:snow");

        HBox home=new HBox();
        VBox controls = new VBox(10);
        controls.setPrefWidth(150);
        controls.setStyle("-fx-background-color:violet");

        controls.getChildren().addAll(logo,add,add1,add2,add3,add4,btnname,add5,add6);

        VBox display = new VBox(10);

        HBox header1 = new HBox();

        HBox body1 = new HBox(10);
        VBox body2 = new VBox(10);
        body1.getChildren().addAll(body2);

        HBox footer1 = new HBox(10);

        display.getChildren().addAll(header1,body1,footer1);

        logo.setOnAction(event -> {
            FileChooser chooser=new FileChooser();
            var image = chooser.showOpenDialog(stage);
            Image img=new Image(image.getAbsolutePath());
            logoImg.setImage(img);
            header1.getChildren().addAll(logoImg);
        });
        add3.setOnAction(event -> {
            FileChooser choosers=new FileChooser();
            var image = choosers.showOpenDialog(stage);
            Image pic=new Image(image.getAbsolutePath());
            picImg.setImage(pic);
            picImg.setFitWidth(250);
            picImg.setFitHeight(250);
            body1.getChildren().add(picImg);
        });
        add.setOnAction(event -> {
            header1.getChildren().addAll(header);
        });
        add1.setOnAction(event -> {
            body1.setPrefHeight(540);
            body1.setStyle("-fx-background-color:azure");
        });
        add2.setOnAction(event -> {
            footer1.getChildren().addAll(footer);
        });
        add4.setOnAction(event -> {
            TextField textAtea = new TextField();
            textAtea.setPrefWidth(200);
            body2.getChildren().addAll(textAtea);
            VBox.setMargin(textAtea,new Insets(5));
        });
        add5.setOnAction(event -> {
            Button newbbtn = new Button();
            newbbtn.setPrefWidth(120);

            body2.getChildren().addAll(newbbtn);
            VBox.setMargin(newbbtn,new Insets(5));
        });
        add6.setOnAction(event -> {
            TextArea textrea = new TextArea();
            textrea.setPrefWidth(280);
            textrea.setMaxHeight(150);
            body2.getChildren().addAll(textrea);
            VBox.setMargin(textrea,new Insets(5));
        });

        home.getChildren().addAll(controls,display);

        Scene scene = new Scene(home,700, 700, Color.AZURE);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}