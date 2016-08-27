package hd.whatever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import hd.whatever.Subcategories.RestSubcategory;

//======================================================================================================================
public class DistanceSelector extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, View.OnClickListener
{

    //------------------------------------------------------------------------------------------------------------------
    //                                                      //PROPERTIES
    private SeekBar seekBar;
    private TextView textView;
    private Button btnAccept;

    private int intProgress = 0;

    //------------------------------------------------------------------------------------------------------------------
    //                                                      //METHODS
    @Override
    protected void onCreate(
        Bundle savedInstanceState
        )
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance_selector);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        textView = (TextView) findViewById(R.id.textView);
        btnAccept = (Button) findViewById(R.id.btnAccept);

        textView.setText("Covered: " + seekBar.getProgress() + "/" + seekBar.getMax());
        seekBar.setOnSeekBarChangeListener(this);
        btnAccept.setOnClickListener(this);
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void onProgressChanged(
        SeekBar seekBar,
        int intProgressValue,
        boolean boolFromUser
        )
    {
        intProgress = intProgressValue;
        textView.setText("Covered: " + seekBar.getProgress() + "/" + seekBar.getMax());
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void onStartTrackingTouch(
        SeekBar seekBar
        )
    {

    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void onStopTrackingTouch(
        SeekBar seekBar
        )
    {

    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void onClick(
        View v
        )
    {
        Intent intentSubCategory = new Intent(DistanceSelector.this, TripMap.class);
        startActivity(intentSubCategory);
    }

    //------------------------------------------------------------------------------------------------------------------
}
//======================================================================================================================
