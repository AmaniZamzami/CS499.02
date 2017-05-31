package cs499.project.macbook.homekitchen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class AmericanFood extends AppCompatActivity {

    ListView mListView;

    String[] foodNames = {"Bourbon Street Buffalo Wings", "Neely's Wet BBQ Ribs", "Grilled Salmon with Sherry Vinegar-Honey Glaze and Spicy Tomato Relish"};
    int[] foodPic = {R.drawable.wings,
            R.drawable.ribs,
            R.drawable.salmon};

    int[] foodRecipe = {R.drawable.american1,
            R.drawable.american2,
            R.drawable.american3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_american_food);

        mListView = (ListView) findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(AmericanFood.this, foodNames, foodPic, foodRecipe);
        mListView.setAdapter(myAdapter);
      /*  mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mIntent = new Intent(AmericanFood.this, DetailActivity.class);
                mIntent.putExtra("Food Picture", foodPic[i]);
                mIntent.putExtra("Food Recipe", foodRecipe[i]);
                startActivity(mIntent);
            }
        });*/

    }

}
