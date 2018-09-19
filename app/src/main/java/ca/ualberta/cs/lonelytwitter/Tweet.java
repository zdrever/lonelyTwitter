package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable{

    private static final Integer MAX_CHARS = 140;

    private Date date;
    private String tweet;
    String mood;

    Tweet(){
        this.date = new Date();
    }

    Tweet(String tweet){
        this.tweet = tweet;
        this.date = new Date();
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
    public abstract void setMood();
}
