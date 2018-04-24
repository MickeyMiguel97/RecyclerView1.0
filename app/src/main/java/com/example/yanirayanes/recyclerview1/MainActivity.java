package com.example.yanirayanes.recyclerview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    SeriesAdapter adapter;
    ArrayList<Serie> series;
    LinearLayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        series = new ArrayList<>();

        rv = findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);

        prepareSeries();

        adapter = new SeriesAdapter(series, new SeriesAdapter.MyAdapterListener(){
            @Override
            public void toastOnClick(View v, int position){
                Toast.makeText(getApplicationContext(), "Pokémon Legendarios:\n"+series.get(position).getDesc()+"\n"+series.get(position).getCaps(), Toast.LENGTH_SHORT).show();
                }
        });
        rv.setAdapter(adapter);

    }

    public void prepareSeries (){
        String TAG = "Mensaje";
        series = new ArrayList<>();
        series.add(new Serie("Mewtwo Vs Mew", "Año: 1998", R.drawable.pmk0, "- Mew\n- Mewtwo"));
        series.add(new Serie("El poder de uno", "Año: 1999", R.drawable.pmk1, "- Lugia\n- Articuno\n- Zapdos\n - Moltres"));
        series.add(new Serie("El hechizo de los Unown", "Año: 2000", R.drawable.pmk2, "- Entei\n - Unowns"));
        series.add(new Serie("Pokémon 4Ever", "Año: 2001", R.drawable.pmk3, "- Celebi\n - Suicune"));
        series.add(new Serie("Héroes Pokémon", "Año: 2002", R.drawable.pmk4, "- Latias\n - Latios"));
        series.add(new Serie("Jirachi y los deseos", "Año: 2003", R.drawable.pmk5, "- Jirachi\n -Groudon"));
        series.add(new Serie("Destino Deoxys", "Año: 2004", R.drawable.pmk6, "- Rayquaza\n - Deoxys"));
        series.add(new Serie("Lucario y el misterio de Mew", "Año: 2005", R.drawable.pmk7, "- Mew\n - Regirock\n - Regice\n - Registeel"));
        series.add(new Serie("El templo del Mar", "Año: 2006", R.drawable.pmk8, "- Manaphy\n - Kyogre"));
        series.add(new Serie("El desafío de Darkri", "Año: 2007", R.drawable.pmk9, "- Dialga\n - Palkia\n - Darkri"));
        series.add(new Serie("Giratina y el guerrero celestial", "Año: 2008", R.drawable.pmk10, "- Shaymin\n - Giratina\n - Dialga\n - Regigigas"));
        series.add(new Serie("Arceus y la joya de la vida", "Año: 2009", R.drawable.pmk11, "- Arceus\n - Heatran\n - Dialga\n - Palkia\n - Giratina"));
        series.add(new Serie("Zoroark el maestro de ilusiones", "Año: 2010", R.drawable.pmk12, "- Celebi\n - Entei\n - Raikou\n - Suicune"));
        series.add(new Serie("Negro - (Victini) - Blanco ", "Año: 2011", R.drawable.pmk13, "- Vitini\n - Zeckrom\n - Reshiram"));
        series.add(new Serie("Kyurem Vs El espadachín místico", "Año: 2012", R.drawable.pmk14, "- Kyurem\n - Keldeo\n - Cobalion\n - Virizion\n - Terrakion"));
        series.add(new Serie("Genesect y el despertar de una leyenda", "Año: 2013", R.drawable.pmk15, "- Genesect\n - Mewtwo"));
        series.add(new Serie("Diance y la crisálida de la destrucción", "Año: 2014", R.drawable.pmk16, "- Xerneas\n - Yveltal\n - Diance"));
        series.add(new Serie("Hoopa y un duelo histórico", "Año: 2015", R.drawable.pmk17, "- Hoopa\n - Kyurem\n - Lugia\n - Latios\n - Latias\n - Rayquaza\n - Giratina\n - Palkia\n - Dialga\n - Regigigas\n - Kyogre\n - Groudon\n - Arceus\n - Zeckrom\n - Reshiram"));
        series.add(new Serie("Volcanion y la maravilla mecánica", "Año: 2016", R.drawable.pmk18, "- Volcanion\n - Magearna\n - Zygarde"));
        series.add(new Serie("¡Yo te elijo!", "Año: 2017", R.drawable.pmk19, "- Ho-Oh\n - Marshadow\n - Entei\n - Raikou\n - Suicune"));
    }

}
