package com.example.assignment1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.Gravity;


public class Assignment2 extends AppCompatActivity {
    Button click;
    TextView welcome;
    EditText nameEt;
    Toolbar appBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_assignment2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            //            appBar=findViewById(R.id.toolbar);
//            setSupportActionBar(appBar);
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            click=findViewById(R.id.btn);
            nameEt=findViewById(R.id.nameEt);
            welcome=findViewById(R.id.wel);
            click.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name;
                    name=nameEt.getText().toString();
                    welcome.setText(welcome.getText().toString()+" "+name);
                    welcome.setTextSize(50);
                    welcome.setGravity(Gravity.CENTER);
                    welcome.setPadding(20,20,20,20);
//                    welcome.setTextColor(Color.rgb(0, 48, 73));
                    welcome.setAllCaps(true);

                }
            });

            return insets;
        });
    }
}