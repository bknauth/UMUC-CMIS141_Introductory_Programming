package knauthbenjaminp3;

import java.io.IOException;

public class BenjaminKnauthP3test {
  
    public static void main(String[] args) throws IOException{
         
        
        java.io.File file = new java.io.File(args[0]);
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
        //Initialize and create array of guitar objects.
        output.println("Welcome to the Guitar Building Program.\n");
       
        BenjaminKnauthP3[] guitarType = new BenjaminKnauthP3[5];
        
        for (int i = 0; i < guitarType.length; i++){
          guitarType[i] = new BenjaminKnauthP3();
        }
        
        //First object.
        guitarType[0].numStrings = 6;
        output.println("Your first guitar is an Ibinez.");
        guitarType[0].tuneGuitar(output);
        output.println("You strum the following string: ");
        guitarType[0].alpha(output);
        guitarType[0].playGuitar(output);
        output.println("You rock out to Stairway To Heavan!");
        guitarType[0].playSolo(output);
        output.println("The crowd cheers your solo!");
        guitarType[0].cancelSolo(output);
        guitarType[0].cancelPlayGuitar(output);
        
        //Second object.
        guitarType[1].numStrings = 6;
        output.println("Your second guitar is a Fender.");
        guitarType[1].tuneGuitar(output);
        output.println("You strum the following string: ");
        guitarType[1].bravo(output);
        guitarType[1].playGuitar(output);
        output.println("You rock out to Free Bird!");
        guitarType[1].playRythm(output);
        output.println("You enjoy strumming along with the band.");
        guitarType[1].cancelRythm(output);
        guitarType[1].cancelPlayGuitar(output);
        
        //Third object.
        guitarType[2].numStrings = 6;
        output.println("Your third guitar is a Gibson.");
        guitarType[2].tuneGuitar(output);
        output.println("You strum the following string: ");
        guitarType[2].echo(output);
        guitarType[2].playGuitar(output);
        output.println("You play a beautiful rendition of Enter Sandman.");
        output.println("You provide the rythm and a solo for the song.");
        guitarType[2].playRythm(output);
        guitarType[2].cancelRythm(output);
        guitarType[2].playSolo(output);
        guitarType[2].cancelSolo(output);
        guitarType[2].cancelPlayGuitar(output);
        
        //Fourth object.
        guitarType[3].numStrings = 6;
        output.println("Your fourth guitar is a classical from Italy.");
        guitarType[3].tuneGuitar(output);
        output.println("You strum the following string: ");
        guitarType[3].delta(output);
        guitarType[3].playGuitar(output);
        output.println("You play a song for your mom.");
        guitarType[3].playRythm(output);
        guitarType[3].cancelRythm(output);
        guitarType[3].cancelPlayGuitar(output);
        
        //Fifth object.  Utilizes stringNote2 to create a guitar that doesn't 
        //have 6 strings.
        guitarType[4].numStrings = 12;
        
        guitarType[4].stringNote2 = new char[12];
          guitarType[4].stringNote2[0] = 'E';
          guitarType[4].stringNote2[1] = 'e';
          guitarType[4].stringNote2[2] = 'A';
          guitarType[4].stringNote2[3] = 'a';
          guitarType[4].stringNote2[4] = 'D';
          guitarType[4].stringNote2[5] = 'd';
          guitarType[4].stringNote2[6] = 'G';
          guitarType[4].stringNote2[7] = 'g';
          guitarType[4].stringNote2[8] = 'B';
          guitarType[4].stringNote2[9] = 'b';
          guitarType[4].stringNote2[10] = 'E';
          guitarType[4].stringNote2[11] = 'e';
        
        output.println("Your fifth guitar is a 12 string acoustic.");
        guitarType[4].tuneGuitar(output);
        output.println("You strum the following string: ");
        output.println(guitarType[4].stringNote2[1]);
        guitarType[4].playGuitar(output);
        output.println("You play a song for your dad.");
        guitarType[4].playRythm(output);
        guitarType[4].cancelRythm(output);
        guitarType[4].cancelPlayGuitar(output);
        
        
        //5 identical guitars that do the same thing.
        BenjaminKnauthP3[] guitarType2 = new BenjaminKnauthP3[5];
        
        for (int i = 0; i < guitarType2.length; i++){
          guitarType2[i] = new BenjaminKnauthP3();
          output.println("Here is guitar " + (i + 1) + ".");
          guitarType2[i].tuneGuitar(output);
          guitarType2[i].playGuitar(output);
          guitarType2[i].playRythm(output);
          guitarType2[i].cancelRythm(output);
          guitarType2[i].playSolo(output);
          guitarType2[i].cancelSolo(output);
          guitarType2[i].cancelPlayGuitar(output);
          
        }
        output.close();
    }
}
