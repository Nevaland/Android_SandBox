package com.nevaland.sandbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Edit Text
    private EditText et_id;
    private Button btn_test;

    // Switching Intent
    private EditText et_test;
    private Button btn_move;
    private String str;

    // ImageView
    private ImageView iv_test;

    // By Another Activity
    private Button btn_listview;
    private Button btn_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Edit Text
        et_id = findViewById(R.id.et_id);
        btn_test = findViewById(R.id.btn_test);

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_id.setText("onClick TEST");
            }
        });

        // Switching Intent
        et_test = findViewById(R.id.et_test);

        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                str = et_test.getText().toString();
                intent.putExtra("str", str);
                startActivity(intent);
            }
        });

        // ImageView
        iv_test = findViewById(R.id.iv_test);
        iv_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "ImageView Toast", Toast.LENGTH_SHORT).show();
            }
        });

        // BY ANOTHER ACTIVITY
        // ListView
        btn_listview = findViewById(R.id.btn_listview);
        btn_listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        // Navigation
        btn_nav = findViewById(R.id.btn_nav);
        btn_nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NavActivity.class);
                startActivity(intent);
            }
        });

    }
}
