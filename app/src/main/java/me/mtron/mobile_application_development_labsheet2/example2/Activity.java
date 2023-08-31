package me.mtron.mobile_application_development_labsheet2.example2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import me.mtron.mobile_application_development_labsheet2.R;

public class Activity extends AppCompatActivity {

    Button displayBtn;
    TextView displayView;
    EditText editText;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);

        displayBtn = findViewById(R.id.button);
        displayView = findViewById(R.id.textView);
        editText = findViewById(R.id.personName);

        displayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = editText.getText().toString();
                displayView.setText(data);
            }
        });
    }
}