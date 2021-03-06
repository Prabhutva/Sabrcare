package com.sabrcare.app.timeline;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sabrcare.app.R;

import java.util.ArrayList;


public class TimelineFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_timeline, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.timeline_rv);



        ArrayList<TimelineModel> timeline = new ArrayList<>();

        //generate 10 items just for now.WIll be changed later
        for(int i=0;i<10;i++) {
            timeline.add(new TimelineModel("title", "subtitle"));
        }


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        TimelineAdapter timelineAdapter = new TimelineAdapter(timeline,getContext());
        recyclerView.setAdapter(timelineAdapter);
        return view;
    }
}