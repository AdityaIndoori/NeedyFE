package com.example.aditya.needyfe;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class H_C_Baybee extends AppCompatActivity implements View.OnClickListener {

    Button submitBtn;
    EditText username_ET,password_ET;
    String username=null,password=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h__c__baybee);
        submitBtn=(Button)findViewById(R.id.g_c_baybee_submit_btn);
        username_ET=(EditText)findViewById(R.id.g_c_baybee_username_ET);
        password_ET=(EditText)findViewById(R.id.g_c_baybee_password_ET);
        submitBtn.setOnClickListener(this);

        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        actionBar.setTitle(getString(R.string.C_BaybeeActionBar));
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.g_c_baybee_submit_btn){
            username=username_ET.getText().toString();
            password=password_ET.getText().toString();
            if (username.length()<1){
                Toast.makeText(getApplicationContext(),"Enter a valid ID",Toast.LENGTH_LONG).show();
            }
            if (password.length()<1){
                Toast.makeText(getApplicationContext(),"Invalid password",Toast.LENGTH_LONG).show();

            }
        }
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
}
