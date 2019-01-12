package com.devschema.sh4d0w.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class HolyLandFragment extends Fragment {
    public HolyLandFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_listview, container, false);
        DataGenerator dataGenerator = new DataGenerator(getActivity());
        final ArrayList<Item> items = dataGenerator.InitHoly();
        final ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Item currentItem = items.get(i);
                Intent intent = new Intent(getContext(), ItemDetailActivity.class);
                intent.putExtra("currentItem",currentItem);
                startActivity(intent);
            }
        });
        return rootView;

    }
}
