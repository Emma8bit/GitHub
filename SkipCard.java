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
public class SkipCard extends Card{

    
    public SkipCard(int color, Image image) {
        this.symbol = 'S';
        this.color = color;
        this.image = image;
    }
    
    public boolean canPlayOn(Card card){
        return false;
    }
    
    
    public void showData()
    {
        System.out.println("Symbol : "+symbol);
        System.out.println("Color : "+color);
    }
}
