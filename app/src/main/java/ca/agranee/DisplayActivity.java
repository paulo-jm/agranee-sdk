package ca.agranee;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import ca.agranee.util.Constants;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(getResources().getString(R.string.title_activity_display));
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });

        }

        Intent intent = getIntent();

        String strOne =  intent.getStringExtra(Constants.VALUE_ONE);
        String strTwo =  intent.getStringExtra(Constants.VALUE_TWO);

        EditText valueOne = (EditText) findViewById(R.id.valueOne);
        EditText valueTwo = (EditText) findViewById(R.id.valueTwo);

        valueOne.setText(strOne);
        valueOne.setEnabled(false);

        valueTwo.setText(strTwo);
        valueTwo.setEnabled(false);
    }

}
