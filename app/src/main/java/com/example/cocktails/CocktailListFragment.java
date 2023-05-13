package com.example.cocktails;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;




public class CocktailListFragment extends ListFragment {

    static interface Listener {
        void itemClicked(long id);
    };
    private Listener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedinstanceState) {
        String[] names = new String[Cocktail.cocktails.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Cocktail.cocktails[i].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter <> (
                inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedinstanceState);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener)context;
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
}

