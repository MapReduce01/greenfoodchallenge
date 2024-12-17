package com.ecoone.mindfulmealplanner.tutorial;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ecoone.mindfulmealplanner.R;

// ** NOTE:
// ** THIS TUTORIAL FOLDER IS NOT USED FOR SPRINT 3
// ** KEPT IN PROJECT FOR FUTURE PURPOSES

public class StartTutorialFragment extends Fragment{
    public static StartTutorialFragment newInstance() {
        return new StartTutorialFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tutorial_start, container, false);
        return view;
    }


}
