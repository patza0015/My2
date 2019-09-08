package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent(); //เข้าถึง Intent ที่ส่งมาจากต้นทาง
        String Addname = intent.getStringExtra("username");
        TextView name =findViewById(R.id.textView2);
        name.setText(Addname);


        String Addgoesto = intent.getStringExtra("goesto");
        TextView goesto =findViewById(R.id.textView8);
        goesto.setText(Addgoesto);

        String Addlivein = intent.getStringExtra("livein");
        TextView livein = findViewById(R.id.textView11);
        livein.setText(Addlivein);

        String Addfrom = intent.getStringExtra("from");
        TextView from =  findViewById(R.id.textView12);
        from.setText(Addfrom);

    }
}
