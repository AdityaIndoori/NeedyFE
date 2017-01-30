package com.example.aditya.needyfe;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B_Categories extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView categoriesListView;
    ArrayAdapter<String> adapter;
    String[] stringArray = {
            "H-Mart",
            "C-Baybee",
            "Wheels On Rent",
            "Emergency"
    };
    Integer[] imageId = {
            R.drawable.hmart,
            R.drawable.cbaybee,
            R.drawable.wheelsonrent,
            R.drawable.emergency,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b__categories);
        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        actionBar.setTitle(getString(R.string.CategoriesActionbar));
        categoriesListView=(ListView)findViewById(R.id.categoriesListView);

        CustomList adapter = new CustomList(this,stringArray,imageId);
        categoriesListView.setAdapter(adapter);

        categoriesListView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
            case 0: //DO Something regarding H-Mart
                break;
            case 1: //DO Something regarding C-Baybee
                break;
            case 2: //DO Something regarding Wheels On Rent
                break;
            case 3: //DO Something regarding Emergency
                break;
            default: //DO Something
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.categories){
            //Do Something
            if (!(this instanceof B_Categories)){
                Intent intent = new Intent(this,B_Categories.class);
                startActivity(intent);
            }
            else
                Toast.makeText(this,"Already in the screen",Toast.LENGTH_LONG).show();
        }

        else if (id==R.id.about_us){
            //DO Something
        }
        else if (id==R.id.our_team){
            //Do Something
        }
        else if (id==R.id.we_hire){
            //DO Something
        }
        else if (id==R.id.contact_us){
            //DO something
        }
        return super.onOptionsItemSelected(item);
    }
}
