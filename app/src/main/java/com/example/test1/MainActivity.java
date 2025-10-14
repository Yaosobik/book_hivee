package com.example.test1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

        private TextView resulText;
        private EditText editTextText_1, editTextText_2;
        private Button button_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        resulText = findViewById(R.id.resulText1);
        editTextText_1 = findViewById(R.id.editTextText_1);
        editTextText_2 = findViewById(R.id.editTextText_2);
        button_1 = findViewById(R.id.button_1);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1 = Float.parseFloat(editTextText_1.getText().toString());
                float num2 = Float.parseFloat(editTextText_2.getText().toString());
                float res = num1 + num2;
                resulText.setText(String.valueOf(res));
            }
        });

    }
}