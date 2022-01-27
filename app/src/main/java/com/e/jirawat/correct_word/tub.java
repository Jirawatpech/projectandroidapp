package com.e.jirawat.correct_word;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class tub extends AppCompatActivity {
    SearchView search;
    ListView list;
    ArrayList<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tub);

        list = (ListView) findViewById(R.id.list);
        search = (SearchView) findViewById(R.id.search);


        final ArrayAdapter<String> adapters = new ArrayAdapter<String>(tub.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.extub));

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
                Intent intent = new Intent(tub.this,tub2.class);
                intent.putExtra("correct",list.getItemAtPosition(i).toString() );
                startActivity(intent);
            }
        });
        list.setAdapter(adapters);

    }

}

