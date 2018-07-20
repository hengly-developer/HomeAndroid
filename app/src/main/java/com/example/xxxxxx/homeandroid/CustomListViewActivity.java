package com.example.xxxxxx.homeandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CustomListViewActivity extends AppCompatActivity {


    ListView listView;
    String[] storyName = {"ANT-MAN","BLACK-RUNNER","GREATEST-SHOWMAN","MAZE-RUNNER","PANTERA-NEGRA","PAMPAGE","STORM"};
    String[] storyDesc = {"ANT-MAN the best hollywood film in 2018","BLACK-RUNNER the best hollywood film in 2018","GREATEST-SHOWMAN the best hollywood film in 2018","MAZE-RUNNER the best hollywood film in 2018","PANTERA-NEGRA the best hollywood film in 2018","PAMPAGE the best hollywood film in 2018","STORM the best hollywood film in 2018"};
    Integer[] imageid ={R.drawable.ant_name,R.drawable.black_runner,R.drawable.greatest_showman,R.drawable.maze_runner,R.drawable.pantera_negra,R.drawable.rampage,R.drawable.storm};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        listView = findViewById(R.id.list_view);
        CustomListview customListview = new CustomListview(this,storyName,storyDesc,imageid);
        listView.setAdapter(customListview);



    }
}
