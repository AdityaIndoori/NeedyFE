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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J_Emergency extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ArrayAdapter<String> adapter;
    String[] stringArray = {
            "Please Help, I've been kidnapped",
            "I am suffocating, ambulance required urgently",
            "I am lost, please help me find way",
            "Battery almost out, immediate attention required",
            "Accident has occurred, please come to rescue"
    };
    ListView listView;
    EditText emergencyETV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j__emergency);ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        actionBar.setTitle(getString(R.string.Emergency_ActionBar));
        listView = (ListView)findViewById(R.id.emergencyListView);
        emergencyETV=(EditText)findViewById(R.id.emergencyETV);

        List<String> listArray = new ArrayList<>(Arrays.asList(stringArray));
        adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.emrgency_templates,R.id.emergencyTemplateTV,listArray);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.categories){
            //Do Something
            if ((true)){
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

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String string = listView.getItemAtPosition(i).toString();
        emergencyETV.setText(string, TextView.BufferType.EDITABLE);
    }
}