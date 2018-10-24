package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class EditTweetActivity extends Activity {

    EditText tweetMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intent = getIntent();
        Tweet tweet = (Tweet) intent.getSerializableExtra(LonelyTwitterActivity.TWEET);

        tweetMessage = (EditText) findViewById(R.id.editTweetMessage);
        tweetMessage.setText(tweet.getMessage());
    }
}
