package com.example.convertidoconfragments.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.convertidoconfragments.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentTemperatura#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTemperatura extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    // Inicializo los radioButtons
    private RadioButton
            rbCelsiusDE, rbFahrenheitDE,rbKelvinDE,rbReaumurDE, rbRankineDE,
            rbCelsiusA, rbFahrenheitA,rbKelvinA,rbReaumurA, rbRankineA;

    private View vista;

    public FragmentTemperatura() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTemperatura.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentTemperatura newInstance(String param1, String param2) {
        FragmentTemperatura fragment = new FragmentTemperatura();
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
        vista =inflater.inflate(R.layout.fragment_temperatura, container, false);

        rbCelsiusDE     = vista.findViewById(R.id.rbCelsiusDE);
        rbFahrenheitDE  = vista.findViewById(R.id.rbFahrenheitDE);
        rbKelvinDE      = vista.findViewById(R.id.rbKelvinDE);
        rbReaumurDE     = vista.findViewById(R.id.rbReaumurDE);
        rbRankineDE     = vista.findViewById(R.id.rbRankineDE);
        rbCelsiusA      = vista.findViewById(R.id.rbCelsiusA);
        rbFahrenheitA   = vista.findViewById(R.id.rbFahrenheitA);
        rbKelvinA       = vista.findViewById(R.id.rbKelvinA);
        rbReaumurA      = vista.findViewById(R.id.rbReaumurA);
        rbRankineA      = vista.findViewById(R.id.rbRankineA);

        Button bConvertir = vista.findViewById(R.id.bConvertir);

        rbCelsiusDE.setOnClickListener(this);
        rbFahrenheitDE.setOnClickListener(this);
        rbKelvinDE.setOnClickListener(this);
        rbReaumurDE.setOnClickListener(this);
        rbRankineDE.setOnClickListener(this);
        rbCelsiusA.setOnClickListener(this);
        rbFahrenheitA.setOnClickListener(this);
        rbKelvinA.setOnClickListener(this);
        rbReaumurA.setOnClickListener(this);
        rbRankineA.setOnClickListener(this);
        bConvertir.setOnClickListener(this);

        return vista;
    }

    private void SelecionadoDE() {

        RadioGroup rgDE = vista.findViewById(R.id.rgDE);
        int intSeleccionadoDeID     = rgDE.getCheckedRadioButtonId();

        habilitarTodos(1);

        // Check which radio button was clicked
        switch(intSeleccionadoDeID) {

            case R.id.rbFahrenheitDE:
                rbFahrenheitA.setEnabled(false);
                break;

            case R.id.rbCelsiusDE:
                rbCelsiusA.setEnabled(false);
                break;

            case R.id.rbKelvinDE:
                rbKelvinA.setEnabled(false);
                break;

            case R.id.rbReaumurDE:
                rbReaumurA.setEnabled(false);
                break;

            case R.id.rbRankineDE:
                rbRankineA.setEnabled(false);
                break;

        }
    }

    private void habilitarTodos(int i) {
        if (i == 1) {
            rbCelsiusA.setEnabled(true);
            rbFahrenheitA.setEnabled(true);
            rbKelvinA.setEnabled(true);
            rbReaumurA.setEnabled(true);
            rbRankineA.setEnabled(true);
        }else{
            rbCelsiusDE.setEnabled(true);
            rbFahrenheitDE.setEnabled(true);
            rbKelvinDE.setEnabled(true);
            rbReaumurDE.setEnabled(true);
            rbRankineDE.setEnabled(true);
        }
    }

    private void SelecionadoA() {

        RadioGroup rgA  = vista.findViewById(R.id.rgA);
        int intSeleccionadoAID      = rgA.getCheckedRadioButtonId();


        habilitarTodos(0);

        // Check which radio button was clicked
        switch(intSeleccionadoAID) {
            case R.id.rbCelsiusA:
                rbCelsiusDE.setEnabled(false);
                break;

            case R.id.rbFahrenheitA:
                rbFahrenheitDE.setEnabled(false);
                break;

            case R.id.rbKelvinA:
                rbKelvinDE.setEnabled(false);
                break;

            case R.id.rbReaumurA:
                rbReaumurDE.setEnabled(false);
                break;

            case R.id.rbRankineA:
                rbRankineDE.setEnabled(false);
                break;

        }
    }


    private void ConvertirDistancia() {

        EditText etEntrada = vista.findViewById(R.id.etEntrada);

        String strEntrada = etEntrada.getText().toString();
        if (strEntrada.isEmpty()) {
            Toast.makeText(getContext(), R.string.valida_valor,
                    Toast.LENGTH_LONG).show();
            return;
        }
        float fltEntrada = Float.parseFloat(strEntrada);

        RadioGroup rgDE = vista.findViewById(R.id.rgDE);
        int intSeleccionadoDeID = rgDE.getCheckedRadioButtonId();

        RadioGroup rgA = vista.findViewById(R.id.rgA);
        int intSeleccionadoAID = rgA.getCheckedRadioButtonId();

        float intermedioDe;
        switch (intSeleccionadoDeID) {
            case R.id.rbFahrenheitDE:
                intermedioDe = (fltEntrada-32) /1.8f;
                break;

            case R.id.rbKelvinDE:
                intermedioDe = fltEntrada - 273.15f;
                break;

            case R.id.rbReaumurDE:
                intermedioDe = fltEntrada / .8f;
                break;

            case R.id.rbRankineDE:
                intermedioDe = (fltEntrada-491.67f) /1.8f;
                break;

            default: // KG rbCelsiusDE
                intermedioDe = fltEntrada;
                break;
        }

        float resultadoA;

        switch (intSeleccionadoAID) {
            case R.id.rbFahrenheitA:
                resultadoA = intermedioDe * 1.8f + 32;
                break;

            case R.id.rbKelvinA:
                resultadoA = intermedioDe + 273.15f;
                break;

            case R.id.rbReaumurA:
                resultadoA = intermedioDe * .8f;
                break;

            case R.id.rbRankineA:
                resultadoA = intermedioDe * 1.8f + 491.67f;
                break;

            default: // KG rbCelsiusA
                resultadoA = intermedioDe;
                break;
        }

        TextView tvResultado = vista.findViewById(R.id.tvResultado);
        tvResultado.setText(String.valueOf(resultadoA));

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bConvertir:
                ConvertirDistancia();
                break;
            case R.id.rbCelsiusDE:
            case R.id.rbFahrenheitDE:
            case R.id.rbKelvinDE:
            case R.id.rbReaumurDE:
            case R.id.rbRankineDE:
                SelecionadoDE();
                break;
            case R.id.rbCelsiusA:
            case R.id.rbFahrenheitA:
            case R.id.rbKelvinA:
            case R.id.rbReaumurA:
            case R.id.rbRankineA:
                SelecionadoA();
                break;
        }

    }
}
