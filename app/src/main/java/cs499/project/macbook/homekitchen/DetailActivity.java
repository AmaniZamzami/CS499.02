package cs499.project.macbook.homekitchen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    ImageView mImageView;
    ImageView mImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mImageView = (ImageView) findViewById(R.id.imageView2);
        mImageView2 = (ImageView) findViewById(R.id.imageView3);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            mImageView.setImageResource(mBundle.getInt("Food Picture"));
            mImageView2.setImageResource(mBundle.getInt("Food Recipe"));
        }
    }
}