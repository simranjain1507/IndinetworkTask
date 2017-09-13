package com.example.android.indinetworktask.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.indinetworktask.Utils.Message;
import com.example.android.indinetworktask.Adapter.MessagesAdapter;
import com.example.android.indinetworktask.R;

import java.util.ArrayList;

/**
 * Created by simranjain1507 on 13/09/17.
 */

public class ManagementFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.message_list, container, false);
        final ArrayList<Message> management = new ArrayList<>();
        management.add(new Message("Management", "Dear Students, last date of fees is 15 June 2017, kindly pay on time.", "12 June 2017 12:00", R.drawable.profile1));
        management.add(new Message("Finance Departmet", "Dear Students, extra pay of 300", "12 June 2017 12:00", R.drawable.profile2));
        management.add(new Message("Culturals Department", "Dear Students, culturals on 2 July", "12 June 2017 12:00", R.drawable.profile3));
        management.add(new Message("Management", "Dear Students, last date of fees", "12 June 2017 12:00", R.drawable.profile1));
        management.add(new Message("Finance Departmet", "Dear Students, extra pay of 300", "12 June 2017 12:00", R.drawable.profile2));
        management.add(new Message("Culturals Department", "Dear Students, culturals on 2 July", "12 June 2017 12:00", R.drawable.profile3));
        management.add(new Message("Management", "Dear Students, last date of fees", "12 June 2017 12:00", R.drawable.profile1));
        management.add(new Message("Finance Departmet", "Dear Students, extra pay of 300", "12 June 2017 12:00", R.drawable.profile2));
        management.add(new Message("Culturals Department", "Dear Students, culturals on 2 July", "12 June 2017 12:00", R.drawable.profile3));
        management.add(new Message("Management", "Dear Students, last date of fees", "12 June 2017 12:00", R.drawable.profile1));
        management.add(new Message("Finance Departmet", "Dear Students, extra pay of 300", "12 June 2017 12:00", R.drawable.profile2));
        management.add(new Message("Culturals Department", "Dear Students, culturals on 2 July", "12 June 2017 12:00", R.drawable.profile3));
        MessagesAdapter adapter = new MessagesAdapter(management, getActivity());
        recyclerView = (RecyclerView) rootview.findViewById(R.id.rv_list);
        layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return rootview;
    }
}
