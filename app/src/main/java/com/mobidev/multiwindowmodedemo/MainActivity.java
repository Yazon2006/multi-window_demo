package com.mobidev.multiwindowmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.mobidev.multiwindowmodedemo.activities.AdjacentActivity;
import com.mobidev.multiwindowmodedemo.activities.FullScreenActivity;
import com.mobidev.multiwindowmodedemo.activities.LifecycleActivity;
import com.mobidev.multiwindowmodedemo.activities.OrientationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lifecycleActivityButton = (Button) findViewById(R.id.lifecycleActivity_button);
        Button orientationActivityButton = (Button) findViewById(R.id.orientationActivity_button);
        Button adjacentActivityButton = (Button) findViewById(R.id.adjacentActivity_button);
        Button fullscreenActivityButton = (Button) findViewById(R.id.fullscreenActivity_button);

        lifecycleActivityButton.setOnClickListener(view -> startActivity(new Intent(this, LifecycleActivity.class)));

        orientationActivityButton.setOnClickListener(view -> startActivity(new Intent(this, OrientationActivity.class)));

        adjacentActivityButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, AdjacentActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT | Intent.FLAG_ACTIVITY_NEW_TASK |
                    Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
            startActivity(intent);
        });

        fullscreenActivityButton.setOnClickListener(view -> startActivity(new Intent(this, FullScreenActivity.class)));
    }

}
