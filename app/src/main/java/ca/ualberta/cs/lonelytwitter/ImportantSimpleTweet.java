package ca.ualberta.cs.lonelytwitter;

public class ImportantSimpleTweet extends SimpleTweet {

    public ImportantSimpleTweet(String message) throws TweetTooLongException {
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
