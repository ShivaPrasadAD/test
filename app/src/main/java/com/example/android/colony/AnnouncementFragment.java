package com.example.android.colony;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class AnnouncementFragment extends Fragment {


    public AnnouncementFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word(R.string.event1, R.string.salarjung_desc, R.drawable.sagar));
        Words.add(new Word(R.string.event2, R.string.salarjung_desc, R.drawable.sagar));
        Words.add(new Word(R.string.event3, R.string.salarjung_desc, R.drawable.sagar));
        Words.add(new Word(R.string.event4, R.string.salarjung_desc, R.drawable.sagar));
        com.example.android.colony.WordAdapter Adapter = new com.example.android.colony.WordAdapter(getActivity(), Words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(Adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word denton = Words.get(position);
                Intent intent = new Intent(getActivity(), NowWatchingActivity.class);
                intent.putExtra("item_name", denton.getItemName());
                intent.putExtra("item_details", denton.getItemDetails());
                intent.putExtra("item_pic", denton.getImageId());
                startActivity(intent);
            }
        });
        return rootView;

    }
}
