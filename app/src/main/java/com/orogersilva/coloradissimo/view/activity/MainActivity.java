package com.orogersilva.coloradissimo.view.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.orogersilva.coloradissimo.R;
import com.orogersilva.coloradissimo.view.adapter.FanAdapter;
import com.orogersilva.coloradissimo.vo.Fan;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    // region FIELDS

    @Bind(R.id.fan_recyclerview)
    RecyclerView mFanRecyclerView;
    private RecyclerView.Adapter mFanAdapter;
    private RecyclerView.LayoutManager mFanLayoutManager;

    // endregion

    // region ACTIVITY LIFECYCLE METHODS

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mFanLayoutManager = new LinearLayoutManager(this);
        mFanRecyclerView.setLayoutManager(mFanLayoutManager);

        // TODO: 2/2/2016 Change for real dataset.
        ArrayList<Fan> fans = new ArrayList<>();

        fans.add(new Fan("orogersilva", "Roger Silva", 3));
        fans.add(new Fan("iarats", "Iara Silva", 4));
        fans.add(new Fan("orogersilva2", "Roger T A da Silva", 3));
        fans.add(new Fan("orogersilva3", "Roger T Silva", 5));

        mFanAdapter = new FanAdapter(fans);
        mFanRecyclerView.setAdapter(mFanAdapter);
    }

    // endregion
}
