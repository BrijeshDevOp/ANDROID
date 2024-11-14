// MainActivity

package com.example.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.fragmentBtn);
        btn2 = (Button)findViewById(R.id.webViewBtn);
        btn3 = (Button)findViewById(R.id.sendSMSBtn);
        btn4 = (Button)findViewById(R.id.recieveSMSBtn);
        btn5 = (Button)findViewById(R.id.sendEmailBtn);
        btn6 = (Button)findViewById(R.id.openContactBtn);
        btn7 = (Button)findViewById(R.id.openListView);
        btn8 = (Button)findViewById(R.id.openAnimation);

        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                Intent in1 = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(in1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                Intent in1 = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(in1);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent in1 = new Intent(MainActivity.this, SendSMS.class);
                startActivity(in1);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent in1 = new Intent(MainActivity.this, ReceiveSMS.class);
                startActivity(in1);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent in1 = new Intent(MainActivity.this, EmailActivity.class);
                startActivity(in1);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent in1 = new Intent(MainActivity.this, ContactInfo.class);
                startActivity(in1);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent in1 = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(in1);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent in1 = new Intent(MainActivity.this, AnimatedImage.class);
                startActivity(in1);
            }
        });

    }
}