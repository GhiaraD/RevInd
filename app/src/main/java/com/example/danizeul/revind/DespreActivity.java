package com.example.danizeul.revind;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DespreActivity extends AppCompatActivity {

    TextView feed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_biografie);

        feed = (TextView) findViewById(R.id.feedback);

        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                composeEmail("decenumergefirebaseajutor@gmail.com","Feedback Revolutia Industriala");

            }
        });

    }
    public void composeEmail(String addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:decenumergefirebaseajutor@gmail.com")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
