package com.example.restaurantapp.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantapp.R;
import com.example.restaurantapp.adapters.DailyMealAdapter;
import com.example.restaurantapp.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<DailyMealModel> dailyMealModels;
    private DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.daily_meal_fragment, container, false);

        initializeViews(root);
        populateDailyMealData();

        return root;
    }

    private void initializeViews(View root) {
        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();
        dailyMealAdapter = new DailyMealAdapter(getActivity(), dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
    }

    private void populateDailyMealData() {
        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast, "Breakfast", "30% OFF", "Description Description", "breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets, "Sweets", "30% OFF", "Description Description", "sweets"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch, "Lunch", "30% OFF", "Description Description", "lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner, "Dinner", "30% OFF", "Description Description", "dinner"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffe, "Coffee", "30% OFF", "Description Description", "coffee"));

        // Notify the adapter about the changes
        dailyMealAdapter.notifyDataSetChanged();
    }
}
