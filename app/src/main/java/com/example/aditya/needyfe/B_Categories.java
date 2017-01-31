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

public class B_Categories extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView categoriesListView;
    ArrayAdapter<String> adapter;
    String[] stringArray = {
            "Emergency",
            "H-Mart",
            "C-Baybee",
            "Wheels On Rent",
    };
    Integer[] imageId = {
            R.drawable.emergency,
            R.drawable.hmart,
            R.drawable.cbaybee,
            R.drawable.wheelsonrent
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b__categories);

        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        actionBar.setTitle(getString(R.string.CategoriesActionbar));//
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
            case 0: //DO Something regarding Emergency
                Intent intentJ=new Intent(this,J_Emergency.class);
                startActivity(intentJ);
                break;
            case 1: //DO Something regarding H-Mart
                Intent intentG=new Intent(this,G_H_Mart.class);
                startActivity(intentG);
                break;
            case 2: //DO Something regarding C-Baybee
                Intent intentH=new Intent(this,H_C_Baybee.class);
                startActivity(intentH);
                break;
            case 3: //DO Something regarding Wheels On Rent
                Intent intentI=new Intent(this,I_Wheels_On_Rent.class);
                startActivity(intentI);
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
            if (true) {
                Intent intent = new Intent(this, C_About_us.class);
                startActivity(intent);
            }
            else
                Toast.makeText(this,"Already in the screen",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.our_team){
            //Do Something
            if (true){
                Intent intent = new Intent(this,D_Our_team.class);
                startActivity(intent);
            }
            else
                Toast.makeText(this,"Already in the screen",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.we_hire){
            //DO Something
            if (true) {
                Intent intent = new Intent(this, E_We_Hire.class);
                startActivity(intent);
            }
            else
                Toast.makeText(this,"Already in the screen",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.contact_us){
            //DO something
            if (true){
                Intent intent = new Intent(this,F_Contact_us.class);
                startActivity(intent);
            }
            else
                Toast.makeText(this,"Already in the screen",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
