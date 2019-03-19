package com.example.android.colony;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NowWatchingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_watching);
        Intent intent = this.getIntent();
        if (intent != null) {
            int song_name = intent.getExtras().getInt("item_name");
            int song_details = intent.getExtras().getInt("item_details");
            int song_pic = intent.getExtras().getInt("item_pic");
            ImageView imageView = (ImageView) findViewById(R.id.img);
            imageView.setImageResource(song_pic);
            TextView textView = (TextView) findViewById(R.id.first);
            textView.setText(song_name);
            TextView textView1 = (TextView) findViewById(R.id.second);
            textView1.setText(song_details);
        }
    }
}
