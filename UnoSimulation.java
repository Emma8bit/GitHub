/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene; 
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Translate; 
import javafx.scene.input.MouseEvent;
import java.util.Map;
import java.util.HashMap;



/**
 *
 * @author buyso
 */

public class UnoSimulation extends Application{
    
        Game newGame;
        //Map <Integer ,ImageView> h_card = new HashMap<>();
        int x=0;
        ArrayList<ImageView> Hand_cards = new ArrayList();
        int y=700;
        boolean button = false;
        Pane root = new Pane();
        Scene scene;
        Translate translate = new Translate();
        Stage stage;
        int handSize;
        final int handSizemax = 19;
        ImageView pile;
        int j;
        boolean canPlayCard;
        
    public UnoSimulation() throws MalformedURLException {
        this.newGame = new Game();
    }
    
//    public void uploadScene ()
//    {
//        root.getChildren().add(Hand_cards.get(handSize));
//        scene.setRoot(root);
//    }
//   
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException, MalformedURLException 
    {
        stage = primaryStage;
        handSize = newGame.getPlayer1().getHandSize();
        for(int i=0; i<handSize ; i++)
        {
            System.out.println("OK");
            ImageView newCard = new ImageView();
            newCard.setImage(newGame.getPlayer1().getHand(i).getImage()); 
            x += 100;
            newCard.setX(x);
            newCard.setY(y);
            Hand_cards.add(newCard);
            Hand_cards.get(i).setPickOnBounds(true); // allows click on transparent areas
            
        }  
        
        for(int i=handSize ; i<handSizemax; i++)
        {
            ImageView newCard = new ImageView();
            Hand_cards.add(newCard);
        }
        
        for(int i=0; i< handSize; i++)
        {
            
            Hand_cards.get(i).setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                    
                public void handle(MouseEvent event) 
                {
                    //newGame.getPlayer1().playCard(newGame, j);
                    System.out.println("carte : ");
                }
            });
        }
        
        ImageView back = new ImageView();
        back.setImage(newGame.getBackImage());
//        Button draw = new Button();
//        draw.setGraphic(back);
//        draw.setPrefSize(80, 60);
//        
//        draw.setLayoutX(500);
//        draw.setLayoutY(100);
        
        
        //System.out.println("Deck_pos.get(0) : "+Deck_pos.get(0));
        back.setImage(newGame.getBackImage());
        back.setX(500);
        back.setY(100);
        
        
        
        //ImageView img = new ImageView("http://i.stack.imgur.com/oURrw.png");
        back.setPickOnBounds(true); // allows click on transparent areas
        back.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                
                handSize++;
                if(handSize<handSizemax)
                {
                    x += 100;
                    Hand_cards.get(handSize+1).setImage(newGame.getFirstCard().getImage());
                    Hand_cards.get(handSize+1).setX(x);
                    Hand_cards.get(handSize+1).setY(y);
                    newGame.draw();
                    //pile.setImage(newGame.getUpCard().getImage());
                }
                
               
                
                //uploadScene();
            }

//            @Override
//            public void handle(MouseEvent t) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
        });
        
        
        pile = new ImageView();
        //System.out.println("Deck_pos.get(0) : "+Deck_pos.get(0));
        pile.setImage(newGame.getUpCard().getImage());
        
        pile.setX(700);
        pile.setY(100);
          
        for(int i=0; i<handSizemax; i++)
        {
            //Buffer to display the cards
            root.getChildren().add(Hand_cards.get(i));
        }
        
        
        root.getChildren().add(back);
        root.getChildren().add (pile);
        //root.getChildren().add (btn);
        
        //Window
        scene = new Scene(root, 2000, 1000);
        stage.setScene(scene);
        stage.setTitle("Player1"); //Show window
        stage.show();
        
        //newGame.getPlayer1().play(newGame);
    }
    public static void main(String[] args) throws MalformedURLException, FileNotFoundException {
        
        launch(args);
    }
    
    
}
