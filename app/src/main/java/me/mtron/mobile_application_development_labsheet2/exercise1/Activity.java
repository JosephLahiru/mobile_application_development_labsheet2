package me.mtron.mobile_application_development_labsheet2.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet2.R;

public class Activity extends AppCompatActivity {

    EditText num1Text;
    EditText num2Text;
    Button addBtn;
    TextView ansText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        num1Text = findViewById(R.id.num1EditText);
        num2Text = findViewById(R.id.num2EditText);
        addBtn = findViewById(R.id.btnAdd);
        ansText = findViewById(R.id.ansText);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ansText.setText((int) (Double.parseDouble(num1Text.getText().toString()) + Double.parseDouble(num2Text.getText().toString())));
            }
        });
    }
}