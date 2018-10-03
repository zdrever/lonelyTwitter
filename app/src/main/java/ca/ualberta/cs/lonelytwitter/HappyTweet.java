package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
    HappyTweet
    @author: Zach Drever
    @see: SadTweet
    Tweet with mood set to ':D'
 */
public class HappyTweet extends Tweet {

    HappyTweet(String tweet, Date date){
        super(tweet, date);
        super.mood = ":D";
    }

    /**
     * set mood to ':D'
     */
    public void setMood(){ super.mood = ":D"; }
}
