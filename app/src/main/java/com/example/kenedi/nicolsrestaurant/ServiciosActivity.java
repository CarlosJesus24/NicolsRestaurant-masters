package com.example.kenedi.nicolsrestaurant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiciosActivity extends AppCompatActivity {

    private Button next;
    private String[] imagenurls = new String[] {
            "http://www.difver.gob.mx/wp-content/uploads/2015/01/41.png",
            "http://www.deli-diet.com/wp-content/uploads/plate.png",
            "https://images.vexels.com/media/users/3/127555/isolated/preview/8f6b4e3941b468ff8a834142eeec1389-delivery-man-on-motorbike-by-vexels.png"
    };
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        next=findViewById(R.id.btnsiguiente);
        
        ViewPager viewPager = findViewById(R.id.ViewServicios);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, imagenurls);
        viewPager.setAdapter(adapter);
    }

    public void Siguiente(View view){
        Intent intent = new Intent(ServiciosActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
