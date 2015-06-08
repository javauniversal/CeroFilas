package com.appgestor.cerofilas.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appgestor.cerofilas.R;

public class FragPedirTurno extends Fragment {

    public static FragPedirTurno newInstance(Bundle param1) {
        FragPedirTurno fragment = new FragPedirTurno();
        fragment.setArguments(param1);
        return fragment;
    }

    public FragPedirTurno() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_turno, container, false);
        return myView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }


}
