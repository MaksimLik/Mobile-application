package com.example.cocktails;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.GridLayoutManager;

// we dont need it, this code is for tab1fragment

public class CocktailFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            RecyclerView cocktailRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_tab1, container, false);
            String[] cocktailNames = new String[Cocktail.cocktails.length];
            for (int i = 0; i < cocktailNames.length; i++) {
                cocktailNames[i] = Cocktail.cocktails[i].getName();
            }

            int[] cocktailImages = new int[Cocktail.cocktails.length];

            for (int i = 0; i < cocktailImages.length; i++) {
                cocktailImages[i] = Cocktail.cocktails[i].getImageResourceId();
            }

            CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(cocktailNames, cocktailImages);
            cocktailRecycler.setAdapter(adapter);
            GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
            cocktailRecycler.setLayoutManager(layoutManager);

            return cocktailRecycler;
        }


}