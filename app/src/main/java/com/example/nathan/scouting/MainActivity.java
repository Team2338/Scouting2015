
package com.example.nathan.scouting;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import java.io.FileWriter;
import java.io.IOException;


public class MainActivity extends ActionBarActivity {

    boolean addsub = true, autoStack = false, mobility = false;
    int teamNumber = 0, matchNumber = 1, tote1 = 0, tote2 = 0, tote3 = 0, tote4 = 0, tote5 = 0,
        tote6 = 0, can1 = 0, can2 = 0, can3 = 0, can4 = 0, can5 = 0, can6 = 0, noodle = 0,
        autoTote = 0, autoCan = 0, wreckedStack = 0;


    public void tote6Change(View view) {
        if(addsub){
            Toast.makeText(getApplicationContext(), "Tote 6", Toast.LENGTH_SHORT).show();
        tote6++;
        }else if (tote6 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            tote6--;
        }
        TextView textView = (TextView) findViewById(R.id.tote6Count);
        textView.setText(Integer.toString(tote6));
}
    public void tote5Change(View view){
        if(addsub){
            Toast.makeText(getApplicationContext(), "Tote 5", Toast.LENGTH_SHORT).show();
            tote5++;
        }else if (tote5 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            tote5--;
        }
        TextView textView = (TextView) findViewById(R.id.tote5Count);
        textView.setText(Integer.toString(tote5));
    }
    public void tote4Change(View view){
        if(addsub){
            Toast.makeText(getApplicationContext(), "Tote 4", Toast.LENGTH_SHORT).show();
            tote4++;
        }else if (tote4 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            tote4--;
        }
        TextView textView = (TextView) findViewById(R.id.tote4Count);
        textView.setText(Integer.toString(tote4));
    }
    public void tote3Change(View view){
        if(addsub){
            Toast.makeText(getApplicationContext(), "Tote 3", Toast.LENGTH_SHORT).show();
            tote3++;
        }else if (tote3 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            tote3--;
        }
        TextView textView = (TextView) findViewById(R.id.tote3Count);
        textView.setText(Integer.toString(tote3));
    }
    public void tote2Change(View view){
        if(addsub){
            Toast.makeText(getApplicationContext(), "Tote 2", Toast.LENGTH_SHORT).show();
            tote2++;
        }else if (tote2 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            tote2--;
        }
        TextView textView = (TextView) findViewById(R.id.tote2Count);
        textView.setText(Integer.toString(tote2));
    }
    public void tote1Change(View view){
        if(addsub){
            Toast.makeText(getApplicationContext(), "Tote 1", Toast.LENGTH_SHORT).show();
            tote1++;
        }else if (tote1 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            tote1--;
        }
        TextView textView = (TextView) findViewById(R.id.tote1Count);
        textView.setText(Integer.toString(tote1));
    }
    public void can6Change(View view){
        if (addsub) {
            Toast.makeText(getApplicationContext(), "Can 6", Toast.LENGTH_SHORT).show();
            can6++;
        }else if (can6 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            can6--;
        }
        TextView textView = (TextView) findViewById(R.id.can6Count);
        textView.setText(Integer.toString(can6));
    }
    public void can5Change(View view){
        if (addsub) {
            Toast.makeText(getApplicationContext(), "Can 5", Toast.LENGTH_SHORT).show();
            can5++;
        }else if (can5 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            can5--;
        }
        TextView textView = (TextView) findViewById(R.id.can5Count);
        textView.setText(Integer.toString(can5));
    }
    public void can4Change(View view){
        if (addsub) {
            Toast.makeText(getApplicationContext(), "Can 4", Toast.LENGTH_SHORT).show();
            can4++;
        }else if (can4 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            can4--;
        }
        TextView textView = (TextView) findViewById(R.id.can4Count);
        textView.setText(Integer.toString(can4));
    }
    public void can3Change(View view){
        if(addsub){
            Toast.makeText(getApplicationContext(), "Can 3", Toast.LENGTH_SHORT).show();
            can3++;
        }else if (can3 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            can3--;
        }
        TextView textView = (TextView) findViewById(R.id.can3Count);
        textView.setText(Integer.toString(can3));
    }
    public void can2Change(View view){
        if(addsub){
            Toast.makeText(getApplicationContext(), "Can 2", Toast.LENGTH_SHORT).show();
            can2++;
        }else if (can2 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            can2--;
        }
        TextView textView = (TextView) findViewById(R.id.can2Count);
        textView.setText(Integer.toString(can2));
    }
    public void can1Change(View view){
        if(addsub){
            Toast.makeText(getApplicationContext(), "Can 1", Toast.LENGTH_SHORT).show();
            can1++;
        }else if (can1 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            can1--;
        }
        TextView textView = (TextView) findViewById(R.id.can1Count);
        textView.setText(Integer.toString(can1));
    }
    public void noodleChange(View view){
        if(addsub){
            Toast.makeText(getApplicationContext(), "Oodles of Noodles", Toast.LENGTH_SHORT).show();
            noodle++;
        }else if (noodle == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            noodle--;
        }
        TextView textView = (TextView) findViewById(R.id.noodleCount);
        textView.setText(Integer.toString(noodle));
    }
    public void wreckedStackChange(View view){
        if(addsub){
            Toast.makeText(getApplicationContext(), "Stack REKT", Toast.LENGTH_SHORT).show();
            wreckedStack++;
        }else if (wreckedStack == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            wreckedStack--;
        }
        TextView textView = (TextView) findViewById(R.id.wreckedStackCount);
        textView.setText(Integer.toString(wreckedStack));
    }
    public void addSubtractChange(View view){
        addsub = !addsub;
        String choseAddSub;
        if(addsub){
            choseAddSub = "Mode: Add";
        }else{
            choseAddSub = "Mode: Subtract";
        }
        Toast.makeText(getApplicationContext(), choseAddSub, Toast.LENGTH_SHORT).show();
    }
    public void autoToteChange(View view){
        if(addsub){
            Toast.makeText(getApplicationContext(), "Auto Tote", Toast.LENGTH_SHORT).show();
            autoTote++;
        }else if (autoTote == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            autoTote--;
        }
        TextView textView = (TextView) findViewById(R.id.autoToteCount);
        textView.setText(Integer.toString(autoTote));
    }
    public void autoCanChange(View view){
        if(addsub){
            Toast.makeText(getApplicationContext(), "Auto Can", Toast.LENGTH_SHORT).show();
            autoCan++;
        }else if (autoCan == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            autoCan--;
        }
        TextView textView = (TextView) findViewById(R.id.autoCanCount);
        textView.setText(Integer.toString(autoCan));
    }
    public void autoStack(View view){
        autoStack = ((CheckBox) view).isChecked();
        if(autoStack){
            Toast.makeText(getApplicationContext(), "Auto Stack", Toast.LENGTH_SHORT).show();
        }
    }
    public void mobility(View view){
        mobility = ((CheckBox) view).isChecked();
        if(mobility){
            Toast.makeText(getApplicationContext(), "Mobility", Toast.LENGTH_SHORT).show();
        }
    }

