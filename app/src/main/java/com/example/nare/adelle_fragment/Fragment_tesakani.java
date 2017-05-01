package com.example.nare.adelle_fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Fragment_tesakani extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    List<Itemclass> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tesakani, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        list = new ArrayList<>();

        list.add(new Itemclass(R.drawable.a, "Adelle #1010", "Այս մոդելը բաղկացած է երեք մասից, որոնցից երկուսում ծաղկային կոմպոզիցիաներ են, իսկ կենտրոնում` շվեցարական շոկոլադ (800-1000 գրամ)։", "52000 դրամ"));
        list.add(new Itemclass(R.drawable.b, "Adelle #1020", "Այս ուղղանկյունաձև փայտյա տուփի վրա նախատեսած է գրատախտակ որտեղ կարող եք գրել ձեր ցանկությունը։ Տուփը պարունակում է ծաղկային կոմպոզիցիա և շվեցարական շոկոլադ:", "48000 դրամ"));
        list.add(new Itemclass(R.drawable.c, "Adelle #1021", "Տուփը նմանեցված է արկղի, որը պարունակում է ծաղկային կոմպոզիցիա և շվեցարական շոկոլադ (800-1000 գրամ)։", "49000 դրամ"));
        list.add(new Itemclass(R.drawable.d, "Adelle #1011", "Տուփը բաղկացած է երկու մասից, որոնցից մեկը փակվում է փականով, որտեղ տեղակայված է շվեցարական շոկոլադ (800-1000 գրամ)։ Մյուս հատվածում` հոլանդական Վարդեր։", "63000 դրամ"));
        list.add(new Itemclass(R.drawable.e, "Adelle #2211", "Գլանաձև տուփ, որտեղ ծաղկային կոմպոզիցիան տեղակայված է փականի վրա, իսկ տուփի ներսում շվեցարական շոկոլադ։ (Առկա են տուփի երկու չափս և երեք գույն` սև, սպիտակ, կապույտ):", "36000 դրամ"));
        list.add(new Itemclass(R.drawable.f, "Adelle #1040", "Տուփը բաղկացած է երկու մասից. Վերին մասում գտնվում է ծաղկային կոմպոզիցիան, իսկ ստորին հատվածում նախատեսված է դարակ` համալրված շվեյցարական շոկոլադով:", "86000 դրամ"));
        list.add(new Itemclass(R.drawable.g, "Adelle #1030", "Կոմպոզիցիան ներառում է հոլանդական վարդեր, համալրված է լամպով, որի մեջ հասցեատերը կարող է գտնել ձեր մաղթանքը։ Տուփը մատուցելու համար նախատեսված է հարմարավետ բռնակ։", "64000 դրամ"));
        list.add(new Itemclass(R.drawable.h, "Adelle #1031", "Փոքրիկ արկղ բռնակով։ Պարունակում է ծաղկային կոմպոզիցիա և շվեցարական շոկոլադ (500-700 գրամ)։", "29000 դրամ"));

        adapter = new MyAdapter(list, getActivity());
        recyclerView.setAdapter(adapter);

        return view;
    }
}

