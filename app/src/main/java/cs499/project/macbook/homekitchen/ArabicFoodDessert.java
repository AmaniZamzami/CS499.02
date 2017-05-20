package cs499.project.macbook.homekitchen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.Nullable;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArabicFoodDessert extends Fragment {


    public ArabicFoodDessert() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_arabic_food_dessert, container, false);
    }

}
