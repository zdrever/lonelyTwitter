package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
    SadTweet
    @author: Zach Drever
    @see: HappyTweet
    Tweet with mood set to ':('
 */
public class SadTweet extends Tweet {

    SadTweet(String tweet, Date date){
        super(tweet, date);
    }

    /**
     * set mood to ':('
     */
    public void setMood(){ super.mood = ":("; }
}
