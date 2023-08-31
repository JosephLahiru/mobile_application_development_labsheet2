package me.mtron.mobile_application_development_labsheet2.example3and4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet2.R;

public class Activity2 extends AppCompatActivity {

    TextView name;
    TextView city;
    Intent intent;
    String data_name, data_city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        name = findViewById(R.id.textName);
        city = findViewById(R.id.textCity);

        intent = getIntent();

        data_name = intent.getStringExtra("NAME");
        data_city = intent.getStringExtra("CITY");

        name.setText(data_name);
        city.setText(data_city);
    }
}