package com.example.appdemo.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdemo.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView mAppList;
    AppListAdapter mAdapter;
    GridLayoutManager gridLayoutManager;
    ArrayList<Integer> mIconList = new ArrayList<>();
    ArrayList<String> mTitleAppList = new ArrayList<>();
    ArrayList<String> mTimeUsedAppList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        initValue();
        mAppList = root.findViewById(R.id.app_list);
        mAdapter = new AppListAdapter(getContext());
        mAdapter.updateAppView(mIconList, mTitleAppList, mTimeUsedAppList);
        gridLayoutManager = new GridLayoutManager(getContext(),3);
        mAppList.setLayoutManager(gridLayoutManager);
        mAppList.setAdapter(mAdapter);

        return root;
    }

    public void initValue(){
        mIconList.add(R.drawable.ic_icon_fb);
        mIconList.add(R.drawable.ic_icon_gg_plus);
        mIconList.add(R.drawable.ic_icon_skype);
        mIconList.add(R.drawable.ic_icon_instagram);
        mIconList.add(R.drawable.ic_icon_messenger);
        mIconList.add(R.drawable.ic_icon_printest);
        mIconList.add(R.drawable.ic_icon_twiter);
        mIconList.add(R.drawable.ic_icon_viber);
        mIconList.add(R.drawable.ic_icon_yt);

        mTitleAppList.add("Facebook");
        mTitleAppList.add("Google +");
        mTitleAppList.add("Skype");
        mTitleAppList.add("Instagram");
        mTitleAppList.add("Messenger");
        mTitleAppList.add("Printest");
        mTitleAppList.add("Twiter");
        mTitleAppList.add("Viber");
        mTitleAppList.add("Youtube");

        mTimeUsedAppList.add("01:09:23");
        mTimeUsedAppList.add("00:07:16");
        mTimeUsedAppList.add("");
        mTimeUsedAppList.add("");
        mTimeUsedAppList.add("");
        mTimeUsedAppList.add("");
        mTimeUsedAppList.add("");
        mTimeUsedAppList.add("");
        mTimeUsedAppList.add("");
    }
}