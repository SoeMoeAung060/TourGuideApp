package android.example.tourguideapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */

public class CityFragment extends Fragment {


    public CityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_content, container, false);

        final ArrayList<Content> contentList = new ArrayList<>();

        contentList.add(new Content(getString(R.string.makkah), R.drawable.makkah));
        contentList.add(new Content(getString(R.string.madinah), R.drawable.madinah));
        contentList.add(new Content(getString(R.string.riyadh), R.drawable.riyadhtower));
        contentList.add(new Content(getString(R.string.dammam), R.drawable.dammam));
        contentList.add(new Content(getString(R.string.abha), R.drawable.abha));
        contentList.add(new Content(getString(R.string.tabuk), R.drawable.tabuk));
        contentList.add(new Content(getString(R.string.jeddah), R.drawable.jeddah));

        ContentAdapter adapter = new ContentAdapter(getActivity(), contentList);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
