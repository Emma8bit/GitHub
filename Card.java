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
public abstract class Card {
    
    protected char symbol;
    protected int color;
    protected Image image;
    protected int value = 10;
    
    public static final int RED = 0;
    public static final int BLUE = 1;
    public static final int GREEN = 2;
    public static final int YELLOW = 3;
    
    // get the colour
    public Image getImage ()
    {
        return image;
    }
    
    public char getSymbol() {
        return symbol;
    }

    public int getColor() {
        return color;
    }
    
    // test if it can be played
    public abstract boolean canPlayOn(Card card);
    
    public abstract void showData();
    
};
