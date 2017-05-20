package cs499.project.macbook.homekitchen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;

    public void arabicFood(){

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, ArabicFood.class);
                startActivity(intent);
            }

        });

    }

    public void americanFood(){

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, AmericanFood.class);
                startActivity(intent);
            }

        });

    }

    public void chinessFood(){

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, ChinessFood.class);
                startActivity(intent);
            }

        });

    }

    public void maxicanFood(){

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, MaxicanFood.class);
                startActivity(intent);
            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arabicFood();
        americanFood();
        chinessFood();
        maxicanFood();
    }
}
