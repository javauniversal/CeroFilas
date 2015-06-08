package com.appgestor.cerofilas.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.appgestor.cerofilas.Adapters.DemoPagerAdapter;
import com.appgestor.cerofilas.Fragments.FragAcerca;
import com.appgestor.cerofilas.Fragments.FragHistoria;
import com.appgestor.cerofilas.Fragments.FragHome;
import com.appgestor.cerofilas.R;

import me.relex.circleindicator.CircleIndicator;

public class ActMain extends AppCompatActivity implements View.OnClickListener {

    private ViewPager customViewpager;
    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        initiality();
        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {

        // Return to previous page when we press back button
        if (this.customViewpager.getCurrentItem() == 0)
            super.onBackPressed();
        else
            this.customViewpager.setCurrentItem(this.customViewpager.getCurrentItem() - 1);

    }

    public void initiality(){

        // CUSTOM
        customViewpager = (ViewPager) findViewById(R.id.viewpager_custom);
        CircleIndicator customIndicator = (CircleIndicator) findViewById(R.id.indicator_custom);
        DemoPagerAdapter customPagerAdapter = new DemoPagerAdapter(getSupportFragmentManager());
        customPagerAdapter.addFragment(FragHome.newInstance(R.color.color_blanco));
        customPagerAdapter.addFragment(FragAcerca.newInstance(R.color.color_principal));
        customPagerAdapter.addFragment(FragHistoria.newInstance(R.color.color_blanco));


        customViewpager.setAdapter(customPagerAdapter);
        customIndicator.setViewPager(customViewpager);
        customIndicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i2) {

            }
            @Override
            public void onPageSelected(int i) {
                Log.d("OnPageChangeListener", "Current selected = " + i);
            }
            @Override
            public void onPageScrollStateChanged(int i) {}
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnIngresar:
                Intent intent = new Intent(this, ActPrincipal.class);
                startActivity(intent);
                break;
        }
    }
}
