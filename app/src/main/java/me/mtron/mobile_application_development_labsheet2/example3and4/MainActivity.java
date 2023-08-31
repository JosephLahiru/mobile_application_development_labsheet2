package me.mtron.mobile_application_development_labsheet2.example3and4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.mtron.mobile_application_development_labsheet2.R;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, Activity2.class);
        go = findViewById(R.id.btnGo);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("NAME", "Joe");
                intent.putExtra("CITY", "Colombo");

                startActivity(intent);
            }
        });
    }
}