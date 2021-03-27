package com.labeeb.examapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.labeeb.examapp.exam_fragment.Exam_Fragment;
import com.labeeb.examapp.live_exam_recyclerview.live_exam_Adapter;
import com.labeeb.examapp.live_exam_recyclerview.live_exam_Model;

import java.util.ArrayList;
import java.util.List;

public abstract class MainActivity extends AppCompatActivity {

    live_exam_Adapter live_exam_adapter;

    List<live_exam_Model> list;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = findViewById(R.id.liveExamRecycler);

        list = new ArrayList();




        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
     //execute
        live_exam_adapter = new live_exam_Adapter(getApplicationContext(), list);
        recyclerView.setAdapter(live_exam_adapter);




        Fragment fragment = new Fragment();
        FragmentManager fragmentManagerss = getSupportFragmentManager();
        FragmentTransaction fragmentTransactionss = ((FragmentManager) fragmentManagerss).beginTransaction();
        fragmentTransactionss.replace(R.id.exam_fragment, fragment);
        fragmentTransactionss.commit();







    }

    public abstract View onCreateView(LayoutInflater inflater, ViewGroup container,
                                      Bundle savedInstanceState);
}