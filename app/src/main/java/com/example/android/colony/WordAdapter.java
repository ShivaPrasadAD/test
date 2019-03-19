package com.example.android.colony;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> Words) {
        super(context, 0, Words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word fu = getItem(position);
        TextView tw = (TextView) listItemView.findViewById(R.id.item_description);
        assert fu != null;
        tw.setText(fu.getItemName());
        TextView tw1 = (TextView) listItemView.findViewById(R.id.details);
        tw1.setText(fu.getItemDetails());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img_of_list);
        imageView.setImageResource(fu.getImageId());
        return listItemView;
    }
}