package com.mobidev.multiwindowmodedemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.mobidev.multiwindowmodedemo.R;

public class AdjacentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjacent);

        Button adjacentActivityButton = (Button) findViewById(R.id.adjacentActivity_button);
        adjacentActivityButton.setOnClickListener(view -> {

            Intent intent = new Intent(this, AdjacentActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        });

    }
}
