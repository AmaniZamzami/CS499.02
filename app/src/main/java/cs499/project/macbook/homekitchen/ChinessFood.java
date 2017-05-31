package cs499.project.macbook.homekitchen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.support.v7.widget.Toolbar;

public class ChinessFood extends AppCompatActivity {

    Toolbar mToolbar;
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

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));

        mListView = (ListView) findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(ChinessFood.this, foodPic, foodRecipe);
        mListView.setAdapter(myAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mIntent = new Intent(ChinessFood.this, DetailActivity.class);
                mIntent.putExtra("Food Name", foodNames[i]);
                mIntent.putExtra("Food Picture", foodPic[i]);
                startActivity(mIntent);
            }
        });
    }
}
