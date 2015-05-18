package com.frc2338.nathan.scouting;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.FileWriter;
import java.io.IOException;


public class Notes extends ActionBarActivity {
    String notes = "";
    public void team2338(View view){
        Toast.makeText(getApplicationContext(), "Team 2338 is awesome", Toast.LENGTH_LONG).show();
    }
    public void submit(View view){
        EditText team = (EditText) findViewById(R.id.TeamNumber);
        Globals.teamNumber = Integer.parseInt(team.getText().toString());
        EditText notesText = (EditText) findViewById(R.id.notes);
        notes = notesText.getText().toString();
        if(Globals.teamNumber <= 0){
            Toast.makeText(getApplicationContext(), "Needs team number", Toast.LENGTH_SHORT).show();
        }else {
            try {
                FileWriter writer = new FileWriter("/sdcard/scoutingNotes.csv", true);
                writer.append(Integer.toString(Globals.teamNumber));
                writer.append(':');
                writer.append(notes);
                writer.append("\r\n\r\n");
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Globals.teamNumber = 0;
            team.setText(Integer.toString(Globals.teamNumber));
            notes = "";
            notesText.setText(notes);
            Toast.makeText(getApplicationContext(), "Saved To Device", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        EditText team = (EditText) findViewById(R.id.TeamNumber);
        team.setText(Integer.toString(Globals.teamNumber));
        notes = "";
        EditText notesText = (EditText) findViewById(R.id.notes);
        notesText.setText(notes);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_notes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
