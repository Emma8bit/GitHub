/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import javafx.scene.image.Image;

/**
 *
 * @author buyso
 */
public class ReverseCard extends Card{
        
    public ReverseCard(int color, Image image) {
        this.symbol = 'R';
        this.color = color;
        this.image = image;
    }
    
    public boolean canPlayOn(Card card){
        
        //We can play only if it's the same color before
        if(card.color == this.color){
            return true;
        }
        
        //Or if the actual card is the same card 
        else if(card.symbol=='R'){
            return true;
        }
        return false;
    }
    
    public void showData()
    {
        System.out.println("Symbol : "+symbol);
        System.out.println("Color : "+color);
    }
}
