package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class prod_brand1 extends AppCompatActivity {

    ArrayList<Brandmodule> brandModules = new ArrayList<>();


    int[] brandImages = {R.drawable.ic_aderma, R.drawable.ic_aesop, R.drawable.ic_ahc, R.drawable.ic_apivita, R.drawable.ic_aveda,
            R.drawable.ic_aveeno, R.drawable.ic_avene, R.drawable.ic_bioderma, R.drawable.ic_bioneo, R.drawable.ic_biotherm,
            R.drawable.ic_bobbibrown, R.drawable.ic_cerave, R.drawable.ic_cetaphil, R.drawable.ic_clarins, R.drawable.ic_clinique,
            R.drawable.ic_darphin, R.drawable.ic_dermeden, R.drawable.ic_diptyque, R.drawable.ic_df, R.drawable.ic_dprogram, R.drawable.ic_drcink,
            R.drawable.ic_drdouxi, R.drawable.ic_drhsieh, R.drawable.ic_drhuang, R.drawable.ic_drmay, R.drawable.ic_drwu, R.drawable.ic_elemis,
            R.drawable.ic_elixir, R.drawable.ic_elizabetharden, R.drawable.ic_esteelauter, R.drawable.ic_firstaidbeauty, R.drawable.ic_forbelovedone,
            R.drawable.ic_helenarubinstein, R.drawable.ic_ipsa, R.drawable.ic_jomalone, R.drawable.ic_kafen, R.drawable.ic_kanebo, R.drawable.ic_kerastase,
            R.drawable.ic_kiehls, R.drawable.ic_klorane, R.drawable.ic_kose, R.drawable.ic_lamer, R.drawable.ic_lancome, R.drawable.ic_laneige,
            R.drawable.ic_larocheposay, R.drawable.ic_muji, R.drawable.ic_neogence, R.drawable.ic_neutroguna, R.drawable.ic_olay, R.drawable.ic_oright,
            R.drawable.ic_origins, R.drawable.ic_paulaschoice, R.drawable.ic_revital, R.drawable.ic_revive, R.drawable.ic_sebamed, R.drawable.ic_shiseido,
            R.drawable.ic_shuuemera, R.drawable.ic_sisley, R.drawable.ic_skii, R.drawable.ic_sulwhasoo, R.drawable.ic_swissvita, R.drawable.ic_ttm,
            R.drawable.ic_tunemakers, R.drawable.ic_vichy, R.drawable.ic_whoo, R.drawable.ic_ysl, R.drawable.ic_taisuo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prod_brand1);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        setUpBrandModule();

        recyclerViewAdapter adapter = new recyclerViewAdapter(this,brandModules);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setUpBrandModule() {
        String[] brandNames = getResources().getStringArray(R.array.brand);

        for (int i = 0; i < brandNames.length; i++) {
            brandModules.add(new Brandmodule(brandNames[i], brandImages[i]));

        }
    }

}