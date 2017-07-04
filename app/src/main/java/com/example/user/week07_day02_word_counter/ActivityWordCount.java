package com.example.user.week07_day02_word_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityWordCount extends AppCompatActivity {

    EditText enteredWords;
    Button countButton;
    TextView wordCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        Log.d(getClass().toString(), "onCreate called");

        enteredWords = (EditText) findViewById(R.id.word_list);
        countButton = (Button) findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View button) {
        String string = enteredWords.getText().toString();

        Log.d(getClass().toString(), "onCountButtonClicked was called");
        Log.d(getClass().toString(), "The string entered was'" + string + "'");

        WordList wordlist = new WordList(string);
        Integer count = wordlist.countWords();


        wordCount = (TextView) findViewById(R.id.count_text);
        wordCount.setText(count.toString());
    }
}
