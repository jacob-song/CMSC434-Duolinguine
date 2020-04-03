package com.example.duolinguine.ui.rewards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.duolinguine.R;

public class RewardsFragment extends Fragment {

    private RewardsViewModel rewardsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rewardsViewModel =
                ViewModelProviders.of(this).get(RewardsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_rewards, container, false);
        final TextView textView = root.findViewById(R.id.text_rewards);
        rewardsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
