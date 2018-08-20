package com.example.kccistc.seoulcontest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class New_Seoul_Fragment3 extends Fragment {

    View v;

    public New_Seoul_Fragment3() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup vg, @Nullable Bundle bundle) {
        v = inflater.inflate(R.layout.new_seoul_fragment3, vg, false);
        return v;
    }
}
