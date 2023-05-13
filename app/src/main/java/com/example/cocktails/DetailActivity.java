package com.example.cocktails;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android. content.Intent;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_COCKTAIL_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        CocktailDetailFragment frag = (CocktailDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);

        int coctailId = (int) getIntent().getExtras().get(EXTRA_COCKTAIL_ID);
        frag.setCocktail(coctailId);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Przygotowanie menu i dodanie elementów do paska aplikacji
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action_create_order
            case R.id.action_action:
                // Kod wykonywany po kliknięciu elementu Action_Activity
                Intent intent = new Intent(this, ActionActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}