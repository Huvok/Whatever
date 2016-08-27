package hd.whatever.Subcategories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hd.whatever.DistanceSelector;
import hd.whatever.R;

//======================================================================================================================
public class FoodSubcategory extends AppCompatActivity implements View.OnClickListener
{
    //------------------------------------------------------------------------------------------------------------------
    //                                                      //PROPERTIES
    private Button btnChildren;
    private Button btnFoodCourt;
    private Button btnRestaurant;
    private Button btnFastFood;

    //------------------------------------------------------------------------------------------------------------------
    //                                                      //METHODS
    @Override
    protected void onCreate(
        Bundle savedInstanceState
        )
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_subcategory);

        btnChildren = (Button) findViewById(R.id.btnChildren);
        btnFoodCourt = (Button) findViewById(R.id.btnFoodCourt);
        btnRestaurant = (Button) findViewById(R.id.btnRestaurant);
        btnFastFood = (Button) findViewById(R.id.btnFastFood);

        btnChildren.setOnClickListener(this);
        btnFoodCourt.setOnClickListener(this);
        btnRestaurant.setOnClickListener(this);
        btnFastFood.setOnClickListener(this);
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void onClick(
        View view
        )
    {
        if (
            view.getId() == R.id.btnChildren
            )
        {
            Intent intentSubCategory = new Intent(FoodSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnFoodCourt
            )
        {
            Intent intentSubCategory = new Intent(FoodSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnRestaurant
            )
        {
            Intent intentSubCategory = new Intent(FoodSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnFastFood
            )
        {
            Intent intentSubCategory = new Intent(FoodSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
    }
}
