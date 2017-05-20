package cs499.project.macbook.homekitchen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.app.FragmentManager;
import android.support.v4.app.FragmentManager;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class ArabicFood extends AppCompatActivity {

    private boolean toggle = true;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic_food);

        Button button = (Button) findViewById(R.id.startButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggle) {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainer, new ArabicFoodMainDish())
                            .commit();
                   /* FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentContainer, new ArabicFoodMainDish());
                    fragmentTransaction.commit();*/
                    toggle = !toggle;
                } else {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragmentContainer, new ArabicFoodDessert())
                            .commit();
                    /*FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragmentContainer, new ArabicFoodDessert());
                    fragmentTransaction.commit();*/
                    toggle = !toggle;
                }
//                Intent intent = new Intent(DetailedActivity.this, MainActivity.class);
//                startActivity(intent);
            }
        });
    }
}
