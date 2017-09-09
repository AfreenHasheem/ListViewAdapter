package com.example.afreen.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final ListView myFriendListView= (ListView) findViewById(R.id.myFriendListView);

        final ArrayList<String> myFriends= new ArrayList<String>();
        myFriends.add("Vipasha");
        myFriends.add("Divya");
        myFriends.add("Harshini");
        myFriends.add("Heena");

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myFriends);
        myFriendListView.setAdapter(arrayAdapter);

        myFriendListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(),"Hello" + myFriends.get(i),Toast.LENGTH_LONG).show();

            }
        });





    }
}
