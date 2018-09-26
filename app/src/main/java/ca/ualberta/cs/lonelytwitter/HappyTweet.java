package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class HappyTweet extends Tweet {

    HappyTweet(String tweet, Date date){
        super(tweet, date);
        super.mood = ":D";
    }

    public void setMood(){ super.mood = ":D"; }
}
