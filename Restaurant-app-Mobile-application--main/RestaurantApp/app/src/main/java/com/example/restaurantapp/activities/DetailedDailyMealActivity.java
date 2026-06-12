package com.example.restaurantapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.restaurantapp.R;
import com.example.restaurantapp.adapters.DetailedDailyMealAdapter;
import com.example.restaurantapp.models.DetailedDailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyMealModel> detailedDailyModel;
    DetailedDailyMealAdapter dailyMealAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        imageView = findViewById(R.id.detailed_img);

        recyclerView = findViewById(R.id.detailed_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModel = new ArrayList<>();
        dailyMealAdapter = new DetailedDailyMealAdapter(detailedDailyModel);
        recyclerView.setAdapter(dailyMealAdapter);

        if (type != null && type.equals("breakfast")) {
            detailedDailyModel.add(new DetailedDailyMealModel(R.drawable.fav1, "Breakfast", "description", "4.4", "40", "10am to 9pm"));
            detailedDailyModel.add(new DetailedDailyMealModel(R.drawable.fav2, "Breakfast", "description", "4.4", "40", "10am to 9pm"));
            detailedDailyModel.add(new DetailedDailyMealModel(R.drawable.fav3, "Breakfast", "description", "4.4", "40", "10am to 9pm"));
            dailyMealAdapter.notifyDataSetChanged();
        } else if (type != null && type.equals("sweets")) {
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModel.add(new DetailedDailyMealModel(R.drawable.s1, "Sweets", "description", "4.4", "40", "10am to 9pm"));
            detailedDailyModel.add(new DetailedDailyMealModel(R.drawable.s2, "Sweets", "description", "4.4", "40", "10am to 9pm"));
            detailedDailyModel.add(new DetailedDailyMealModel(R.drawable.s3, "Sweets", "description", "4.4", "40", "10am to 9pm"));
            dailyMealAdapter.notifyDataSetChanged();
        }

        // ... (other code)
    }
}
