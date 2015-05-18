package com.frc2338.nathan.scouting;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.*;
import android.content.Intent;


public class Auto extends ActionBarActivity {
    public void autoToteChange(View view){
        if(Globals.addsub){
            Globals.autoTote++;
        }else if (Globals.autoTote == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.autoTote--;
        }
        TextView atset = (TextView) findViewById(R.id.autoToteCount);
        atset.setText(Integer.toString(Globals.autoTote));
    }
    public void autoCanChange(View view){
        if(Globals.addsub){
            Globals.autoCan++;
        }else if (Globals.autoCan == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.autoCan--;
        }
        TextView acset = (TextView) findViewById(R.id.autoCanCount);
        acset.setText(Integer.toString(Globals.autoCan));
    }
    public void autoStack(View view){
        Globals.autoStack = ((CheckBox) view).isChecked();
        if(Globals.autoStack){
            Toast.makeText(getApplicationContext(), "Auto Stack", Toast.LENGTH_SHORT).show();
        }
    }
    public void autoGrab(View view){
        Globals.grabAuto = ((CheckBox) view).isChecked();
        if(Globals.grabAuto){
            Toast.makeText(getApplicationContext(), "Grabbed Cans", Toast.LENGTH_SHORT).show();
        }
    }
    public void teleGrab(View view){
        Globals.grabTele = ((CheckBox) view).isChecked();
        if(Globals.grabTele){
            Toast.makeText(getApplicationContext(), "Grabbed Cans", Toast.LENGTH_SHORT).show();
        }
    }
    public void mobility(View view){
        Globals.mobility = ((CheckBox) view).isChecked();
        if(Globals.mobility){
            Toast.makeText(getApplicationContext(), "Mobility", Toast.LENGTH_SHORT).show();
        }
    }
    public void coopStack(View view){
        Globals.coopStack = ((CheckBox) view).isChecked();
        if(Globals.coopStack){
            Toast.makeText(getApplicationContext(), "Co-op Totes", Toast.LENGTH_SHORT).show();
        }
    }
    public void coopWrecked(View view){
        Globals.coopWrecked = ((CheckBox) view).isChecked();
        if(Globals.coopWrecked){
            Toast.makeText(getApplicationContext(), "Co-Op Failed", Toast.LENGTH_SHORT).show();
        }
    }
    public void addSubtractChange(View view) {
        Globals.addsub = !Globals.addsub;
        if (Globals.addsub) {
            Toast.makeText(getApplicationContext(), "Mode: Add", Toast.LENGTH_SHORT).show();
            Button p1_button = (Button) findViewById(R.id.addSubtract);
            p1_button.setText("Add");
        } else {
            Toast.makeText(getApplicationContext(), "Mode: Subtract", Toast.LENGTH_SHORT).show();
            Button p1_button = (Button) findViewById(R.id.addSubtract);
            p1_button.setText("Subtract");
        }
    }
    public void teamUrl(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW , Uri.parse("http://oswegofirst.org/about/about-column-2/scouting-app.html"));
        startActivity(browse);
    }
    public void ratingLink(View view){
        Intent browse = new Intent(Intent.ACTION_VIEW , Uri.parse("https://play.google.com/store/apps/details?id=com.frc2338.nathan.scouting"));
        startActivity(browse);
    }
    public void team2338(View view){
        Toast.makeText(getApplicationContext(), "Team 2338 is awesome", Toast.LENGTH_LONG).show();
    }
    public void clearAll(View view) {
        Globals.alertMode = 0;
        Intent intent = new Intent(this, Alerts.class);
        startActivity(intent);
    }
    public void currentScore(View view){
        Globals.totalScore = ((Globals.tote1 + Globals.tote2 + Globals.tote3 + Globals.tote4 + Globals.tote5 + Globals.tote6) * 2)
        + ((Globals.can1 * 4) + (Globals.can2 * 8) + (Globals.can3 * 12) + (Globals.can4 * 16) + (Globals.can5 * 20) + (Globals.can6 * 24))
        + ((Globals.noodle * 6) + Globals.processedLitter + (Globals.thrownLitter * 4));
        if(Globals.autoTote > 2){
            if(Globals.autoStack){
                Globals.totalScore= Globals.totalScore + 14;
            }
            Globals.totalScore = Globals.totalScore + 6;
        }
        if(Globals.autoCan > 2){
            Globals.totalScore = Globals.totalScore + 8;
        }
        TextView total = (TextView) findViewById(R.id.totalScore);
        total.setText(Integer.toString(Globals.totalScore));
    }
    public void toTele(View view){
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);
        TextView atset = (TextView) findViewById(R.id.autoToteCount);
        atset.setText(Integer.toString(Globals.autoTote));
        TextView acset = (TextView) findViewById(R.id.autoCanCount);
        acset.setText(Integer.toString(Globals.autoCan));
        TextView textView = (TextView) findViewById(R.id.nameLine);
        textView.setText(Globals.username);
        TextView number = (TextView) findViewById(R.id.nameLine);
        number.setText(Globals.phoneNumber);
        if(Globals.addsub){
            Button add = (Button)findViewById(R.id.addSubtract);
            add.setText("Add");
        }else{
            Button sub = (Button)findViewById(R.id.addSubtract);
            sub.setText("Subtract");
        }
        Globals.totalScore = ((Globals.tote1 + Globals.tote2 + Globals.tote3 + Globals.tote4 + Globals.tote5 + Globals.tote6) * 2)
        + ((Globals.can1 * 4) + (Globals.can2 * 8) + (Globals.can3 * 12) + (Globals.can4 * 16) + (Globals.can5 * 20) + (Globals.can6 * 24))
        + ((Globals.noodle * 6) + Globals.processedLitter + (Globals.thrownLitter * 4));
        TextView total = (TextView) findViewById(R.id.totalScore);
        total.setText(Integer.toString(Globals.totalScore));
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        final CheckBox autoStack = (CheckBox) findViewById(R.id.AutoStack);
        if (Globals.autoStack) {
            autoStack.setChecked(true);
        }else{
            autoStack.setChecked(false);
        }
        final CheckBox mobility = (CheckBox) findViewById(R.id.Mobility);
        if (Globals.mobility) {
            mobility.setChecked(true);
        }else{
        mobility.setChecked(false);
        }
        final CheckBox coopStack = (CheckBox) findViewById(R.id.coopStack);
        if (Globals.coopStack) {
            coopStack.setChecked(true);
        }else{
            coopStack.setChecked(false);
        }
        final CheckBox coopWrecked = (CheckBox) findViewById(R.id.wreckedCoop);
        if (Globals.coopWrecked) {
            coopWrecked.setChecked(true);
        }else{
            coopWrecked.setChecked(false);
        }
        final CheckBox grabTele = (CheckBox) findViewById(R.id.canTele);
        if (Globals.grabTele) {
            grabTele.setChecked(true);
        }else{
            grabTele.setChecked(false);
        }
        final CheckBox grabAuto = (CheckBox) findViewById(R.id.canAuto);
        if (Globals.grabAuto) {
            grabAuto.setChecked(true);
        }else{
            grabAuto.setChecked(false);
        }
    }
    @Override
    protected void onResume(){
        super.onResume();
        TextView atset = (TextView) findViewById(R.id.autoToteCount);
        atset.setText(Integer.toString(Globals.autoTote));
        TextView acset = (TextView) findViewById(R.id.autoCanCount);
        acset.setText(Integer.toString(Globals.autoCan));
        TextView user = (TextView) findViewById(R.id.nameLine);
        user.setText(Globals.username);
        TextView number = (TextView) findViewById(R.id.phoneNumber);
        number.setText(Globals.phoneNumber);
        if(Globals.addsub){
            Button add = (Button)findViewById(R.id.addSubtract);
            add.setText("Add");
        }else{
            Button sub = (Button)findViewById(R.id.addSubtract);
            sub.setText("Subtract");
        }
        Globals.totalScore = ((Globals.tote1 + Globals.tote2 + Globals.tote3 + Globals.tote4 + Globals.tote5 + Globals.tote6) * 2)
                + ((Globals.can1 * 4) + (Globals.can2 * 8) + (Globals.can3 * 12) + (Globals.can4 * 16) + (Globals.can5 * 20) + (Globals.can6 * 24))
                + ((Globals.noodle * 6) + Globals.processedLitter + (Globals.thrownLitter * 4));
        TextView total = (TextView) findViewById(R.id.totalScore);
        total.setText(Integer.toString(Globals.totalScore));
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        final CheckBox autoStack = (CheckBox) findViewById(R.id.AutoStack);
        if (Globals.autoStack) {
            autoStack.setChecked(true);
        }else{
            autoStack.setChecked(false);
        }
        final CheckBox mobility = (CheckBox) findViewById(R.id.Mobility);
        if (Globals.mobility) {
            mobility.setChecked(true);
        }else{
            mobility.setChecked(false);
        }
        final CheckBox coopStack = (CheckBox) findViewById(R.id.coopStack);
        if (Globals.coopStack) {
            coopStack.setChecked(true);
        }else{
            coopStack.setChecked(false);
        }
        final CheckBox coopWrecked = (CheckBox) findViewById(R.id.wreckedCoop);
        if (Globals.coopWrecked) {
            coopWrecked.setChecked(true);
        }else{
            coopWrecked.setChecked(false);
        }
        final CheckBox grabTele = (CheckBox) findViewById(R.id.canTele);
        if (Globals.grabTele) {
            grabTele.setChecked(true);
        }else{
            grabTele.setChecked(false);
        }
        final CheckBox grabAuto = (CheckBox) findViewById(R.id.canAuto);
        if (Globals.grabAuto) {
            grabAuto.setChecked(true);
        }else{
            grabAuto.setChecked(false);
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        EditText user = (EditText) findViewById(R.id.nameLine);
        Globals.username = user.getText().toString();
        EditText number = (EditText) findViewById(R.id.phoneNumber);
        Globals.phoneNumber = number.getText().toString();
    }
    @Override
    protected void onPause(){
        super.onPause();
        EditText user = (EditText) findViewById(R.id.nameLine);
        Globals.username = user.getText().toString();
        EditText number = (EditText) findViewById(R.id.phoneNumber);
        Globals.phoneNumber = number.getText().toString();
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_auto, menu);
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
