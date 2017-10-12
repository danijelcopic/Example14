package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import rs.aleph.android.example12.R;

// Each activity extends Activity class
public class FirstActivity extends Activity {

    // onCreate method is a lifecycle method called when he activity is starting
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Each lifecycle method should call the method it overrides
        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.activity_main);
    }

    // Called when btnStart button is clicked
    public void btnStartActivityClicked(View view) {
        // This is an explicit intent (class property is specified)
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        // startActivity method starts an activity
        startActivity(intent);
    }

    // Called when btnOpen is clicked
    public void btnOpenBrowserClicked(View view) {
        // This is an implicit intent
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com"));
        // startActivity method starts an activity
        startActivity(i);
    }
}
