//cd C:\Users\Nathan\AndroidStudioProjects\Scouting\app\build\outputs\apk
//zipalign -f -v 4 app-release-unaligned.apk app-release-aligned.apk
package com.frc2338.nathan.scouting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends ActionBarActivity {
    // <editor-fold defaultstate="collapsed" desc="Scoring methods">
    // <editor-fold defaultstate="collapsed" desc="Tote Changes">
    public void tote6Change(View view) {
        if(Globals.addsub){
        Globals.tote6++;
        }else if (Globals.tote6 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.tote6--;
        }
        TextView textView = (TextView) findViewById(R.id.tote6Count);
        textView.setText(Integer.toString(Globals.tote6));
}
    public void tote5Change(View view){
        if(Globals.addsub){
            Globals.tote5++;
        }else if (Globals.tote5 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.tote5--;
        }
        TextView textView = (TextView) findViewById(R.id.tote5Count);
        textView.setText(Integer.toString(Globals.tote5));
    }
    public void tote4Change(View view){
        if(Globals.addsub){
            Globals.tote4++;
        }else if (Globals.tote4 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.tote4--;
        }
        TextView textView = (TextView) findViewById(R.id.tote4Count);
        textView.setText(Integer.toString(Globals.tote4));
    }
    public void tote3Change(View view){
        if(Globals.addsub){
            Globals.tote3++;
        }else if (Globals.tote3 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.tote3--;
        }
        TextView textView = (TextView) findViewById(R.id.tote3Count);
        textView.setText(Integer.toString(Globals.tote3));
    }
    public void tote2Change(View view){
        if(Globals.addsub){
            Globals.tote2++;
        }else if (Globals.tote2 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.tote2--;
        }
        TextView textView = (TextView) findViewById(R.id.tote2Count);
        textView.setText(Integer.toString(Globals.tote2));
    }
    public void tote1Change(View view){
        if(Globals.addsub){
            Globals.tote1++;
        }else if (Globals.tote1 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.tote1--;
        }
        TextView textView = (TextView) findViewById(R.id.tote1Count);
        textView.setText(Integer.toString(Globals.tote1));
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Can Changes">
    public void can6Change(View view){
        if (Globals.addsub) {
            Globals.can6++;
        }else if (Globals.can6 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.can6--;
        }
        TextView textView = (TextView) findViewById(R.id.can6Count);
        textView.setText(Integer.toString(Globals.can6));
    }
    public void can5Change(View view){
        if (Globals.addsub) {
            Globals.can5++;
        }else if (Globals.can5 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.can5--;
        }
        TextView textView = (TextView) findViewById(R.id.can5Count);
        textView.setText(Integer.toString(Globals.can5));
    }
    public void can4Change(View view){
        if (Globals.addsub) {
            Globals.can4++;
        }else if (Globals.can4 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.can4--;
        }
        TextView textView = (TextView) findViewById(R.id.can4Count);
        textView.setText(Integer.toString(Globals.can4));
    }
    public void can3Change(View view){
        if(Globals.addsub){
            Globals.can3++;
        }else if (Globals.can3 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.can3--;
        }
        TextView textView = (TextView) findViewById(R.id.can3Count);
        textView.setText(Integer.toString(Globals.can3));
    }
    public void can2Change(View view){
        if(Globals.addsub){
            Globals.can2++;
        }else if (Globals.can2 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.can2--;
        }
        TextView textView = (TextView) findViewById(R.id.can2Count);
        textView.setText(Integer.toString(Globals.can2));
    }
    public void can1Change(View view){
        if(Globals.addsub){
            Globals.can1++;
        }else if (Globals.can1 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.can1--;
        }
        TextView textView = (TextView) findViewById(R.id.can1Count);
        textView.setText(Integer.toString(Globals.can1));
    }
    // </editor-fold>
    public void noodleChange(View view){
        if(Globals.addsub){
            Toast.makeText(getApplicationContext(), "Oodles of Noodles", Toast.LENGTH_SHORT).show();
            Globals.noodle++;
        }else if (Globals.noodle == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative\noodles of noodles", Toast.LENGTH_SHORT).show();
        }else{
            Globals.noodle--;
        }
        TextView textView = (TextView) findViewById(R.id.noodleCount);
        textView.setText(Integer.toString(Globals.noodle));
    }
    public void wreckedStackChange(View view){
        if(Globals.addsub){
            Toast.makeText(getApplicationContext(), "Stack REKT", Toast.LENGTH_SHORT).show();
            Globals.wreckedStack++;
        }else if (Globals.wreckedStack == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.wreckedStack--;
        }
        TextView textView = (TextView) findViewById(R.id.wreckedStackCount);
        textView.setText(Integer.toString(Globals.wreckedStack));
    }
    public void thrownLitter(View view){
        if(Globals.addsub){
            Globals.thrownLitter++;
        }else if (Globals.thrownLitter == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.thrownLitter--;
        }
        TextView textView = (TextView) findViewById(R.id.thrownLitterCount);
        textView.setText(Integer.toString(Globals.thrownLitter));
    }
    public void processLitter(View view){
        if(Globals.addsub){
            Toast.makeText(getApplicationContext(), "Compiled Litter", Toast.LENGTH_SHORT).show();
            Globals.processedLitter++;
        }else if (Globals.processedLitter == 0) {
            Toast.makeText(getApplicationContext(), "Cannot have negative", Toast.LENGTH_SHORT).show();
        }else{
            Globals.processedLitter--;
        }
        TextView textView = (TextView) findViewById(R.id.processedLitterCount);
        textView.setText(Integer.toString(Globals.processedLitter));
    }
    //</editor-fold>
    public void addSubtractChange(View view){
        Globals.addsub = !Globals.addsub;
        if(Globals.addsub){
            Toast.makeText(getApplicationContext(), "Mode: Add", Toast.LENGTH_SHORT).show();
            Button p1_button = (Button)findViewById(R.id.addSubtract);
            p1_button.setText("Add");
        }else{
            Toast.makeText(getApplicationContext(), "Mode: Subtract", Toast.LENGTH_SHORT).show();
            Button p1_button = (Button)findViewById(R.id.addSubtract);
            p1_button.setText("Subtract");
        }
    }
    public void toAuto(View view){
        Intent intent = new Intent(this, Auto.class);
        startActivity(intent);
    }
    public void toNotes(View view){
        Intent intent = new Intent(this, Notes.class);
        startActivity(intent);
    }
    public void team2338(View view){
        Toast.makeText(getApplicationContext(), "Team 2338 is awesome", Toast.LENGTH_LONG).show();
    }
    public void submit(View view){
        EditText team = (EditText) findViewById(R.id.TeamNumber);
        EditText match = (EditText) findViewById(R.id.MatchNumber);
        Globals.teamNumber = Integer.parseInt(team.getText().toString());
        Globals.matchNumber = Integer.parseInt(match.getText().toString());
        if(Globals.teamNumber == 173){
            Toast.makeText(getApplicationContext(), "Top Quark?", Toast.LENGTH_SHORT).show();
        }
        if((Globals.teamNumber <= 0 || Globals.matchNumber <= 0) && !Globals.affirmative){
            Toast.makeText(getApplicationContext(), "Needs team\nand match number", Toast.LENGTH_SHORT).show();
        }else if(Globals.teamNumber >= 5787 && !Globals.affirmative) {
            Toast.makeText(getApplicationContext(), "Team number is too large", Toast.LENGTH_SHORT).show();
        }else {
            Globals sms = new Globals();
            Intent intent = new Intent(this, Alerts.class);
            try {
                if (Globals.affirmative || (Globals.textFailed && Globals.alertMode == 2)) {
                    sms.saveSMS();
                    sms.allZero();
                }
                if (Globals.phoneNumber != null && Globals.phoneNumber.length() >= 10 && !Globals.scoutText) {
                    Globals.alertMode = 1;
                    startActivity(intent);
                } else if (Globals.phoneNumber != null && Globals.phoneNumber.length() >= 10) {
                    Globals.alertMode = 2;
                    startActivity(intent);
                } else if (Globals.scoutText) {
                    Globals.alertMode = 3;
                    startActivity(intent);
                }
            }catch(Exception e){
                Toast.makeText(getApplicationContext(), "Creating an sms failed, will default to saving only", Toast.LENGTH_LONG).show();
                Globals.affirmative = true;
                Globals.scoutText = false;
            }
            try {
                FileWriter writer = new FileWriter("/sdcard/" + Globals.username + ".csv", true);
                writer.append(Globals.SMS);
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            sms.allZero();
            Globals.matchNumber++;
            // <editor-fold defaultstate="collapsed" desc="Set onscreen values">
            team.setText(Integer.toString(Globals.teamNumber));
            match.setText(Integer.toString(Globals.matchNumber));
            TextView t6set = (TextView) findViewById(R.id.tote6Count);
            t6set.setText(Integer.toString(Globals.tote6));
            TextView t5set = (TextView) findViewById(R.id.tote5Count);
            t5set.setText(Integer.toString(Globals.tote5));
            TextView t4set = (TextView) findViewById(R.id.tote4Count);
            t4set.setText(Integer.toString(Globals.tote4));
            TextView t3set = (TextView) findViewById(R.id.tote3Count);
            t3set.setText(Integer.toString(Globals.tote3));
            TextView t2set = (TextView) findViewById(R.id.tote2Count);
            t2set.setText(Integer.toString(Globals.tote2));
            TextView t1set = (TextView) findViewById(R.id.tote1Count);
            t1set.setText(Integer.toString(Globals.tote1));
            TextView c6set = (TextView) findViewById(R.id.can6Count);
            c6set.setText(Integer.toString(Globals.can6));
            TextView c5set = (TextView) findViewById(R.id.can5Count);
            c5set.setText(Integer.toString(Globals.can5));
            TextView c4set = (TextView) findViewById(R.id.can4Count);
            c4set.setText(Integer.toString(Globals.can4));
            TextView c3set = (TextView) findViewById(R.id.can3Count);
            c3set.setText(Integer.toString(Globals.can3));
            TextView c2set = (TextView) findViewById(R.id.can2Count);
            c2set.setText(Integer.toString(Globals.can2));
            TextView c1set = (TextView) findViewById(R.id.can1Count);
            c1set.setText(Integer.toString(Globals.can1));
            TextView wsset = (TextView) findViewById(R.id.wreckedStackCount);
            wsset.setText(Integer.toString(Globals.wreckedStack));
            TextView nset = (TextView) findViewById(R.id.noodleCount);
            nset.setText(Integer.toString(Globals.noodle));
            TextView plset = (TextView) findViewById(R.id.processedLitterCount);
            plset.setText(Integer.toString(Globals.processedLitter));
            TextView tlset = (TextView) findViewById(R.id.thrownLitterCount);
            tlset.setText(Integer.toString(Globals.thrownLitter));
            // </editor-fold>
        }
    }
    // <editor-fold defaultstate="collapsed" desc="State Methods">
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, Loading.class);
        startActivity(intent);
        setContentView(R.layout.activity_main);
        EditText team = (EditText) findViewById(R.id.TeamNumber);
        EditText match = (EditText) findViewById(R.id.MatchNumber);
        team.setText(Integer.toString(Globals.teamNumber));
        match.setText(Integer.toString(Globals.matchNumber));
        TextView t6set = (TextView) findViewById(R.id.tote6Count);
        t6set.setText(Integer.toString(Globals.tote6));
        TextView t5set = (TextView) findViewById(R.id.tote5Count);
        t5set.setText(Integer.toString(Globals.tote5));
        TextView t4set = (TextView) findViewById(R.id.tote4Count);
        t4set.setText(Integer.toString(Globals.tote4));
        TextView t3set = (TextView) findViewById(R.id.tote3Count);
        t3set.setText(Integer.toString(Globals.tote3));
        TextView t2set = (TextView) findViewById(R.id.tote2Count);
        t2set.setText(Integer.toString(Globals.tote2));
        TextView t1set = (TextView) findViewById(R.id.tote1Count);
        t1set.setText(Integer.toString(Globals.tote1));
        TextView c6set = (TextView) findViewById(R.id.can6Count);
        c6set.setText(Integer.toString(Globals.can6));
        TextView c5set = (TextView) findViewById(R.id.can5Count);
        c5set.setText(Integer.toString(Globals.can5));
        TextView c4set = (TextView) findViewById(R.id.can4Count);
        c4set.setText(Integer.toString(Globals.can4));
        TextView c3set = (TextView) findViewById(R.id.can3Count);
        c3set.setText(Integer.toString(Globals.can3));
        TextView c2set = (TextView) findViewById(R.id.can2Count);
        c2set.setText(Integer.toString(Globals.can2));
        TextView c1set = (TextView) findViewById(R.id.can1Count);
        c1set.setText(Integer.toString(Globals.can1));
        TextView wsset = (TextView) findViewById(R.id.wreckedStackCount);
        wsset.setText(Integer.toString(Globals.wreckedStack));
        TextView nset = (TextView) findViewById(R.id.noodleCount);
        nset.setText(Integer.toString(Globals.noodle));
        TextView plset = (TextView) findViewById(R.id.processedLitterCount);
        plset.setText(Integer.toString(Globals.processedLitter));
        TextView tlset = (TextView) findViewById(R.id.thrownLitterCount);
        tlset.setText(Integer.toString(Globals.thrownLitter));
    }
    @Override
    protected void onPause(){
        super.onPause();
        EditText team = (EditText) findViewById(R.id.TeamNumber);
        EditText match = (EditText) findViewById(R.id.MatchNumber);
        Globals.teamNumber = Integer.parseInt(team.getText().toString());
        Globals.matchNumber = Integer.parseInt(match.getText().toString());
    }
    @Override
    protected void onResume() {
        super.onResume();
        EditText team = (EditText) findViewById(R.id.TeamNumber);
        EditText match = (EditText) findViewById(R.id.MatchNumber);
        team.setText(Integer.toString(Globals.teamNumber));
        match.setText(Integer.toString(Globals.matchNumber));
        TextView t6set = (TextView) findViewById(R.id.tote6Count);
        t6set.setText(Integer.toString(Globals.tote6));
        TextView t5set = (TextView) findViewById(R.id.tote5Count);
        t5set.setText(Integer.toString(Globals.tote5));
        TextView t4set = (TextView) findViewById(R.id.tote4Count);
        t4set.setText(Integer.toString(Globals.tote4));
        TextView t3set = (TextView) findViewById(R.id.tote3Count);
        t3set.setText(Integer.toString(Globals.tote3));
        TextView t2set = (TextView) findViewById(R.id.tote2Count);
        t2set.setText(Integer.toString(Globals.tote2));
        TextView t1set = (TextView) findViewById(R.id.tote1Count);
        t1set.setText(Integer.toString(Globals.tote1));
        TextView c6set = (TextView) findViewById(R.id.can6Count);
        c6set.setText(Integer.toString(Globals.can6));
        TextView c5set = (TextView) findViewById(R.id.can5Count);
        c5set.setText(Integer.toString(Globals.can5));
        TextView c4set = (TextView) findViewById(R.id.can4Count);
        c4set.setText(Integer.toString(Globals.can4));
        TextView c3set = (TextView) findViewById(R.id.can3Count);
        c3set.setText(Integer.toString(Globals.can3));
        TextView c2set = (TextView) findViewById(R.id.can2Count);
        c2set.setText(Integer.toString(Globals.can2));
        TextView c1set = (TextView) findViewById(R.id.can1Count);
        c1set.setText(Integer.toString(Globals.can1));
        TextView wsset = (TextView) findViewById(R.id.wreckedStackCount);
        wsset.setText(Integer.toString(Globals.wreckedStack));
        TextView nset = (TextView) findViewById(R.id.noodleCount);
        nset.setText(Integer.toString(Globals.noodle));
        TextView plset = (TextView) findViewById(R.id.processedLitterCount);
        plset.setText(Integer.toString(Globals.processedLitter));
        TextView tlset = (TextView) findViewById(R.id.thrownLitterCount);
        tlset.setText(Integer.toString(Globals.thrownLitter));
        if(Globals.addsub){
            Button add = (Button)findViewById(R.id.addSubtract);
            add.setText("Add");
        }else{
            Button sub = (Button)findViewById(R.id.addSubtract);
            sub.setText("Subtract");
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
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
    // </editor-fold>
}
