package com.androidtutorialshub.recyclerviewtutorial.result;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.androidtutorialshub.recyclerviewtutorial.R;

/**
 * Created by SreenuReddy on 2/19/2018.
 */

public class ResultActivity extends AppCompatActivity {

    public TextView title;
    public TextView author;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        Intent intent_getting_data=getIntent();
        title = (TextView) findViewById(R.id.title);
        author = (TextView) findViewById(R.id.author);
        String result_title=intent_getting_data.getStringExtra("Title");
        String result_author=intent_getting_data.getStringExtra("Author");
        title.setText(result_title);
        author.setText(result_author);
    }
}
