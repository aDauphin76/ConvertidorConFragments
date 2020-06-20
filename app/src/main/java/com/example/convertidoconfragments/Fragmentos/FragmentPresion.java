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
 * Use the {@link FragmentPresion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentPresion extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    // Inicializo los radioButtons
    private RadioButton
            rbPascalDE, rbBarDE, rbKiloPascalDE, rbMegaPascalDE, rbPSIDE, rbKGFDE, rbInHgDE,rbATMDE,
            rbPascalA, rbBarA, rbKiloPascalA, rbMegaPascalA, rbPSIA, rbKGFA, rbInHgA,rbATMA;

    private View vista;

    public FragmentPresion() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentPresion.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentPresion newInstance(String param1, String param2) {
        FragmentPresion fragment = new FragmentPresion();
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
        vista = inflater.inflate(R.layout.fragment_presion, container, false);


        rbPascalDE      = vista.findViewById(R.id.rbPascalDE);
        rbBarDE         = vista.findViewById(R.id.rbBarDE);
        rbKiloPascalDE  = vista.findViewById(R.id.rbKiloPascalDE);
        rbMegaPascalDE  = vista.findViewById(R.id.rbMegaPascalDE);
        rbPSIDE         = vista.findViewById(R.id.rbPSIDE);
        rbKGFDE         = vista.findViewById(R.id.rbKGFDE);
        rbInHgDE        = vista.findViewById(R.id.rbInHgDE);
        rbATMDE         = vista.findViewById(R.id.rbATMDE);

        rbPascalA      = vista.findViewById(R.id.rbPascalA);
        rbBarA         = vista.findViewById(R.id.rbBarA);
        rbKiloPascalA  = vista.findViewById(R.id.rbKiloPascalA);
        rbMegaPascalA  = vista.findViewById(R.id.rbMegaPascalA);
        rbPSIA         = vista.findViewById(R.id.rbPSIA);
        rbKGFA         = vista.findViewById(R.id.rbKGFA);
        rbInHgA        = vista.findViewById(R.id.rbInHgA);
        rbATMA         = vista.findViewById(R.id.rbATMA);

        Button bConvertir = vista.findViewById(R.id.bConvertir);

        rbPascalDE.setOnClickListener(this);
        rbBarDE.setOnClickListener(this);
        rbKiloPascalDE.setOnClickListener(this);
        rbMegaPascalDE.setOnClickListener(this);
        rbPSIDE.setOnClickListener(this);
        rbKGFDE.setOnClickListener(this);
        rbInHgDE.setOnClickListener(this);
        rbATMDE.setOnClickListener(this);

        rbPascalA.setOnClickListener(this);
        rbBarA.setOnClickListener(this);
        rbKiloPascalA.setOnClickListener(this);
        rbMegaPascalA.setOnClickListener(this);
        rbPSIA.setOnClickListener(this);
        rbKGFA.setOnClickListener(this);
        rbInHgA.setOnClickListener(this);
        rbATMA.setOnClickListener(this);

        bConvertir.setOnClickListener(this);

        return vista;
    }

    private void SelecionadoDE() {

        RadioGroup rgDE = vista.findViewById(R.id.rgDE);
        int intSeleccionadoDeID     = rgDE.getCheckedRadioButtonId();

        habilitarTodos(1);

        // Check which radio button was clicked
        switch(intSeleccionadoDeID) {
            case R.id.rbPascalDE:
                rbPascalA.setEnabled(false);
                break;

            case R.id.rbBarDE:
                rbBarA.setEnabled(false);
                break;

            case R.id.rbKiloPascalDE:
                rbKiloPascalA.setEnabled(false);
                break;

            case R.id.rbMegaPascalDE:
                rbMegaPascalA.setEnabled(false);
                break;

            case R.id.rbPSIDE:
                rbPSIA.setEnabled(false);
                break;

            case R.id.rbKGFDE:
                rbKGFA.setEnabled(false);
                break;

            case R.id.rbInHgDE:
                rbInHgA.setEnabled(false);
                break;

            case R.id.rbATMDE:
                rbATMA.setEnabled(false);
                break;
        }
    }

    private void habilitarTodos(int i) {
        if (i == 1) {
            rbPascalA.setEnabled(true);
            rbBarA.setEnabled(true);
            rbKiloPascalA.setEnabled(true);
            rbMegaPascalA.setEnabled(true);
            rbPSIA.setEnabled(true);
            rbKGFA.setEnabled(true);
            rbInHgA.setEnabled(true);
            rbATMA.setEnabled(true);
        }else{
            rbPascalDE.setEnabled(true);
            rbBarDE.setEnabled(true);
            rbKiloPascalDE.setEnabled(true);
            rbMegaPascalDE.setEnabled(true);
            rbPSIDE.setEnabled(true);
            rbKGFDE.setEnabled(true);
            rbInHgDE.setEnabled(true);
            rbATMDE.setEnabled(true);
        }
    }

    private void SelecionadoA() {

        RadioGroup rgA  = vista.findViewById(R.id.rgA);
        int intSeleccionadoAID      = rgA.getCheckedRadioButtonId();

        habilitarTodos(0);

        // Check which radio button was clicked
        switch(intSeleccionadoAID) {

            case R.id.rbPascalA:
                rbPascalDE.setEnabled(false);
                break;

            case R.id.rbBarA:
                rbBarDE.setEnabled(false);
                break;

            case R.id.rbKiloPascalA:
                rbKiloPascalDE.setEnabled(false);
                break;

            case R.id.rbMegaPascalA:
                rbMegaPascalDE.setEnabled(false);
                break;

            case R.id.rbPSIA:
                rbPSIDE.setEnabled(false);
                break;

            case R.id.rbKGFA:
                rbKGFDE.setEnabled(false);
                break;

            case R.id.rbInHgA:
                rbInHgDE.setEnabled(false);
                break;

            case R.id.rbATMA:
                rbATMDE.setEnabled(false);
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
            case R.id.rbBarDE:
                intermedioDe = fltEntrada * 100000;
                break;

            case R.id.rbKiloPascalDE:
                intermedioDe = fltEntrada * 1000;
                break;

            case R.id.rbMegaPascalDE:
                intermedioDe = fltEntrada * 1000000f;
                break;

            case R.id.rbPSIDE:
                intermedioDe = fltEntrada * 6894.76f;
                break;

            case R.id.rbKGFDE:
                intermedioDe = fltEntrada * 98066.52f;
                break;

            case R.id.rbInHgDE:
                intermedioDe = fltEntrada * 3386.38f;
                break;

            case R.id.rbATMDE:
                intermedioDe = fltEntrada * 101325;
                break;

            default: // KG rbPascalDE
                intermedioDe = fltEntrada;
                break;
        }

        float resultadoA;

        switch (intSeleccionadoAID) {
            case R.id.rbBarA:
                resultadoA = intermedioDe / 100000;
                break;

            case R.id.rbKiloPascalA:
                resultadoA = intermedioDe / 1000;
                break;

            case R.id.rbMegaPascalA:
                resultadoA = intermedioDe / 1000000;
                break;

            case R.id.rbPSIA:
                resultadoA = intermedioDe / 6894.76f;
                break;

            case R.id.rbKGFA:
                resultadoA = intermedioDe / 98066.52f;
                break;

            case R.id.rbInHgA:
                resultadoA = intermedioDe / 3386.38f;
                break;

            case R.id.rbATMA:
                resultadoA = intermedioDe / 101325;
                break;

            default: // KG rbPascalA
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
            case R.id.rbPascalDE:
            case R.id.rbBarDE:
            case R.id.rbKiloPascalDE:
            case R.id.rbMegaPascalDE:
            case R.id.rbPSIDE:
            case R.id.rbKGFDE:
            case R.id.rbInHgDE:
            case R.id.rbATMDE:
                SelecionadoDE();
                break;
            case R.id.rbPascalA:
            case R.id.rbBarA:
            case R.id.rbKiloPascalA:
            case R.id.rbMegaPascalA:
            case R.id.rbPSIA:
            case R.id.rbKGFA:
            case R.id.rbInHgA:
            case R.id.rbATMA:
                SelecionadoA();
                break;
        }

    }
}
