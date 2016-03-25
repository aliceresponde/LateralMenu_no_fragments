package com.example.aliceresponde.examplelateralmenu;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;

public class Settings_activity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_activity);

        toolbar = (Toolbar)  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TypedValue typedValueColorPrimaryDark = new TypedValue();

        Settings_activity.this.getTheme().resolveAttribute(R.attr.colorPrimaryDark,
                typedValueColorPrimaryDark, true);

        final int colorPrimaryDark =typedValueColorPrimaryDark.data;

        if(Build.VERSION.SDK_INT>=21){
            getWindow().setStatusBarColor(colorPrimaryDark);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflate menu
        getMenuInflater().inflate(  R.menu.menu_settings, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id== R.id.action_settings){
          return   true;
        }

        return super.onOptionsItemSelected(item);
    }
}
