package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication3.model.auth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button  =findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText username =findViewById(R.id.editText);
                EditText password =findViewById(R.id.editText2);


                String inputusername = username.getText().toString();
                String inputpassword = password.getText().toString();

                auth useauth = new auth(inputusername, inputpassword);

                Handler handler = new Handler();

                if(useauth.check1()){
                    Intent intent = new Intent(MainActivity.this,Profile.class);
                    intent.putExtra("username","พงษ์พัฒน์ พจน์พานิช");
                    intent.putExtra("goesto","มหาวิทยาลัยศิลปากร");
                    intent.putExtra("livein","นครปฐม");
                    intent.putExtra("from","นครปฐม");
                    startActivity(intent);
                }
                if(useauth.check2()){
                    Intent intent = new Intent(MainActivity.this,Profile.class);
                    intent.putExtra("username","Promlert Lovichit");
                    intent.putExtra("goesto","สวนกุหลาบวิทยาลัย");
                    intent.putExtra("livein","กรุงเทพมหานคร");
                    intent.putExtra("from","กรุงเทพมหานคร");
                    startActivity(intent);

                }



                handler.postDelayed(new Runnable() {
                    public void run() {
                        //todo: โค้ดที่ต้องการสั่งดีเลย์ ครบ3วินาที
                        Intent intent = new Intent(MainActivity.this, Profile.class);//เชื่อมจากหน้าจอนึงไปอีกหน้าจอนึง(หน้าที่อยู่.this,หน้าที่ต้องการไป.class)
                        startActivity(intent);//ตัาสั่งเริ่มทำงาน เชื่อมหน้าจอ
                        finish();
                    }
                }, 3000);
            }
        });


    }
}
