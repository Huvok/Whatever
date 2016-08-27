package hd.whatever.Subcategories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hd.whatever.DistanceSelector;
import hd.whatever.R;

//======================================================================================================================
public class EntertainmentSubcategory extends AppCompatActivity implements View.OnClickListener
{
    //------------------------------------------------------------------------------------------------------------------
    //                                                      //PROPERTIES
    private Button btnMovies;
    private Button btnBowling;
    private Button btnClubs;
    private Button btnPlayZones;

    //------------------------------------------------------------------------------------------------------------------
    //                                                      //METHODS
    @Override
    protected void onCreate(
        Bundle savedInstanceState
        )
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_subcategory);

        btnMovies = (Button) findViewById(R.id.btnMovies);
        btnBowling = (Button) findViewById(R.id.btnBowling);
        btnClubs = (Button) findViewById(R.id.btnClubs);
        btnPlayZones = (Button) findViewById(R.id.btnPlayZones);

        btnMovies.setOnClickListener(this);
        btnBowling.setOnClickListener(this);
        btnClubs.setOnClickListener(this);
        btnPlayZones.setOnClickListener(this);
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void onClick(
        View view
        )
    {
        if (
            view.getId() == R.id.btnMovies
            )
        {
            Intent intentSubCategory = new Intent(EntertainmentSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnBowling
            )
        {
            Intent intentSubCategory = new Intent(EntertainmentSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnClubs
            )
        {
            Intent intentSubCategory = new Intent(EntertainmentSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnPlayZones
            )
        {
            Intent intentSubCategory = new Intent(EntertainmentSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
    }

    //------------------------------------------------------------------------------------------------------------------
}
//======================================================================================================================
