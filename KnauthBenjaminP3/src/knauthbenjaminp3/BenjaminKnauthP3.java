package knauthbenjaminp3;

import java.io.PrintWriter;
public class BenjaminKnauthP3{
    
      int numStrings;
      static PrintWriter output;
      char[] stringNote = {'E', 'A', 'D', 'G', 'B', 'E'};
      char[] stringNote2;
      boolean tuned;
      boolean playing;
      boolean rythm;
      boolean solo;
      
      public BenjaminKnauthP3(){
        
        tuned = false;
        playing = false;
        rythm = false;
        solo = false;
      }
      
      public void tuneGuitar(PrintWriter output){
        tuned = true;
        output.println("Your guitar is now tuned.");
      }
      
      public void playGuitar(PrintWriter output){
        playing = true;
        output.println("You begin to play your guitar.");
      }
      
      public void cancelPlayGuitar(PrintWriter output){
        playing = false;
        output.println("You have stopped playing your guitar.\n");
        
      }
      
      public void playRythm(PrintWriter output){
        rythm = true;
        output.println("You have begun playing backup rythm on your "
                + "guitar.");
      }
      
      public void cancelRythm(PrintWriter output){
        rythm = false;
        output.println("You stop playing backup rythm on your guitar.");
      }
      
      public void playSolo(PrintWriter output){
        solo = true;
        output.println("You begin to play a rockin' solo on your guitar!");
      }
      
      public void cancelSolo(PrintWriter output){
        solo = false;
        output.println("You finish playing your solo.");
      }
      
      public void echo(PrintWriter output){
        output.println(stringNote[0]);
      }
      
      public void alpha(PrintWriter output){
        output.println(stringNote[1]);
      }
      
      public void delta(PrintWriter output){
        output.println(stringNote[2]);
      }
      
      public void golf(PrintWriter output){
        output.println(stringNote[3]);
      }
      
      public void bravo(PrintWriter output){
        output.println(stringNote[4]);
      }
}