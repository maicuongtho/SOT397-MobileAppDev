package thomc.LVNangCao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import thomc.LVNangCao.adapters.CountryAdapter;
import thomc.LVNangCao.models.Country;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1
        dsQG= new ArrayList<Country>();
        dsQG.add(new Country("Vietnam",90,"vn"));
        dsQG.add(new Country("Russia",110,"ru"));
        dsQG.add(new Country("United State",80,"us"));

        ListView listView = findViewById(R.id.lvQG);

        CountryAdapter adapter = new CountryAdapter(this, dsQG);
        listView.setAdapter(adapter);



    }
}