package com.example.hellotoastchallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int Counter = 0;
    private TextView ShowCounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        ShowCounter = (TextView) findViewById(R.id.show_count);
    }
    public void countUp(View view) {
        Counter++;
        if (ShowCounter!= null)
            ShowCounter.setText(Integer.toString(Counter));

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
