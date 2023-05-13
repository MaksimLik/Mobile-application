package com.example.cocktails;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CocktailDetailActivity2 extends AppCompatActivity {
    public static final String EXTRA_COCKTAIL_ID = "cocktailId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail_detail);

        // Ustawiamy pasek narzędzi jako pasek aplikacji aktywności
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Wyświetlamy informacje o koktajlu
        int cocktailId = (Integer)getIntent().getExtras().get(EXTRA_COCKTAIL_ID);
        String cocktailName = Cocktail2.cocktails[cocktailId].getName();
        TextView textView = (TextView)findViewById(R.id.cocktail_text);
        textView.setText(cocktailName);

        int cocktailImage = Cocktail2.cocktails[cocktailId].getImageResourceId();
        ImageView imageView = (ImageView)findViewById(R.id.cocktail_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, cocktailImage));
        imageView.setContentDescription(cocktailName);

        String cocktailRecipe = Cocktail2.cocktails[cocktailId].getRecipe();
        TextView TextDescription = (TextView)findViewById(R.id.textDescription);
        TextDescription.setText(cocktailRecipe);


        Fragment fragment = new StoperFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.stoper_container, fragment);
        ft.commit();

    }


    public void onClickDone(View view) {
        int cocktailId = (Integer)getIntent().getExtras().get(EXTRA_COCKTAIL_ID);
        String cocktailRecipe = Cocktail2.cocktails[cocktailId].getRecipe();
//        TextView TextDescription = (TextView)findViewById(R.id.textDescription);
//
//        CharSequence text = cocktailRecipe;
//        int duration = Snackbar.LENGTH_SHORT;
//        Snackbar snackbar = Snackbar.make(view, text, duration);
//        snackbar.setAction("Cofnij", new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast toast = Toast.makeText(CocktailDetailActivity2.this, "Cofnięto!", Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });
//        snackbar.show();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Wybierz aplikację");
        builder.setItems(new CharSequence[]{"Telegram", "Facebook", "Gmail"}, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        // Send the data to Telegram
                        Intent telegramIntent = new Intent(Intent.ACTION_SEND);
                        telegramIntent.setType("text/plain");
                        telegramIntent.putExtra(Intent.EXTRA_TEXT, cocktailRecipe);
                        telegramIntent.setPackage("org.telegram.messenger");
                        startActivity(telegramIntent);
                        break;
                    case 1:
                        // Send the data to Facebook
                        Intent facebookIntent = new Intent(Intent.ACTION_SEND);
                        facebookIntent.setType("text/plain");
                        facebookIntent.putExtra(Intent.EXTRA_TEXT, cocktailRecipe);
                        facebookIntent.setPackage("com.facebook.katana");
                        startActivity(facebookIntent);
                        break;
                    case 2:
                        // Send the data to Gmail
                        Intent gmailIntent = new Intent(Intent.ACTION_SEND);
                        gmailIntent.setType("text/plain");
                        gmailIntent.putExtra(Intent.EXTRA_TEXT, cocktailRecipe);
                        gmailIntent.setPackage("com.google.android.gm");
                        startActivity(gmailIntent);
                        break;
                }
            }
        });
        builder.show();
    }
}




