package com.example.pawspetntrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Home extends AppCompatActivity {
    TextView date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        date = findViewById(R.id.Date);
        Date now = new Date();
        SimpleDateFormat day = new SimpleDateFormat("EEEE");
        String currentDate = java.text.DateFormat.getDateInstance().format(new Date());
        date.setText( day.format(now) + ",\n" + currentDate);
    }

    public void onMark(View v) {
        Intent intent = new Intent(this, Mark.class);
        startActivity(intent);
    }

    public void onNewPackage(View v) {
        Intent intent = new Intent(this, NewPackage.class);
        startActivity(intent);
    }

    public void onAdd(View v) {
        Intent intent = new Intent(this, AddDog.class);
        startActivity(intent);
    }

    public void onPackages(View v) {
        Intent intent = new Intent(this, Packages.class);
        startActivity(intent);
    }


}