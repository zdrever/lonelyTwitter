package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {
    // make final as it is not reassigned
    private final ArrayList<SimpleTweet> simpleTweets = new ArrayList<SimpleTweet>();

    public TweetList() {

    }

    public SimpleTweet getTweet(int index){
        return simpleTweets.get(index);
    }

    public boolean hasTweet(SimpleTweet SimpleTweet){
        return simpleTweets.contains(SimpleTweet);
    }

    public void add(SimpleTweet SimpleTweet) {
        simpleTweets.add(SimpleTweet);
    }

    public void delete(SimpleTweet SimpleTweet) {
        simpleTweets.remove(SimpleTweet);
    }
}
