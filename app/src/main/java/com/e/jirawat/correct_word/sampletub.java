package com.e.jirawat.correct_word;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class sampletub extends AppCompatActivity {

    SearchView search;
    ListView list;
    ArrayList<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tub);

        list = (ListView) findViewById(R.id.list1);
        search = (SearchView) findViewById(R.id.search1);


        final ArrayAdapter<String> adapters = new ArrayAdapter<String>(sampletub.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.exsub));

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapters.getFilter().filter(newText);
                return false;
            }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent = new Intent(sampletub.this,sampletub2.class);
                intent.putExtra("correct",list.getItemAtPosition(i).toString() );
                startActivity(intent);
            }
        });
        list.setAdapter(adapters);

    }

}