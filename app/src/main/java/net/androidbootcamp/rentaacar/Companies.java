package net.androidbootcamp.rentaacar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Companies extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_companies);
        String [] rentalCompanies = {"Hertz", "Avis", "Enterprise", "Budget", "Dollar", "Alamo" };
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_companies, R.id.carList, rentalCompanies));
    }


    protected void onListItemClick(ListView l, View v, int position, long id) {

        switch(position){

            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hertz.com/")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.avis.com/en/home")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.enterprise.com/en/home.html")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.budget.com/en/home")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dollar.com/")));
                break;
            case 5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alamo.com/en_US/car-rental/home.html")));
                break;

        }
    }
}
