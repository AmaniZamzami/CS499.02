package cs499.project.macbook.homekitchen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MaxicanFood extends AppCompatActivity {

    ListView mListView;

    String[] foodNames = {"Nachos Grande", "Vampire Tacos", "Sunny-Side Chili"};
    int[] foodPic = {R.drawable.nachos,
            R.drawable.tacos,
            R.drawable.chili};

    int[] foodRecipe = {R.drawable.maxican1,
            R.drawable.maxican2,
            R.drawable.maxican3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maxican_food);

        mListView = (ListView) findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(MaxicanFood.this, foodNames, foodPic, foodRecipe);
        mListView.setAdapter(myAdapter);
       /* mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mIntent = new Intent(MaxicanFood.this, DetailActivity.class);
                mIntent.putExtra("Food Picture", foodPic[i]);
                mIntent.putExtra("Food Recipe", foodRecipe[i]);
                startActivity(mIntent);
            }
        });*/
    }
}
