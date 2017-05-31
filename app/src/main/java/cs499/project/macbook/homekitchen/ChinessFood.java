package cs499.project.macbook.homekitchen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ChinessFood extends AppCompatActivity {

    ListView mListView;

    String[] foodNames = {"Fried Rice", "Kung Pao Chicken", "Shrimp Lo Mein"};
    int[] foodPic = {R.drawable.rice,
            R.drawable.kungpao,
            R.drawable.shrimp};

    int[] foodRecipe = {R.drawable.chiness1,
            R.drawable.chiness2,
            R.drawable.chiness3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiness_food);

        mListView = (ListView) findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(ChinessFood.this, foodNames, foodPic, foodRecipe);
        mListView.setAdapter(myAdapter);
      /*  mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mIntent = new Intent(ChinessFood.this, DetailActivity.class);
                mIntent.putExtra("Food Picture", foodPic[i]);
                mIntent.putExtra("Food Recipe", foodRecipe[i]);
                startActivity(mIntent);
            }
        });*/
    }
}
