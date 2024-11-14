package com.example.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EmailActivity extends AppCompatActivity {

    private EditText edt1,edt2;

    protected void onCreate(Bundle instance){
        super.onCreate(instance);
        setContentView(R.layout.email_activity);

        edt1 = findViewById(R.id.emialId);
        edt2 = findViewById(R.id.emialMessage);

        Button btn = findViewById(R.id.emailBtn);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                sendEmail();
            }
        });
    }

    private void sendEmail(){

        String to_address = edt1.getText().toString().trim();
        String message  = edt2.getText().toString().trim();

        Intent emailIntent  = new Intent(Intent.ACTION_SENDTO);

        emailIntent.setData(Uri.parse("mailto:"));

        emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{to_address});

        emailIntent.putExtra(Intent.EXTRA_SUBJECT,"HELLO");

        emailIntent.putExtra(Intent.EXTRA_TEXT,message);

        try {
            Intent chooser = Intent.createChooser(emailIntent,"Choose an email app");
            startActivity(chooser);
        }catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(this,"No email client installed on your device.",Toast.LENGTH_SHORT).show();
        }
    }
}
