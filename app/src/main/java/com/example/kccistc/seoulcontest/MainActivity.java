package com.example.kccistc.seoulcontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView new_seoul = findViewById(R.id.new_seoul);
        //ImageView old_seoul = findViewById(R.id.old_seoul);

        new_seoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , New_Seoul.class);
                startActivity(intent);
            }
        });
    }
}
