package hd.whatever.Subcategories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hd.whatever.DistanceSelector;
import hd.whatever.R;

//======================================================================================================================
public class RestSubcategory extends AppCompatActivity implements View.OnClickListener
{
    //------------------------------------------------------------------------------------------------------------------
    //                                                      //PROPERTIES
    private Button btnHotel;
    private Button btnMotel;

    //------------------------------------------------------------------------------------------------------------------
    //                                                      //METHODS
    @Override
    protected void onCreate(
        Bundle savedInstanceState
        )
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_subcategory);

        btnHotel = (Button) findViewById(R.id.btnHotel);
        btnMotel = (Button) findViewById(R.id.btnMotel);

        btnHotel.setOnClickListener(this);
        btnMotel.setOnClickListener(this);
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void onClick(
        View view
        )
    {
        if (
            view.getId() == R.id.btnHotel
            )
        {
            Intent intentSubCategory = new Intent(RestSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnMotel
            )
        {
            Intent intentSubCategory = new Intent(RestSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
    }

    //------------------------------------------------------------------------------------------------------------------
}
//======================================================================================================================
