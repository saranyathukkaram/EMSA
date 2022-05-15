package com.example.saranya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        button=(Button) findViewById(R.id.button);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapDemoActivity.class);
                //Create the bundle
                Bundle bundle = new Bundle();
                //Add your data to bundle
                bundle.putString("ButtonClicked", "atm");
                //Add the bundle to the intent
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapDemoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("ButtonClicked", "hospital");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapDemoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("ButtonClicked", "police");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapDemoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("ButtonClicked", "train_station");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MapDemoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("ButtonClicked", "airport");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
