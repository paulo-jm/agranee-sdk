package ca.agranee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import ca.agranee.util.Constants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(getResources().getString(R.string.title_activity_main));
        }

    }


    public void send(View view) {

        EditText valueOne = (EditText) findViewById(R.id.valueOne);
        EditText valueTwo = (EditText) findViewById(R.id.valueTwo);

        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra(Constants.VALUE_ONE, valueOne.getText().toString() );
        intent.putExtra(Constants.VALUE_TWO, valueTwo.getText().toString());
        startActivity(intent);

    }


}
