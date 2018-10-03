package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Tweet
 * @author Zach Drever
 * @see Tweetable
 * Class to represent a tweeted object
 */
public abstract class Tweet implements Tweetable{

    private static final Integer MAX_CHARS = 140;

    private Date date;
    private String tweet;
    String mood;

    Tweet(String tweet, Date date){
        this.tweet = tweet;
        this.date = date;

    }

    /**
     *
     * @return Date object of when this tweet was created
     */
    public Date getDate(){ return this.date; }

    /**
     *
     * @param date : new date for the tweet
     */
    public void setDate(Date date){ this.date = date; }

    /**
     *
     * @return String containing tweet
     */
    public String getTweet(){ return this.tweet; }

    /**
     *
     * @param tweet : String containing comment to set
     * @throws TweetTooLongException : thrown when tweet is greater than 140 characters
     */
    public void setTweet(String tweet) throws TweetTooLongException{
        if (tweet.length() <= this.MAX_CHARS) {
            this.tweet = tweet;
        } else {
            throw new TweetTooLongException();
        }
    }

    /**
     *
     * @return String format for displaying the tweet
     */
    public String toString(){
        return this.mood +  "\n" + this.getTweet() + "\n" +  this.getDate();
    }
    public abstract void setMood();
}
