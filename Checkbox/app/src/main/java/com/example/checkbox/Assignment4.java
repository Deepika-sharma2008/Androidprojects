package com.example.checkbox;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Assignment4 extends AppCompatActivity {
    Toolbar appBar;
    Button btn;
    RadioGroup rg;
    RadioButton device;
    CheckBox ch1,ch2,ch3,ch4;
    TextView outputDevice,outputFeature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_assignment4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);


            rg=findViewById(R.id.dg);
            device=findViewById(R.id.And);
            device=findViewById(R.id.Ios);
            device=findViewById(R.id.window);

            ch1=findViewById(R.id.not);
            ch2=findViewById(R.id.dm);
            ch3=findViewById(R.id.loc);
            ch4=findViewById(R.id.bac);


            outputDevice = findViewById(R.id.t1);
            outputFeature = findViewById(R.id.t2);

            btn=findViewById(R.id.btn);

            appBar=findViewById(R.id.toolbar);
            setSupportActionBar(appBar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    outputDevice.setText("Selected Device: ");
                    outputFeature.setText("Selected Feature:");
                    // RadioButton
                    int selectedCourse = rg.getCheckedRadioButtonId();
                    device = findViewById(selectedCourse);
                    String deviceoutput=device.getText().toString();

                    outputDevice.setText(outputDevice.getText().toString()+" "+deviceoutput);

                    // Checkbox
                    String hobbies = " ";

                    if(ch1.isChecked())
                        hobbies = hobbies + " " + ch1.getText().toString();

                    if(ch2.isChecked())
                        hobbies = hobbies + " " + ch2.getText().toString();

                    if(ch3.isChecked())
                        hobbies = hobbies + " " + ch3.getText().toString();

                    if(ch4.isChecked())
                        hobbies = hobbies + " " + ch4.getText().toString();

                    outputFeature.setText(outputFeature.getText()+" "+hobbies);
                }
            });
            return insets;
        });
    }
}