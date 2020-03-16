package com.blab.blab.ui.download;

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

import com.blab.blab.R;

public class DownloadFragment extends Fragment {

    private DownloadViewModel downloadViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        downloadViewModel =
                ViewModelProviders.of(this).get(DownloadViewModel.class);
        View root = inflater.inflate(R.layout.fragment_download, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        downloadViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}