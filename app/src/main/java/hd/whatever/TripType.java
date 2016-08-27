package hd.whatever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//======================================================================================================================
public class TripType extends AppCompatActivity implements View.OnClickListener
{
    //------------------------------------------------------------------------------------------------------------------
    //                                                      //PROPERTIES
    Button btnFullTrip;
    Button btnSingleTrip;

    //------------------------------------------------------------------------------------------------------------------
    //                                                      //METHODS
    @Override
    protected void onCreate(
        Bundle savedInstanceState
        )
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_type);

        btnFullTrip = (Button) findViewById(R.id.btnFullTrip);
        btnSingleTrip = (Button) findViewById(R.id.btnSingleTrip);

        btnFullTrip.setOnClickListener(this);
        btnSingleTrip.setOnClickListener(this);
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void onClick(
        View view
        )
    {
        if (
            view.getId() == R.id.btnFullTrip
            )
        {
            Intent intentCategories = new Intent(TripType.this, Categories.class);
            startActivity(intentCategories);
        }
        else if (
            view.getId() == R.id.btnSingleTrip
            )
        {
            Intent intentCategories = new Intent(TripType.this, Categories.class);
            startActivity(intentCategories);
        }
    }
}
