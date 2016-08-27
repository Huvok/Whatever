package hd.whatever;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

//======================================================================================================================
public class DistanceSelector extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener
{

    //------------------------------------------------------------------------------------------------------------------
    //                                                      //PROPERTIES
    private SeekBar seekBar;
    private TextView textView;

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

        textView.setText("Covered: " + seekBar.getProgress() + "/" + seekBar.getMax());
        seekBar.setOnSeekBarChangeListener(this);
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
}
//======================================================================================================================
