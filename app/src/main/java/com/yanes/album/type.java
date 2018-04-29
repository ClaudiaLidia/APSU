package com.yanes.album;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

/**
 * Created by LidiayClaudia on 28/04/2018.
 */

public class type extends Activity implements AdapterView.OnItemClickListener {
    public static String Type;
    static final String[] TYPES = {
            "Capital", "Foods & Drinks", "Places",
    };
    Integer [] ima={R.drawable.capitals, R.drawable.food,R.drawable.places};
    Toolbar toolbar;

    @Override
    protected void onResume() {
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(MainActivity.total + " coins");
        super.onResume();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s_t);

        ListView lv = (ListView) findViewById(R.id.listview);
        CustomListView customListView = new CustomListView(this,TYPES,ima);
        lv.setAdapter(customListView);
        lv.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Type = (String) adapterView.getItemAtPosition(i);
        Intent intent=new Intent(this,Info.class);
       startActivity(intent);
    }
}
