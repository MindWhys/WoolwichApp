package com.example.android.woolwichapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlacesAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Places} objects.
 */

public class PlacesAdapter extends ArrayAdapter<Places> {

    /** Resource ID for the background color for this list of words
     *
     * uncomment this: private int mColorResourceId;
     */

    /**
     * Create a new {@link PlacesAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Places} to be displayed.
     */
    public PlacesAdapter(Context context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Places} object located at this position in the list
        Places currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_name.
        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        // Get the Place name from the currentWord object and set this text on
        // the placename TextView.
        placeName.setText(currentPlace.getPlaceName());

        //Find the TextView in the list_item.xml layout with the ID place_info.
        TextView placeInfo = (TextView) listItemView.findViewById(R.id.place_info);
        // Get the Place name from the currentWord object and this text on
        // the place_info TextView.
        placeInfo.setText(currentPlace.getPlaceInto());

        //Return the whole list item layout (containting 2 TextView) so that is can be shown in
        // the ListView.
        return listItemView;
    }
}
