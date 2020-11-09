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
public class WildDrawCard extends Card{

    public WildDrawCard(Image image) {
        this.symbol = '4';
        this.color = 5;
        this.image = image;
    }
    
    public boolean canPlayOn(Card card){
        return true;
    }
    
    public void showData()
    {
        System.out.println("Symbol : "+symbol);
        System.out.println("Color : "+color);
    }
    
}
