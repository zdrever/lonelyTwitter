package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class SimpleTweet {
    private String message;
    private Date date;

    public SimpleTweet(String message) throws TweetTooLongException{
        this.setMessage(message);
        this.setDate(date);
    }

//    Remove unused constructor
//    public SimpleTweet(String message, Date date) throws TweetTooLongException{
//        this.setMessage(message);
//        this.setDate(date);
//    }

    @Override
    public String toString(){
        return message;
    }

    // Remove unused function
    // --Commented out by Inspection (2018-10-30, 5:47 PM):public abstract Boolean isImportant();

    // Make private since it is not accessed outside this class
    private void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    // Make private since it is not accessed outside this class
    private void setDate(Date date) {
        this.date = date;
    }
}
