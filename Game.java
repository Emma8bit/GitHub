/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.Collections;
import java.util.ArrayList;
import javafx.scene.image.Image;
import java.net.MalformedURLException;



/**
 *
 * @author buyso
 */
public class Game
{
    
    //Story [] stories = new Story [3];
    private ArrayList<Card> Deck_cards = new ArrayList<Card>();
    private ArrayList<Integer> Deck_pos = new ArrayList<>();
    private int imageCmpt;
    private Image back;
    private Graphics myGraphs;
    private Player player1; 
    private Card upCard;
    boolean played = false;
    
    
    public Game() throws MalformedURLException
    {
        this.myGraphs = new Graphics();
        imageCmpt = 0;
        int c=1;
        
        
       // There are 2*4 series of cards in UNO Game
        for(int i=0; i<4; i++)
        {
            NumberCard nouv1 = new NumberCard(0,i,myGraphs.getNumberImage(imageCmpt));
            imageCmpt++;
            Deck_cards.add(nouv1);
            
            WildCard w = new WildCard(myGraphs.getWild());
            WildDrawCard d = new WildDrawCard(myGraphs.getWildDraw());
            Deck_cards.add(w);
            Deck_cards.add(d);
            
            //There are cards numbered from 1 to 9
            for(int j=1; j<10; j++)
            {
                NumberCard nouv = new NumberCard(j,i,myGraphs.getNumberImage(imageCmpt));
                imageCmpt++;
                Deck_cards.add(nouv);
                Deck_cards.add(nouv);
            }
        }
        for(int i = 0; i<Deck_cards.size(); i++)
        {
            Deck_pos.add(i);
        }
        player1 = new Player();
        ShuffleDeck();
        DealInit();
        upCard = Deck_cards.get(Deck_pos.get(0));
        
        //To check if the first card of the game is not a special card
        while(upCard.symbol=='4' || upCard.symbol=='C'){
            upCard = Deck_cards.get(Deck_pos.get(c));
            c++;
        }      
        showData();
    }
    
    //Method to display deck on console
    public void showData(){
        for (int i=0; i<Deck_cards.size(); i++){
            System.out.println("test");
            Deck_cards.get(i).showData();
        }
    }
    
    public void draw ()
    {
        player1.draw(Deck_cards.get(Deck_pos.get(1)));
        Deck_cards.remove(Deck_pos.get(1));
        Deck_pos.remove(1);
        //upCard = Deck_cards.get(Deck_pos.get(1));
    }
    
    public Image getBackImage()
    {
        return myGraphs.getBackImage();
    }
    
    public Player getPlayer1()
    {
        return player1;
    }
    public void showDeck_pos()
    {
        System.out.println("POS TAB");
        System.out.print("[");
        for (int i=0; i<Deck_cards.size(); i++)
        {
            System.out.print(Deck_pos.get(i)+" ");
        }
        System.out.print("]");
        //launch();
    }
    
    public void ShuffleDeck()
    {
        //System.out.println("Shuffling");
        Collections.shuffle(Deck_pos);
        //System.out.println("Shuffled");
    }
    
    public Card getFirstCard()
    {
        return Deck_cards.get(Deck_pos.get(1));
    }
    
    public void DealInit()
    {
        ShuffleDeck();
        for(int i=0; i<7; i++)
        {
            player1.AddToHand(Deck_cards.get(Deck_pos.get(i)));
            Deck_cards.remove(Deck_pos.get(i));
            Deck_pos.remove(i);
        }
    }
    
    public Card getUpCard ()
    {
        return upCard;
    }
    
    public void setUpCard (Card up)
    {
        upCard = up;
        played = true;
    }
    
}
