package ca.ualberta.cs.lonelytwitter;

/**
    TweetTooLongException
    @author: Zach Drever
    Thrown when a tweet is too long
 */
public class TweetTooLongException extends Exception {
    TweetTooLongException(){
        super("This tweet is too long! Please keep your tweets within 140 characters");
    }
}
