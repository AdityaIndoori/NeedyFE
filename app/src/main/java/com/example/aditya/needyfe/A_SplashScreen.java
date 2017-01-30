package com.example.aditya.needyfe;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.Toast;

import static android.R.attr.left;
import static android.R.attr.right;
import static com.example.aditya.needyfe.R.id.screen;
import static java.math.RoundingMode.UP;

public class A_SplashScreen extends AppCompatActivity {

    ImageView splashScreenImageView;
    float x1,x2;
    float y1, y2;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_splashscreen);

        splashScreenImageView = (ImageView)findViewById(R.id.splash_screen_IV);
        splashScreenImageView.setImageResource(R.drawable.needy_splash_screen);

        intent= new Intent(this,B_Categories.class);

    }

    // onTouchEvent () method gets called when User performs any touch event on screen
    // Method to handle touch event like left to right swap and right to left swap
    public boolean onTouchEvent(MotionEvent touchevent)
    {
        switch (touchevent.getAction())
        {
            // when user first touches the screen we get x and y coordinate
            case MotionEvent.ACTION_DOWN:
            {
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                break;
            }
            case MotionEvent.ACTION_UP:
            {
                x2 = touchevent.getX();
                y2 = touchevent.getY();

                if (y1 > y2){
                    startActivity(intent);
                }
//                //if left to right sweep event on screen
//                if (x1 < x2)
//                {
//                    Toast.makeText(this, "Left to Right Swap Performed", Toast.LENGTH_LONG).show();
//                }
//
//                // if right to left sweep event on screen
//                if (x1 > x2)
//                {
//                    Toast.makeText(this, "Right to Left Swap Performed", Toast.LENGTH_LONG).show();
//                }
//
//                // if UP to Down sweep event on screen
//                if (y1 < y2)
//                {
//                    Toast.makeText(this, "UP to Down Swap Performed", Toast.LENGTH_LONG).show();
//                }
//
//                //if Down to UP sweep event on screen
//                if (y1 > y2)
//                {
//                    Toast.makeText(this, "Down to UP Swap Performed", Toast.LENGTH_LONG).show();
//                }
                break;
            }
        }
        return false;
    }
}
