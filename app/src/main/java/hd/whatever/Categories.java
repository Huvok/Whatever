package hd.whatever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hd.whatever.Subcategories.CultureSubcategory;
import hd.whatever.Subcategories.EntertainmentSubcategory;
import hd.whatever.Subcategories.FoodSubcategory;
import hd.whatever.Subcategories.OutdoorSubcategory;
import hd.whatever.Subcategories.RestSubcategory;
import hd.whatever.Subcategories.ShoppingSubcategory;

//======================================================================================================================
public class Categories extends AppCompatActivity implements View.OnClickListener
{
    //------------------------------------------------------------------------------------------------------------------
    //                                                      //PROPERTIES
    Button btnFood;
    Button btnOutdoor;
    Button btnEntertainment;
    Button btnShopping;
    Button btnCulture;
    Button btnRest;

    //------------------------------------------------------------------------------------------------------------------
    //                                                      //METHODS
    @Override
    protected void onCreate(
        Bundle savedInstanceState
        )
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        btnFood = (Button) findViewById(R.id.btnFood);
        btnOutdoor = (Button) findViewById(R.id.btnOutdoor);
        btnEntertainment = (Button) findViewById(R.id.btnEntertainment);
        btnShopping = (Button) findViewById(R.id.btnShopping);
        btnCulture = (Button) findViewById(R.id.btnCulture);
        btnRest = (Button) findViewById(R.id.btnRest);

        btnFood.setOnClickListener(this);
        btnOutdoor.setOnClickListener(this);
        btnEntertainment.setOnClickListener(this);
        btnShopping.setOnClickListener(this);
        btnCulture.setOnClickListener(this);
        btnRest.setOnClickListener(this);
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void onClick(
        View view
        )
    {
        if (
            view.getId() == R.id.btnFood
            )
        {
            Intent intentSubCategory = new Intent(Categories.this, FoodSubcategory.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnOutdoor
            )
        {
            Intent intentSubCategory = new Intent(Categories.this, OutdoorSubcategory.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnEntertainment
            )
        {
            Intent intentSubCategory = new Intent(Categories.this, EntertainmentSubcategory.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnShopping
            )
        {
            Intent intentSubCategory = new Intent(Categories.this, ShoppingSubcategory.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnCulture
            )
        {
            Intent intentSubCategory = new Intent(Categories.this, CultureSubcategory.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnRest
            )
        {
            Intent intentSubCategory = new Intent(Categories.this, RestSubcategory.class);
            startActivity(intentSubCategory);
        }
    }

    //------------------------------------------------------------------------------------------------------------------
}
//======================================================================================================================
