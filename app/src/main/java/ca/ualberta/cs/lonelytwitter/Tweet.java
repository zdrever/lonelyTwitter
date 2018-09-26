package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable{

    private static final Integer MAX_CHARS = 140;

    private Date date;
    private String tweet;
    String mood;

    Tweet(String tweet, Date date){
        this.tweet = tweet;
        this.date = date;

    }

    public Date getDate(){ return this.date; }
    public void setDate(Date date){ this.date = date; }
    public String getTweet(){ return this.tweet; }
    public void setTweet(String tweet) throws TweetTooLongException{
        if (tweet.length() <= this.MAX_CHARS) {
            this.tweet = tweet;
        } else {
            throw new TweetTooLongException();
        }
    }
    public String toString(){
        return this.mood +  "\n" + this.getTweet() + "\n" +  this.getDate();
    }
    public abstract void setMood();
}
