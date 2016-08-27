package hd.whatever.Subcategories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hd.whatever.DistanceSelector;
import hd.whatever.R;

//======================================================================================================================
public class CultureSubcategory extends AppCompatActivity implements View.OnClickListener
{
    //------------------------------------------------------------------------------------------------------------------
    //                                                      //PROPERTIES
    private Button btnMuseum;
    private Button btnTouristicPlaces;

    //------------------------------------------------------------------------------------------------------------------
    //                                                      //METHODS
    @Override
    protected void onCreate(
        Bundle savedInstanceState
        )
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture_subcategory);

        btnMuseum = (Button) findViewById(R.id.btnMuseum);
        btnTouristicPlaces = (Button) findViewById(R.id.btnTouristicPlaces);

        btnMuseum.setOnClickListener(this);
        btnTouristicPlaces.setOnClickListener(this);
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void onClick(
        View view
        )
    {
        if (
            view.getId() == R.id.btnMuseum
            )
        {
            Intent intentSubCategory = new Intent(CultureSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnTouristicPlaces
            )
        {
            Intent intentSubCategory = new Intent(CultureSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
    }
}
