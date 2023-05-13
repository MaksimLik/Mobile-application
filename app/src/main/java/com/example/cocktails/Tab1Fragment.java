package com.example.cocktails;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;

//public class Tab1Fragment extends ListFragment {
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                inflater.getContext(),
//                android.R.layout.simple_list_item_1,
//                getResources().getStringArray(R.array.kategoria1));
//        setListAdapter(adapter);
//        return super.onCreateView(inflater, container, savedInstanceState);
//    }
//}

import android.support.v7.widget.GridLayoutManager;

public class Tab1Fragment extends Fragment {
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
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), CocktailDetailActivity.class);
                intent.putExtra(CocktailDetailActivity.EXTRA_COCKTAIL_ID, position);
                getActivity().startActivity(intent);
            }
        });

        return cocktailRecycler;
    }
}
