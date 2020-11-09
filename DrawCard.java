/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;


/**
 *
 * @author buyso
 */

import javafx.scene.image.Image;

//Card +2
public class DrawCard extends Card{
      
    public DrawCard(int color, Image image) {
        this.symbol = '2';
        this.color = color;
        this.image = image;
    }
        
    public boolean canPlayOn(Card card){
        
        if(card.color==this.color){
            return true;
        }
        else if(card.symbol=='2'){
            return true;
        }
        return false;
    }
    
    public void showData()
    {
        System.out.println("Symbol : "+symbol);
        System.out.println("Color : "+color);
    }
    // implement any effects
    public void play(Game g){}
    
}
