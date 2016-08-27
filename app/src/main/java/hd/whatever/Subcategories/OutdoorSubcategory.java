package hd.whatever.Subcategories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hd.whatever.DistanceSelector;
import hd.whatever.R;

//======================================================================================================================
public class OutdoorSubcategory extends AppCompatActivity implements View.OnClickListener
{
    //------------------------------------------------------------------------------------------------------------------
    //                                                      //PROPERTIES
    private Button btnPark;
    private Button btnNature;

    //------------------------------------------------------------------------------------------------------------------
    //                                                      //METHODS
    @Override
    protected void onCreate(
        Bundle savedInstanceState
        )
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoor_subcategory);

        btnPark = (Button) findViewById(R.id.btnPark);
        btnNature = (Button) findViewById(R.id.btnNature);

        btnPark.setOnClickListener(this);
        btnNature.setOnClickListener(this);
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void onClick(
        View view
        )
    {
        if (
            view.getId() == R.id.btnPark
            )
        {
            Intent intentSubCategory = new Intent(OutdoorSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnNature
            )
        {
            Intent intentSubCategory = new Intent(OutdoorSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
    }
}
