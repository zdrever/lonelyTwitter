package ca.ualberta.cs.lonelytwitter;

public class NormalSimpleTweet extends SimpleTweet {

    public NormalSimpleTweet(String message) throws TweetTooLongException {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
