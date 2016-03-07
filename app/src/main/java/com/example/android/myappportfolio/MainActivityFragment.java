package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }
    private ArrayAdapter<String> mAppAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String [] appArray = {
                "SPOTIFY STREAMER",
                "SCORES APP",
                "LIBRARY APP",
                "BUILD IT BIGGER",
                "XYZ READER"
        };

        List<String> appList = new ArrayList<String>(Arrays.asList(appArray));

        mAppAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_apps,R.id.list_item_app_button_orange,appList);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_apps);
        listView.setAdapter(mAppAdapter);
        return rootView ;
    }


}
