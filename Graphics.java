/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.File;
import java.net.MalformedURLException;

/**
 *
 * @author buyso
 */
public class Graphics {

    
    
    private Image [] allNumbers = new Image[55];
    private Image [] reverse = new Image[4];
    private Image [] skip = new Image[4];
    private Image [] draw = new Image[4];
    private Image back;
    private Image wild;
    private Image wildDraw;
    
    
    public Graphics() throws MalformedURLException 
    {
        boolean backgroundLoading = true;
        String col = "";
        int cmpt=0;
        File file, file2, file3, file4;
        
        //For the 4 colors
        for(int i=0; i<4; i++)
        {  
            
 
            //There are cards numbered from 1 to 9 + 4 zeroes
            for(int j=0; j<10; j++)
            {
                if(i==0)
                    col = "Red";
                else if (i==1)
                    col = "Green";
                else if (i==2)
                    col = "Blue";
                else if (i==3)
                    col = "Yellow";
                
                file = new File("C:\\Users\\emmae\\Desktop\\UNO_java\\UnoCards\\"+col+"_"+j+".png");
             
                String localUrl = file.toURI().toURL().toString();
                Image newImage = new Image(localUrl);
                allNumbers[cmpt] = newImage;
                cmpt++;
            }
            
         //load the draw/+2 cards
         file2 = new File("C:\\Users\\emmae\\Desktop\\UNO_java\\UnoCards\\"+col+"_"+"draw"+".png");
         String localUrl2 = file2.toURI().toURL().toString();
         Image newImage2 = new Image(localUrl2);
         allNumbers[i] = newImage2;  
         
         //load the reverse cards
         file3 = new File("C:\\Users\\emmae\\Desktop\\UNO_java\\UnoCards\\"+col+"_"+"reverse"+".png");
         String localUrl3 = file3.toURI().toURL().toString();
         Image newImage3 = new Image(localUrl3);
         allNumbers[i] = newImage3;
         
         //load the skip cards
         file4 = new File("C:\\Users\\emmae\\Desktop\\UNO_java\\UnoCards\\"+col+"_"+"skip"+".png");
         String localUrl4 = file4.toURI().toURL().toString();
         Image newImage4 = new Image(localUrl4);
         allNumbers[i] = newImage4;
            
        }
        
        //We load the image of the back card for the deck
        file = new File("C:\\Users\\emmae\\Desktop\\UNO_java\\UnoCards\\back.png");
        
        // --> file:/C:/MyImages/myphoto.jpg
        String localUrl = file.toURI().toURL().toString(); 
//                System.out.println("file : "+localUrl);
//                System.out.println("cmpt : "+cmpt);
        back = new Image(localUrl);
        
        //We load the wild card
        file = new File("C:\\Users\\emmae\\Desktop\\UNO_java\\UnoCards\\Wild.png");
        localUrl = file.toURI().toURL().toString();
        wild = new Image(localUrl);
        
        
        //We load the wild draw card !
        file = new File("C:\\Users\\emmae\\Desktop\\UNO_java\\UnoCards\\Wild_draw.png");
        localUrl = file.toURI().toURL().toString();
        wildDraw = new Image(localUrl);
    }
    
    //Getter
    public Image getNumberImage (int i)
    {
        return allNumbers[i];
    }
    
    public Image getReverse(int j) {
        return reverse[j];
    }

    public Image getSkip(int k) {
        return skip[k];
    }

    public Image getDraw(int m) {
        return draw[m];
    }

    public Image getWildDraw() {
        return wildDraw;
    }
    
    public Image getBackImage()
    {
        return back;
    }
    
    public Image getWild(){
        return wild;
    }
};
