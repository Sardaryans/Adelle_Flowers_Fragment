package com.example.nare.adelle_fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment_home extends Fragment implements View.OnClickListener {

    TextView btnTesakani, btnInfo, btnkap, btncar;
    FragmentTransaction fragmentTransaction;
    Fragment_tesakani fragment_two;
    Fragment_info fragment_info;
    Fragment_carayutyun fragment_carayutyun;
    Fragment_kap fragment_kap;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btnTesakani = (TextView) view.findViewById(R.id.btntesak);
        btnInfo = (TextView) view.findViewById(R.id.btnmermasin);
        btncar = (TextView) view.findViewById(R.id.btncarayutyun);
        btnkap = (TextView) view.findViewById(R.id.btnkap);

        btnTesakani.setOnClickListener(this);
        btnInfo.setOnClickListener(this);
        btncar.setOnClickListener(this);
        btnkap.setOnClickListener(this);

        fragment_two = new Fragment_tesakani();
        fragment_info = new Fragment_info();
        fragment_carayutyun = new Fragment_carayutyun();
        fragment_kap = new Fragment_kap();

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btntesak:
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame, fragment_two);
                fragmentTransaction.commit();
                break;
            case R.id.btnmermasin:
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame, fragment_info);
                fragmentTransaction.commit();
                break;
            case R.id.btncarayutyun:
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame, fragment_carayutyun);
                fragmentTransaction.commit();
                break;
            case R.id.btnkap:
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame, fragment_kap);
                fragmentTransaction.commit();
                break;
        }
    }
}
