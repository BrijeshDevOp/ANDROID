package com.example.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class FragmentAdapter extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle instance){

        View view = inflater.inflate(R.layout.list_view_adapter,container,false);

        ListView listView = view.findViewById(R.id.listViewAdapter);

        ArrayList<String> fruitList = new ArrayList<>();

        fruitList.add("Onion");
        fruitList.add("Tomato");
        fruitList.add("Potato");
        fruitList.add("Chilli");

        ArrayAdapter adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,fruitList);

        listView.setAdapter(adapter);
        return view;

    }
}
