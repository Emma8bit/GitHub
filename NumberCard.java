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
public class NumberCard extends Card{

     public NumberCard(int value, int color, Image image) {
        this.symbol = 'N';
        this.color = color;
        this.value = value;
        this.image = image;
    }
     
    public boolean canPlayOn(Card card){
        
        if(card.color == this.color)
            return true;
        else if(card.symbol == 'N')
        {
            if (card.value == this.value)
                return true;
        }
        return false;
    }
        
    public void showData()
    {
        System.out.println("Symbol : "+symbol);
        switch (color)
        {
            case RED:
                 System.out.println("Color : RED");
                 break;
            case BLUE:
                 System.out.println("Color : BLUE");
                 break;
            case GREEN:
                 System.out.println("Color : GREEN");
                 break;
            case YELLOW:
                 System.out.println("Color : Yellow");
                 break;
            default :
                System.out.println("ERROR");
                break;
        }
        System.out.println("Value : "+value);
    }
}
