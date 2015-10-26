package com.example.casey.assignment6b;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.casey.assignment6b.colordata.ColorContent;

/**
 * A fragment representing a single Color detail screen.
 * This fragment is either contained in a {@link ColorListActivity}
 * in two-pane mode (on tablets) or a {@link ColorDetailActivity}
 * on handsets.
 */
public class BlueFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "blue_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private ColorContent.ColorItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public BlueFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = ColorContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.blue_fragment_detail, container, false);


        return rootView;
    }
}
