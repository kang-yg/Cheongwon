package com.example.tests;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;


public class listes extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        Log.d("listes", "onCreate");

        ListView commentListView=findViewById(R.id.views);
        viewAdapter viewAdapters;
        ArrayList<Item> listview;

        listview=new ArrayList<Item>();
        listview.add(new Item("1","제목1","0"));
        listview.add(new Item("2","제목2","0"));
        listview.add(new Item("3","제목3","0"));
        listview.add(new Item("4","제목4","0"));
        /*listview.add(new Item(5,"제목5",0));
        listview.add(new Item(6,"제목2",0));
        listview.add(new Item(7,"제목3",0));
        listview.add(new Item(8,"제목2",0));
        listview.add(new Item(9,"제목3",0));
        listview.add(new Item(10,"제목2",0));
        listview.add(new Item(11,"제목3",0));*/
        viewAdapters=new viewAdapter(listes.this, listview);
        commentListView.setAdapter(viewAdapters);

        commentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent go_content = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(go_content);
            }
        });
    }

}
