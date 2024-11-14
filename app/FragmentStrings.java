package com.example.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FragmentStrings extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle instance){
        View view = inflater.inflate(R.layout.list_view_string,container,false);
        return view;
    }
}
