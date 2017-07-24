package com.example.setherus.testing_upload;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button = (Button)findViewById(R.id.btnNext);
    TextView tvName = (TextView)findViewById(R.id.tvName);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextScreen(View view) {

        tvName.setText(R.string.hello);
    }
}
