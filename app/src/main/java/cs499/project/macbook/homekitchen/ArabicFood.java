package cs499.project.macbook.homekitchen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ArabicFood extends AppCompatActivity {

    Toolbar mToolbar;
    ListView mListView;

    String[] foodNames = {"SAUDI RICE WITH LAMB AND POTATO", "AL-FAHSA", "CHICKEN MAKLOUBA WITH EGGPLANT"};
    int[] foodPic = {R.drawable.ricechicken,
            R.drawable.alfahsa,
            R.drawable.maqloubah};

    int[] foodRecipe = {R.drawable.arabic1,
            R.drawable.arabic2,
            R.drawable.arabic3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic_food);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        mListView = (ListView) findViewById(R.id.listview);
        MyAdapter myAdapter = new MyAdapter(ArabicFood.this, foodPic, foodRecipe);
        mListView.setAdapter(myAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mIntent = new Intent(ArabicFood.this, DetailActivity.class);
                mIntent.putExtra("Food Name", foodNames[i]);
                mIntent.putExtra("Food Picture", foodPic[i]);
                startActivity(mIntent);
            }
        });

    }

}
