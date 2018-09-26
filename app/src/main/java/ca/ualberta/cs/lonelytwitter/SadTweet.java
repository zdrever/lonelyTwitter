package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class SadTweet extends Tweet {

    SadTweet(String tweet, Date date){
        super(tweet, date);
    }

    public void setMood(){ super.mood = ":("; }
}
