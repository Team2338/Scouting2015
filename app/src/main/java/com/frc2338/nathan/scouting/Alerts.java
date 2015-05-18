package com.frc2338.nathan.scouting;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Alerts extends ActionBarActivity {
    public void ok(View view){
        switch(Globals.alertMode) {
            case 0:
                Globals sms = new Globals();
                sms.allZero();
                break;
            case 1:
                Globals.scoutText = true;
                Globals.affirmative = true;
            case 2:
                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(Globals.phoneNumber, null, Globals.SMS, null, null);
                    Toast.makeText(getApplicationContext(), "SMS Sent, backup copy saved", Toast.LENGTH_SHORT).show();
                    Globals.affirmative = true;
                    Globals.textFailed = false;
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "SMS failed, please try again", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                    Globals.affirmative = false;
                    Globals.textFailed = true;
                }
                break;
            case 3:
                Globals.scoutText = false;
                Globals.affirmative = true;
                Globals.textFailed = false;
                finish();
                break;
        }
        finish();
    }
    public void cancel(View view){
        switch(Globals.alertMode) {
            case 1:
            case 2:
            case 3:
                Globals.affirmative = false;
            default:
            break;
        }
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerts);
        TextView text = (TextView) findViewById(R.id.alert);
        Button y = (Button)findViewById(R.id.yes);
        Button n = (Button)findViewById(R.id.no);
        y.setText("YES");
        n.setText("NO");
        switch(Globals.alertMode) {
            case 0:
                text.setText("Clear all data values?");
                break;
            case 1:
                text.setText("Begin sending texts?");
                break;
            case 2:
                text.setText("Send a text containing this matches data to " + Globals.phoneNumber + " ?");
                break;
            case 3:
                text.setText("Opt out of sending texts?\n\n(select yes if using a tablet)");
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_alerts, menu);
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
