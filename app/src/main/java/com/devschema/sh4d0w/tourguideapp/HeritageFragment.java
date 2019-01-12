package com.devschema.sh4d0w.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.ArrayList;

public class HeritageFragment extends Fragment {
    public HeritageFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_gridview, container, false);
        DataGenerator dataGenerator = new DataGenerator(getActivity());
        final ArrayList<Item> items = dataGenerator.InitHeritage();
        final ItemAdapter adapter = new ItemAdapter(getActivity(), items, false);
        GridView grid = rootView.findViewById(R.id.grid);
        grid.setAdapter(adapter);
        return rootView;
    }
}