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
public class WildCard extends Card{

    public WildCard(Image image) {
        this.symbol = 'C';
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
