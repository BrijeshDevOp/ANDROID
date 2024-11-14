package com.example.app;

import static android.widget.Toast.makeText;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentSpinner extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle instance){
        View view = inflater.inflate(R.layout.spinner_activity,container,false);

        Spinner colorSpinner = view.findViewById(R.id.spinner);

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selectedColor = parent.getItemAtPosition(position).toString();

                Toast.makeText(getContext(),"Selected : "+selectedColor,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return view;
    }
}
