package com.example.lathe.milemarker;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText etRate;
    private EditText etDestination;

    private Trip trip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etRate = (EditText) findViewById(R.id.rate);
        etDestination = (EditText) findViewById(R.id.destination);

        trip = new Trip();


        //New check parameter that will remove the null pointer exception that is being thrown
        if ((ActivityCompat.checkSelfPermission((Activity) this, android.Manifest.permission.ACCESS_FINE_LOCATION)) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions((Activity) this, new String[]{
                    android.Manifest.permission.ACCESS_FINE_LOCATION
            }, 10);}

    }

    /**
     * Moving and passing the Variable trip to the map activity.
     * This will pass all relevant data to the map class to manage the destination.
     *
     * @param view
     */
    public void moveToMap(View view) {
        getFromDisplay();
        Intent moveToMap = new Intent(this, MapsActivity.class);
        moveToMap.putExtra("trip", this.trip);
        startActivity(moveToMap);
    }

    /**
     * Extracting all information from the display
     *
     * @return
     */
    public Trip getFromDisplay() {

        String DESTINATION = etDestination.getText().toString();
        double RATE = Double.parseDouble(etRate.getText().toString());

        //Adding the trip
        trip.setDestination(DESTINATION);
        trip.setRate(RATE);

        return this.trip;
    }

    private static final String TAG = "MAIN ACTIVITY ==>";
    public void easyLogger(String message){
        Log.d(TAG,message);
    }

}
