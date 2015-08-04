
package stringbuffertopic;


public class StringBufferTopic {

    public static void main(String[] args) {
       
        StringBuffer myString = new StringBuffer("Who needs C++ when you have"
                + " Java?");
        System.out.println(myString);
        
        //Deletes "C++ when you have"
        myString.delete(9, 27);
        System.out.println(myString);
        
        //Creates line "Who needs Java when you have C++?" 
        myString.insert(14, " when you have C++");
        System.out.println(myString);
        
        //Replaces "Java" with "to pick a language".
        myString.replace(10, 14, "to pick a language");
        System.out.println(myString);
        
        //Reversed line to "?++C evah uoy nehw  egaugnal a kcip otJ sdeen ohW".
        myString.reverse();
        System.out.println(myString);
    }
}
