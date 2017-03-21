package com.mobidev.multiwindowmodedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ScrollView;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    private TextView logTextView;
    private ScrollView contentScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        logTextView = (TextView) findViewById(R.id.log_textView);
        contentScrollView = (ScrollView) findViewById(R.id.content_scrollView);

        logTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //ignored
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //ignored
            }

            @Override
            public void afterTextChanged(Editable s) {
                contentScrollView.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });
        logTextView.append("\n onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logTextView.append("\n onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logTextView.append("\n onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logTextView.append("\n onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logTextView.append("\n onStop");
    }

}
