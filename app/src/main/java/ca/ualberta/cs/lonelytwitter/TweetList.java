package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) throws IllegalArgumentException{
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException("Tweet list has tweet");
        }
        tweets.add(tweet);
    }

    public Boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public int getCount() {
        return tweets.size();
    }
}
