package hd.whatever.Subcategories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hd.whatever.DistanceSelector;
import hd.whatever.R;

//======================================================================================================================
public class ShoppingSubcategory extends AppCompatActivity implements View.OnClickListener
{
    //------------------------------------------------------------------------------------------------------------------
    //                                                      //PROPERTIES
    private Button btnClothing;
    private Button btnElectronics;
    private Button btnMall;
    private Button btnReading;

    //------------------------------------------------------------------------------------------------------------------
    //                                                      //METHODS
    @Override
    protected void onCreate(
        Bundle savedInstanceState
        )
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_subcategory);

        btnClothing = (Button) findViewById(R.id.btnClothing);
        btnElectronics = (Button) findViewById(R.id.btnElectronics);
        btnMall = (Button) findViewById(R.id.btnMall);
        btnReading = (Button) findViewById(R.id.btnReading);

        btnClothing.setOnClickListener(this);
        btnElectronics.setOnClickListener(this);
        btnMall.setOnClickListener(this);
        btnReading.setOnClickListener(this);
    }

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void onClick(
        View view
        )
    {
        if (
            view.getId() == R.id.btnClothing
            )
        {
            Intent intentSubCategory = new Intent(ShoppingSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnElectronics
            )
        {
            Intent intentSubCategory = new Intent(ShoppingSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnMall
            )
        {
            Intent intentSubCategory = new Intent(ShoppingSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
        else if (
            view.getId() == R.id.btnReading
            )
        {
            Intent intentSubCategory = new Intent(ShoppingSubcategory.this, DistanceSelector.class);
            startActivity(intentSubCategory);
        }
    }

    //------------------------------------------------------------------------------------------------------------------
}
//======================================================================================================================
