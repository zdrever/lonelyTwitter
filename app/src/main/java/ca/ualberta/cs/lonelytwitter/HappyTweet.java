package ca.ualberta.cs.lonelytwitter;

public class HappyTweet extends Tweet {

    HappyTweet(){
        super();
    }

    HappyTweet(String tweet){
        super(tweet);
    }

    public void setMood(){ super.mood = ":D"; }
}
