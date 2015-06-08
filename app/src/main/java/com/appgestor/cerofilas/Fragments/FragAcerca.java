package com.appgestor.cerofilas.Fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.appgestor.cerofilas.R;

public class FragAcerca extends Fragment {

    private static final String ARG_COLOR = "color";
    private int mColor;
    private TextView home;

    public static FragAcerca newInstance(int param1) {
        FragAcerca fragment = new FragAcerca();
        Bundle args = new Bundle();
        args.putInt(ARG_COLOR, param1);
        fragment.setArguments(args);
        return fragment;
    }

    public FragAcerca() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mColor = (getArguments() != null) ? getArguments().getInt(ARG_COLOR) : Color.GRAY;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_acerca, container, false);
        myView.setBackgroundColor(getResources().getColor(mColor));
        return myView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String summary = "<p>Lorem ipsum Home</p> " +
                "<p>Ut rutrum elit sodales nulla convallis, eget ultricies odio commodo. Integer sed porta erat." +
                " Etiam semper vel nulla vitae bibendum</p>";
        home = (TextView) getActivity().findViewById(R.id.textView);
        home.setText(Html.fromHtml(summary));
    }


}
