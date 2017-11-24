
package Searching;


public class StringReview {

   
    public static void main(String[] args) {
                  //1234567890123456789
        String x = "the Quick Brown Fox";
        //index of - finds location of something, returns an int
        int loc = x.indexOf("Q");
        System.out.println("Q Is At " + loc);
        
        loc = x.indexOf("o", 13);
        System.out.println("Starting At 13, O Is At " + loc);
        
        loc = x.indexOf("Q", 13);
        System.out.println("Starting At 13, Q Is At " + loc);
        
        char c = x.charAt(13);
        System.out.println("The Charcater At 13 Is '" + c + "'");
        
        int len = x.length();
        System.out.println(x + " Is " + len + " Charcaters Long.");
        
        //substring - returns a string that is part of the given location
        String y = x.substring(10, 13); // 13 no included
        System.out.println(y);
        y = x.substring(16); //16 to the end
        System.out.println(y);
        
        System.out.println(x.toUpperCase()); //call as you print the string
        
        //CompareTo-->
        x = x.toLowerCase();
        
        y = "jumped Over The Lazy Dog";
        int z = y.compareTo(x);
        System.out.println("y Compared To x Is " + z);
        
        z = x.compareTo(y);
        System.out.println("x Compared To y Is " + z);
        //"t"he vs "j"umped - 10 letters away -10
        //positive means first hings is further down the alphabet
        System.out.println("Bob vs Andy: " + "Bob".compareTo("Andy")); //1
        System.out.println("Bob vs Bob: " + "Bob".compareTo("Bob")); //0  
        System.out.println("Tim vs Tom: " + "Tim".compareTo("Tom")); //t is ties, 1 vs. o- -6
        System.out.println("(Bob vs bob: " + "Bob".compareTo("bob")); //1
        //moral od story -> compareTo - 0 means yo have an exact match
    }
    
}
