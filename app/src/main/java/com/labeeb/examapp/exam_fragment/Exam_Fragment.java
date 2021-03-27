package com.labeeb.examapp.exam_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.card.MaterialCardView;
import com.labeeb.examapp.MainActivity;
import com.labeeb.examapp.R;

public class Exam_Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.exams_framelayout, container, false);

        return view;


    }
}