    public void submit(View view){
        Toast.makeText(getApplicationContext(), "Saved To Device", Toast.LENGTH_SHORT).show();
        EditText team = (EditText) findViewById(R.id.TeamNumber);
        EditText match = (EditText) findViewById(R.id.MatchNumber);
        teamNumber = Integer.parseInt(team.getText().toString());
        matchNumber = Integer.parseInt(match.getText().toString());
        try{
            FileWriter writer = new FileWriter("/sdcard/scouting.txt", true);
            writer.append(Integer.toString(matchNumber));
            writer.append(',');
            writer.append(Integer.toString(teamNumber));
            writer.append(',');
            writer.append('0');
            writer.append(',');
            writer.append(Integer.toString(autoTote));
            writer.append(',');
            writer.append('0');
            writer.append(',');
            writer.append(Boolean.toString(autoStack));
            writer.append(',');
            writer.append('0');
            writer.append(',');
            writer.append(Integer.toString(autoCan));
            writer.append(',');
            writer.append('0');
            writer.append(',');
            writer.append(Integer.toString(tote1));
            writer.append(',');
            writer.append(Integer.toString(tote2));
            writer.append(',');
            writer.append(Integer.toString(tote3));
            writer.append(',');
            writer.append(Integer.toString(tote4));
            writer.append(',');
            writer.append(Integer.toString(tote5));
            writer.append(',');
            writer.append(Integer.toString(tote6));
            writer.append(',');
            writer.append('0');
            writer.append(',');
            writer.append(Integer.toString(can1));
            writer.append(',');
            writer.append(Integer.toString(can2));
            writer.append(',');
            writer.append(Integer.toString(can3));
            writer.append(',');
            writer.append(Integer.toString(can4));
            writer.append(',');
            writer.append(Integer.toString(can5));
            writer.append(',');
            writer.append(Integer.toString(can6));
            writer.append(',');
            writer.append(Integer.toString(noodle));
            writer.append(',');
            writer.append(Integer.toString(wreckedStack));
            writer.append(',');
            writer.append(Boolean.toString(mobility));
            writer.append("\r\n");
            writer.flush();
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        /*if(mobility){
            ((CheckBox) view).toggle();
        }
        if(autoStack){
          ((CheckBox) view).toggle();
        }*/
        teamNumber = 0; matchNumber++; tote1 = 0; tote2 = 0; tote3 = 0; tote4 = 0; tote5 = 0;
        tote6 = 0; can1 = 0; can2 = 0; can3 = 0; can4 = 0; can5 = 0; can6 = 0; noodle = 0;
        autoTote = 0; autoCan = 0; wreckedStack = 0;
        addsub = true;
        team.setText(Integer.toString(teamNumber));
        match.setText(Integer.toString(matchNumber));
        TextView t6set = (TextView) findViewById(R.id.tote6Count);
        t6set.setText(Integer.toString(tote6));
        TextView t5set = (TextView) findViewById(R.id.tote5Count);
        t5set.setText(Integer.toString(tote5));
        TextView t4set = (TextView) findViewById(R.id.tote4Count);
        t4set.setText(Integer.toString(tote4));
        TextView t3set = (TextView) findViewById(R.id.tote3Count);
        t3set.setText(Integer.toString(tote3));
        TextView t2set = (TextView) findViewById(R.id.tote2Count);
        t2set.setText(Integer.toString(tote2));
        TextView t1set = (TextView) findViewById(R.id.tote1Count);
        t1set.setText(Integer.toString(tote1));
        TextView c6set = (TextView) findViewById(R.id.can6Count);
        c6set.setText(Integer.toString(can6));
        TextView c5set = (TextView) findViewById(R.id.can5Count);
        c5set.setText(Integer.toString(can5));
        TextView c4set = (TextView) findViewById(R.id.can4Count);
        c4set.setText(Integer.toString(can4));
        TextView c3set = (TextView) findViewById(R.id.can3Count);
        c3set.setText(Integer.toString(can3));
        TextView c2set = (TextView) findViewById(R.id.can2Count);
        c2set.setText(Integer.toString(can2));
        TextView c1set = (TextView) findViewById(R.id.can1Count);
        c1set.setText(Integer.toString(can1));
        TextView atset = (TextView) findViewById(R.id.autoToteCount);
        atset.setText(Integer.toString(autoTote));
        TextView acset = (TextView) findViewById(R.id.autoCanCount);
        acset.setText(Integer.toString(autoCan));
        TextView wsset = (TextView) findViewById(R.id.wreckedStackCount);
        wsset.setText(Integer.toString(wreckedStack));
        TextView nset = (TextView) findViewById(R.id.noodleCount);
        nset.setText(Integer.toString(noodle));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText team = (EditText) findViewById(R.id.TeamNumber);
        EditText match = (EditText) findViewById(R.id.MatchNumber);
        team.setText(Integer.toString(teamNumber));
        match.setText(Integer.toString(matchNumber));
        TextView t6set = (TextView) findViewById(R.id.tote6Count);
        t6set.setText(Integer.toString(tote6));
        TextView t5set = (TextView) findViewById(R.id.tote5Count);
        t5set.setText(Integer.toString(tote5));
        TextView t4set = (TextView) findViewById(R.id.tote4Count);
        t4set.setText(Integer.toString(tote4));
        TextView t3set = (TextView) findViewById(R.id.tote3Count);
        t3set.setText(Integer.toString(tote3));
        TextView t2set = (TextView) findViewById(R.id.tote2Count);
        t2set.setText(Integer.toString(tote2));
        TextView t1set = (TextView) findViewById(R.id.tote1Count);
        t1set.setText(Integer.toString(tote1));
        TextView c6set = (TextView) findViewById(R.id.can6Count);
        c6set.setText(Integer.toString(can6));
        TextView c5set = (TextView) findViewById(R.id.can5Count);
        c5set.setText(Integer.toString(can5));
        TextView c4set = (TextView) findViewById(R.id.can4Count);
        c4set.setText(Integer.toString(can4));
        TextView c3set = (TextView) findViewById(R.id.can3Count);
        c3set.setText(Integer.toString(can3));
        TextView c2set = (TextView) findViewById(R.id.can2Count);
        c2set.setText(Integer.toString(can2));
        TextView c1set = (TextView) findViewById(R.id.can1Count);
        c1set.setText(Integer.toString(can1));
        TextView atset = (TextView) findViewById(R.id.autoToteCount);
        atset.setText(Integer.toString(autoTote));
        TextView acset = (TextView) findViewById(R.id.autoCanCount);
        acset.setText(Integer.toString(autoCan));
        TextView wsset = (TextView) findViewById(R.id.wreckedStackCount);
        wsset.setText(Integer.toString(wreckedStack));
        TextView nset = (TextView) findViewById(R.id.noodleCount);
        nset.setText(Integer.toString(noodle));
        Toast.makeText(getApplicationContext(), "Brought to you by\n First team 2338\n Gear It Forward", Toast.LENGTH_LONG).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
