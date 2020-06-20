package com.example.convertidoconfragments.Fragmentos;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.convertidoconfragments.Adaptadores.AdaptadorCocina;
import com.example.convertidoconfragments.Interfaces.IComunicaFragments;
import com.example.convertidoconfragments.MedidaCocina;
import com.example.convertidoconfragments.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentCocina#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCocina extends Fragment  {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private View vista;

    ArrayList<MedidaCocina> listaCocina;
    RecyclerView recyclerCocina;

    Activity activity;
    IComunicaFragments interfaceComunicaFragments;

    public FragmentCocina() {
        // Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentCocina.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentCocina newInstance(String param1, String param2) {
        FragmentCocina fragment = new FragmentCocina();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        vista = inflater.inflate(R.layout.fragment_cocina, container, false);


        listaCocina = new ArrayList<>();
        recyclerCocina = vista.findViewById(R.id.recyclerCocinaLista);
        recyclerCocina.setLayoutManager(new LinearLayoutManager(getContext()));


        listaCocina.add(new MedidaCocina("Harina", "140g", "70g", "35g", R.drawable.flour));
        listaCocina.add(new MedidaCocina("Azucar", "200g", "100g", "50g",R.drawable.sugar));

        AdaptadorCocina adaptadorCocina = new AdaptadorCocina(listaCocina);
        recyclerCocina.setAdapter(adaptadorCocina);

        adaptadorCocina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaceComunicaFragments.enviarMedidaCocina(listaCocina.get(recyclerCocina.getChildAdapterPosition(v)));
            }
        });

        return vista;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof Activity) {
            this.activity = (Activity) context;
            interfaceComunicaFragments = (IComunicaFragments) this.activity;

        }
    }
}

