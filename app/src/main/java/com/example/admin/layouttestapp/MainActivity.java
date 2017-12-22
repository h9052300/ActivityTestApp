package com.example.admin.layouttestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TAG = "Tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "MainActivity --> onCreate()");

        Button btn_test = findViewById(R.id.btn_test);
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Second_Activity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "MainActivity --> onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "MainActivity --> onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "MainActivity --> onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "MainActivity --> onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "MainActivity --> onDestroy()");
    }
}
