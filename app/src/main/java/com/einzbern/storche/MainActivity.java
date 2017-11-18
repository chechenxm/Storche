package com.einzbern.storche;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

public class MainActivity extends AppCompatActivity {
    private MaterialCalendarView calendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView = (MaterialCalendarView)findViewById(R.id.materialCalendarView);
        calendarView.setTopbarVisible(false);



    }
}
