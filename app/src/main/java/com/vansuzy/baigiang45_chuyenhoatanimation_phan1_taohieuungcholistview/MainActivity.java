package com.vansuzy.baigiang45_chuyenhoatanimation_phan1_taohieuungcholistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.vansuzy.adapter.MyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTen;
    ArrayList<String> dsTen;
    ArrayAdapter<String> adapterTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
    }

    private void addControls() {
        lvTen = (ListView) findViewById(R.id.lvData);
        dsTen=new ArrayList<>();
        adapterTen=new MyAdapter(
                MainActivity.this,
                R.layout.item,
                dsTen
        );
        lvTen.setAdapter(adapterTen);

        for (int i=0; i<5000; i++) {
            dsTen.add("Tên thứ " + i);
        }
        adapterTen.notifyDataSetChanged();
    }
}
