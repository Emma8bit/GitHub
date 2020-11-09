/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author buyso
 */
public class Player {
    private ArrayList<Card> hand = new ArrayList<Card>();
//    public Stage classStage;
//    
//    Player()
//    {
//        classStage = new Stage();
//    }
    
    public void AddToHand(Card add)
    {
        this.hand.add(add);
    }
    
    public void showHand()
    {
        if(hand.size()!=0)
        {
            for(int i=0; i<hand.size(); i++)
            {
                hand.get(i).showData();
            }
        }
        else
            System.out.println("Empty hand");
    }
    
    public Card getHand(int i)
    {
        return hand.get(i);
    }
    
    public void play (Game g)
    {
        boolean played = false;
        for(int i=0; i<hand.size(); i++)
        {
            if (hand.get(i).canPlayOn(g.getUpCard()))
            {
                g.setUpCard(hand.get(i));
                hand.remove(i);
                played = true;
            }
        }
        if(played == false)
        {
            System.out.println("Pioooooooooooooooooooche !!!");
        }
    }
    
    public void draw (Card last)
    {
        hand.add(last);
    }
    
    public int getHandSize()
    {
        return hand.size();
    }
    
    public boolean  playCard(Game g, int i)
    {
        boolean played = false;
        if (hand.get(i).canPlayOn(g.getUpCard()))
        {
            g.setUpCard(hand.get(i));
            hand.remove(i);
            played = true;
        }
//        if(played == false)
//        {
//            //System.out.println("Pioooooooooooooooooooche !!!");
//            //g.draw();
//        }
        return played;
    }
    
    public boolean autoPlayCard (Game g, int i)
    {
        boolean played = false;
        if (hand.get(i).canPlayOn(g.getUpCard()))
        {
            g.setUpCard(hand.get(i));
            hand.remove(i);
            played = true;
        }
        if(played == false)
        {
            System.out.println("Pioooooooooooooooooooche !!!");
            g.draw();
        }
        return played;
    }
    
    
    
//    public void start(Stage primaryStage) throws FileNotFoundException 
//    {
//        System.out.println("SHOW DATA IN START ");
//        showHand();
//        classStage = primaryStage;
////        ImageView Card_1 = new ImageView();
////        //System.out.println("Deck_pos.get(0) : "+Deck_pos.get(0));
////        Card_1.setImage(hand.get(0).getImage());
////        ImageView Card_2 = new ImageView();
////        Card_2.setImage(hand.get(1).getImage());
////        ImageView Card_3 = new ImageView();
////        Card_3.setImage(hand.get(2).getImage());
////        ImageView Card_4 = new ImageView();
////        Card_4.setImage(hand.get(3).getImage());
////        ImageView Card_5 = new ImageView();
////        Card_5.setImage(hand.get(4).getImage());
////        ImageView Card_6 = new ImageView();
////        Card_6.setImage(hand.get(5).getImage());
////        ImageView Card_7 = new ImageView();
////        Card_7.setImage(hand.get(6).getImage());
////        //System.out.println("Deck_pos.get(1) : "+Deck_pos.get(1));
////        Card_2.setX(200);
////        Card_3.setX(400);
////        Card_4.setX(600);
////        Card_5.setX(800);
////        Card_6.setX(1000);
////        Card_7.setX(1200);
//        //Card_2.setY(0);
//         
////        Pane root = new Pane();
////        root.getChildren().addAll(Card_1,Card_2,Card_3,Card_4, Card_5,Card_6,Card_7);
////        
////        Scene scene = new Scene(root, 2000, 1000);
////        primaryStage.setScene(scene);
////        primaryStage.setTitle("Player1");
////        primaryStage.show();
//    }
}
