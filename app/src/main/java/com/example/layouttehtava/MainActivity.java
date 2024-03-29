package com.example.layouttehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private ImageView picture1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button1 = findViewById(R.id.button1);
        this.button2 = findViewById(R.id.button2);
        this.button3 = findViewById(R.id.button3);
        this.picture1 = findViewById(R.id.picture1);



        this.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(button2.isEnabled() && button3.isEnabled()){
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                }

                else    {
                    button2.setEnabled(true);
                    button3.setEnabled(true);


                }

            }
        });

        this.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                picture1.setVisibility(View.INVISIBLE);
            }
        });

        this.button3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                picture1.setVisibility(View.VISIBLE);

                return false;
            }
        });

    }
}
