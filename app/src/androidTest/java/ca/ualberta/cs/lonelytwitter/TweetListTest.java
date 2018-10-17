package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

import static junit.framework.Assert.assertTrue;

public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>{

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");
        tweetList.add(tweet);

        assertTrue(tweetList.hasTweet(tweet));

        Boolean test;
        try {
            tweetList.add(tweet);
            test = Boolean.FALSE;
        } catch (IllegalArgumentException e){
            test = Boolean.TRUE;
        }
        assertTrue(test);
    }

    public void testHasTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        assertFalse(tweetList.hasTweet(tweet));

        tweetList.add(tweet);

        assertTrue(tweetList.hasTweet(tweet));
    }

    public void testGetTweet(){
         TweetList tweetList = new TweetList();
         Tweet tweet = new NormalTweet("get tweet check");

         tweetList.add(tweet);
         Tweet retrievedTweet = tweetList.getTweet(0);
         assertEquals(tweet.getMessage(), retrievedTweet.getMessage());
         assertEquals(tweet.getDate(), retrievedTweet.getDate());
    }

    public void testDelete(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("get tweet check");

        tweetList.add(tweet);
        tweetList.delete(tweet);
        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList tweetList = new TweetList();
        assertEquals(tweetList.getCount(), 0);
        Tweet tweet = new NormalTweet("get tweet count check");

        tweetList.add(tweet);
        assertEquals(tweetList.getCount(), 1);
    }

    public void testGetTweets(){
        TweetList tweetList = new TweetList();
        tweetList.add(new NormalTweet("test tweets 1"));
        tweetList.add(new NormalTweet("test tweets 2"));

        assertEquals(tweetList.getTweets().get(0).getMessage(), "test tweets 1");
        assertEquals(tweetList.getTweets().get(1).getMessage(), "test tweets 2");
    }


}
