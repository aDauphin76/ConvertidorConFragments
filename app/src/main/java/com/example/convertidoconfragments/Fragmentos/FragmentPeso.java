package com.example.convertidoconfragments.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
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
 * Use the {@link FragmentPeso#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentPeso extends Fragment implements View.OnClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    // Inicializo los radioButtons
    private RadioButton rbKGDE, rbGDE, rbMGDE, rbTMDE, rbTIDE, rbLIBRADE,rbOZDE, rbKGA, rbGA, rbMGA, rbTMA,
            rbTIA, rbLIBRAA, rbOZA;

    private View vista;

    public FragmentPeso() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentPeso.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentPeso newInstance(String param1, String param2) {
        FragmentPeso fragment = new FragmentPeso();
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

        vista = inflater.inflate(R.layout.fragment_peso, container, false);
        rbKGDE      = vista.findViewById(R.id.rbKGDE);
        rbGDE       = vista.findViewById(R.id.rbGDE);
        rbMGDE      = vista.findViewById(R.id.rbMGDE);
        rbTMDE      = vista.findViewById(R.id.rbTMDE);
        rbTIDE      = vista.findViewById(R.id.rbTIDE);
        rbLIBRADE   = vista.findViewById(R.id.rbLIBRADE);
        rbOZDE      = vista.findViewById(R.id.rbOZDE);
        rbKGA       = vista.findViewById(R.id.rbKGA);
        rbGA        = vista.findViewById(R.id.rbGA);
        rbMGA       = vista.findViewById(R.id.rbMGA);
        rbTMA       = vista.findViewById(R.id.rbTMA);
        rbTIA       = vista.findViewById(R.id.rbTIA);
        rbLIBRAA    = vista.findViewById(R.id.rbLIBRAA);
        rbOZA       = vista.findViewById(R.id.rbOZA);
        Button bConvertir = vista.findViewById(R.id.bConvertir);

        rbKGDE.setOnClickListener(this);
        rbGDE.setOnClickListener(this);
        rbMGDE.setOnClickListener(this);
        rbTMDE.setOnClickListener(this);
        rbTIDE.setOnClickListener(this);
        rbLIBRADE.setOnClickListener(this);
        rbOZDE.setOnClickListener(this);
        rbKGA.setOnClickListener(this);
        rbGA.setOnClickListener(this);
        rbMGA.setOnClickListener(this);
        rbTMA.setOnClickListener(this);
        rbTIA.setOnClickListener(this);
        rbLIBRAA.setOnClickListener(this);
        rbOZA.setOnClickListener(this);
        bConvertir.setOnClickListener(this);

        return vista;
    }

    private void SelecionadoDE() {

        RadioGroup rgDE = vista.findViewById(R.id.rgDE);
        int intSeleccionadoDeID     = rgDE.getCheckedRadioButtonId();

        habilitarTodos(1);

        // Check which radio button was clicked
        switch(intSeleccionadoDeID) {
            case R.id.rbKGDE:
                rbKGA.setEnabled(false);
                break;

            case R.id.rbGDE:
                rbGA.setEnabled(false);
                break;

            case R.id.rbMGDE:
                rbMGA.setEnabled(false);
                break;

            case R.id.rbTMDE:
                rbTMA.setEnabled(false);
                break;

            case R.id.rbTIDE:
                rbTIA.setEnabled(false);
                break;

            case R.id.rbLIBRADE:
                rbLIBRAA.setEnabled(false);
                break;

            case R.id.rbOZDE:
                rbOZA.setEnabled(false);
                break;
        }
    }

    private void habilitarTodos(int i) {
        if (i == 1) {
            rbKGA.setEnabled(true);
            rbGA.setEnabled(true);
            rbMGA.setEnabled(true);
            rbTMA.setEnabled(true);
            rbTIA.setEnabled(true);
            rbLIBRAA.setEnabled(true);
            rbOZA.setEnabled(true);
        }else{
            rbKGDE.setEnabled(true);
            rbGDE.setEnabled(true);
            rbMGDE.setEnabled(true);
            rbTMDE.setEnabled(true);
            rbTIDE.setEnabled(true);
            rbLIBRADE.setEnabled(true);
            rbOZDE.setEnabled(true);
        }
    }

    private void SelecionadoA() {

        RadioGroup rgA  = vista.findViewById(R.id.rgA);
        int intSeleccionadoAID      = rgA.getCheckedRadioButtonId();


        habilitarTodos(0);

        // Check which radio button was clicked
        switch(intSeleccionadoAID) {

            case R.id.rbKGA:
                rbKGDE.setEnabled(false);
                break;

            case R.id.rbGA:
                rbGDE.setEnabled(false);
                break;

            case R.id.rbMGA:
                rbMGDE.setEnabled(false);
                break;

            case R.id.rbTMA:
                rbTMDE.setEnabled(false);
                break;

            case R.id.rbTIA:
                rbTIDE.setEnabled(false);
                break;

            case R.id.rbLIBRAA:
                rbLIBRADE.setEnabled(false);
                break;

            case R.id.rbOZA:
                rbOZDE.setEnabled(false);
                break;
        }
    }


    private void ConvertirPeso() {
        EditText etEntradaPeso = vista.findViewById(R.id.etEntradaPeso);

        String strEntradaPeso   = etEntradaPeso.getText().toString();
        if(strEntradaPeso.isEmpty()){
            Toast.makeText(getContext(), R.string.valida_valor,
                    Toast.LENGTH_LONG).show();
            return;
        }
        float entradaPesoFLT    = Float.parseFloat(strEntradaPeso);

        RadioGroup rgDE = vista.findViewById(R.id.rgDE);
        int intSeleccionadoDeID     = rgDE.getCheckedRadioButtonId();

        RadioGroup rgA  = vista.findViewById(R.id.rgA);
        int intSeleccionadoAID      = rgA.getCheckedRadioButtonId();

        float intermedioDe;
        switch(intSeleccionadoDeID) {

            case R.id.rbGDE:
                intermedioDe = entradaPesoFLT / 1000;
                break;

            case R.id.rbMGDE:
                intermedioDe = entradaPesoFLT / 1000000;
                break;

            case R.id.rbTMDE:
                intermedioDe = entradaPesoFLT * 1000;
                break;

            case R.id.rbTIDE:
                intermedioDe = entradaPesoFLT * 907.03f;
                break;

            case R.id.rbLIBRADE:
                intermedioDe = entradaPesoFLT / 2.205f;
                break;

            case R.id.rbOZDE:
                intermedioDe = entradaPesoFLT * 0.02835f;
                break;
            default: // KG rbKGDE
                intermedioDe = entradaPesoFLT;
                break;
        }

        float resultadoA;

        switch(intSeleccionadoAID) {

            case R.id.rbGA:
                resultadoA = intermedioDe * 1000;
                break;

            case R.id.rbMGA:
                resultadoA = intermedioDe * 1000000;
                break;

            case R.id.rbTMA:
                resultadoA = intermedioDe / 1000;
                break;

            case R.id.rbTIA:
                resultadoA = intermedioDe / 907.03f;
                break;

            case R.id.rbLIBRAA:
                resultadoA = intermedioDe * 2.205f;
                break;

            case R.id.rbOZA:
                resultadoA = intermedioDe / 0.02835f;
                break;
            default: // KG rbKGA
                resultadoA = intermedioDe;
                break;
        }


        TextView tvResultadoPeso = vista.findViewById(R.id.tvResultadoPeso);
        tvResultadoPeso.setText(String.valueOf(resultadoA));
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bConvertir:
                ConvertirPeso();
                break;
            case R.id.rbKGDE:
            case R.id.rbGDE:
            case R.id.rbMGDE:
            case R.id.rbTMDE:
            case R.id.rbTIDE:
            case R.id.rbLIBRADE:
            case R.id.rbOZDE:
                Log.i("Entro","Entro");
                SelecionadoDE();
                break;
            case R.id.rbKGA:
            case R.id.rbGA:
            case R.id.rbMGA:
            case R.id.rbTMA:
            case R.id.rbTIA:
            case R.id.rbLIBRAA:
            case R.id.rbOZA:
                SelecionadoA();
                break;
        }

    }
}
