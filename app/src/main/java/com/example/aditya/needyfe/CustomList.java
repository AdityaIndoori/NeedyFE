package com.example.aditya.needyfe;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aditya on 1/29/2017.
 */

public class CustomList extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] stringArray;
    private final Integer[] imageIdArray;

    public CustomList(Activity context,String[] stringArray, Integer[] imageIdArray) {
        super(context, R.layout.list_item, stringArray);
        this.context=context;
        this.stringArray=stringArray;
        this.imageIdArray=imageIdArray;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listRowView = inflater.inflate(R.layout.list_item, null, true);
        TextView txtTitle = (TextView) listRowView.findViewById(R.id.listTextView);
        ImageView imageView = (ImageView) listRowView.findViewById(R.id.listImageView);
        txtTitle.setText(stringArray[position]);
        imageView.setImageResource(imageIdArray[position]);
        return listRowView;
    }
}
