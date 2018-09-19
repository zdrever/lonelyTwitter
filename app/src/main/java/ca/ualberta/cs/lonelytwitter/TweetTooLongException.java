package ca.ualberta.cs.lonelytwitter;

public class TweetTooLongException extends Exception {

    TweetTooLongException(){
        super("This tweet is too long! Please keep your tweets within 140 characters");
    }
}
