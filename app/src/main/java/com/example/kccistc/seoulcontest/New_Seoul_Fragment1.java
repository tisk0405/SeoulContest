package com.example.kccistc.seoulcontest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class New_Seoul_Fragment1 extends Fragment {

    View v;


    public New_Seoul_Fragment1() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup vg, @Nullable Bundle bundle) {
        v = inflater.inflate(R.layout.new_seoul_fragment1, vg, false);

        ListView listView = v.findViewById(R.id.list_view);

        ArrayList<ShopVO> list = new ArrayList<>();

        ShopVO vo1 = new ShopVO(R.drawable.a, "한방왕족발", "도마에 가지런히 담긴 부드러운 족발");
        list.add(vo1);

        ShopVO vo2 = new ShopVO(R.drawable.b, "귀화식당", "제철 생선회와 다양한 요리가 있는 선술집");
        list.add(vo2);

        ShopVO vo3 = new ShopVO(R.drawable.c, "맛순대", "개금골목시장 대표 순대집");
        list.add(vo3);

        ShopVO vo4 = new ShopVO(R.drawable.d, "황산밀면", "밀면의 참맛을 느낄 수 있는 곳");
        list.add(vo4);

        ShopVO vo5 = new ShopVO(R.drawable.e, "무비오빠", "진한 멸치육수와 최고의 술안주가 있는 곳");
        list.add(vo5);

        ListViewAdapter adapter = new ListViewAdapter(this, R.layout.item_new_seoul_fragment1, list);

        listView.setAdapter(adapter);


        return v;

    }


}

