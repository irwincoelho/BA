package com.hfad.beeradviser;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;


public class FindBeerActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    //Call when user clicks the button
    public void onClickFindBeer(V        android:id="@+id/find_beer"
iew view){
        TextView brands=(TextView) findViewById(R.id.brands);
        Spinner color=(Spinner) findViewById(R.id.color);
        String beerType=String.valueOf(color.getSelectedItem());
        brands.setText(beerType);

    }
}
