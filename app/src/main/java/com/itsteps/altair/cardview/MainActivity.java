package com.itsteps.altair.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CustomAdapter adapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv= (ListView) findViewById(R.id.lv);
        adapter=new CustomAdapter(this,getData());
        lv.setAdapter(adapter);

    }

    private ArrayList getData()
    {
        ArrayList<Spacecraft> spacecrafts=new ArrayList<>();

        Spacecraft s=new Spacecraft();
        s.setName("Pioneer");
        s.setPropellant("Chemical Energy");
        s.setImage(R.drawable.pioneer);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("Spitzer");
        s.setPropellant("Warp Drive");
        s.setImage(R.drawable.spitzer);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("Enterprise");
        s.setPropellant("Anti Matter");
        s.setImage(R.drawable.enterprise);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("Hubble");
        s.setPropellant("Laser Beam");
        s.setImage(R.drawable.herbal);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("Voyager");
        s.setPropellant("Solar Energy");
        s.setImage(R.drawable.voyager);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("Kepler");
        s.setPropellant("Solar Energy");
        s.setImage(R.drawable.kepler);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("Rosetter");
        s.setPropellant("Nuclear Energy");
        s.setImage(R.drawable.rosetta);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("WMAP");
        s.setPropellant("Nuclear Energy");
        s.setImage(R.drawable.wmap);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("Columbia");
        s.setPropellant("Chemical Energy");
        s.setImage(R.drawable.columbia);
        spacecrafts.add(s);

        return spacecrafts;
    }
}
