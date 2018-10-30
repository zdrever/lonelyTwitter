package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by makepeac on 9/29/16.
 */
public class SimpleTweetListTest extends ActivityInstrumentationTestCase2 {

    public SimpleTweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet() throws TweetTooLongException {
        TweetList tweets = new TweetList();
        SimpleTweet SimpleTweet = new NormalSimpleTweet("adding SimpleTweet");
        tweets.add(SimpleTweet);
        assertTrue(tweets.hasTweet(SimpleTweet));
    }

    public void testDelete() throws TweetTooLongException {
        TweetList list = new TweetList();
        SimpleTweet SimpleTweet = new NormalSimpleTweet("test");
        list.add(SimpleTweet);
        list.delete(SimpleTweet);
        assertFalse(list.hasTweet(SimpleTweet));
    }

    public void testGetTweet() throws TweetTooLongException {
        TweetList tweets = new TweetList(); //
        SimpleTweet SimpleTweet = new NormalSimpleTweet("test");
        tweets.add(SimpleTweet);
        SimpleTweet returnedSimpleTweet = tweets.getTweet(0);
        assertEquals(returnedSimpleTweet.getMessage(), SimpleTweet.getMessage());
    }

    public void testHasTweet() throws TweetTooLongException {
        TweetList list = new TweetList();
        SimpleTweet SimpleTweet = new NormalSimpleTweet("test");
        list.add(SimpleTweet);
        assertTrue(list.hasTweet(SimpleTweet));
    }
}
