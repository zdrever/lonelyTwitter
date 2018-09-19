package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class SadTweet extends Tweet {

    SadTweet(){
        super();
    }

    SadTweet(String tweet){
        super(tweet);
    }

    public void setMood(){ super.mood = ":("; }
}
