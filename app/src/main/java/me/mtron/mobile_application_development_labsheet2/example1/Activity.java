package me.mtron.mobile_application_development_labsheet2.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet2.R;

public class Activity extends AppCompatActivity {

    private TextView display;
    private Button click;
    private boolean isTextOne = true; // Initial state

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
//Method 1
//        display = findViewById(R.id.text1);
//        click = findViewById(R.id.btnClick);
//
//        click.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (isTextOne) {
//                    display.setText("Welcome to Android Studio!!!");
//                } else {
//                    display.setText("Hello, World!");
//                }
//
//                isTextOne = !isTextOne;
//            }
//        });
    }
    //Method 2
    public void change_text(View view) {
        display = findViewById(R.id.text1);
        display.setText("I love Java");
    }
}