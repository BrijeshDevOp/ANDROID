package com.example.app;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

public class FragmentAlert extends Fragment {

    TextView rspns;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle instanceState){
        View view = inflater.inflate(R.layout.alert_fragment,container,false);

        Button btn1  = view.findViewById(R.id.alertBtn);
        rspns = view.findViewById(R.id.response);

        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
                alertDialog.setTitle("ALERT!!!");
                alertDialog.setIcon(R.drawable.ic_launcher_background);
                alertDialog.setMessage("Enter name");
                final EditText username = new EditText(getContext());
                alertDialog.setPositiveButton("OK",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialogInterface,int buttonId){
                        String str = username.getText().toString();
                        rspns.setText(" Welcome "+str+" !");
                        return;
                    }
                });

                alertDialog.setNegativeButton("Cancel",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialogInterface,int buttonId){
                        return;
                    }
                });

                alertDialog.show();
            }
        });
        return view;
    }
}
