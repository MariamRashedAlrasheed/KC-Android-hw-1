package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView1);
        TextView textView1 = findViewById(R.id.textView2);
        EditText textView2 = findViewById(R.id.planText1);
        EditText textView3 = findViewById(R.id.planText2);
        Button textView4 = findViewById(R.id.button);
        Button textView5 = findViewById(R.id.btn_clear);


        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(" ");
                int num1 = Integer.parseInt(textView2.getText().toString());
                int num2 = Integer.parseInt(textView3.getText().toString());

                int result = num1 + num2;
                textView1.setText(String.valueOf(result));

        });


        )

        }
        });
    }
}