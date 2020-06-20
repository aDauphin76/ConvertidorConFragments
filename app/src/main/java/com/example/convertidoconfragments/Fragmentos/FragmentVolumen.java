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
 * Use the {@link FragmentVolumen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentVolumen extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    // Inicializo los radioButtons
    private RadioButton
            rbLitrosDE, rbCM3DE,rbMililitrosDE, rbGalonesDE, rbPintasDE, rbCucharadasDE, rbTazasDE,
            rbLitrosA, rbCM3A,rbMililitrosA, rbGalonesA, rbPintasA, rbCucharadasA, rbTazasA;

    private View vista;

    public FragmentVolumen() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentVolumen.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentVolumen newInstance(String param1, String param2) {
        FragmentVolumen fragment = new FragmentVolumen();
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

        vista = inflater.inflate(R.layout.fragment_volumen, container, false);

        rbLitrosDE      = vista.findViewById(R.id.rbLitrosDE);
        rbCM3DE         = vista.findViewById(R.id.rbCM3DE);
        rbMililitrosDE  = vista.findViewById(R.id.rbMiliLitrosDE);
        rbGalonesDE     = vista.findViewById(R.id.rbGalonesDE);
        rbPintasDE      = vista.findViewById(R.id.rbPintasDE);
        rbCucharadasDE  = vista.findViewById(R.id.rbCucharadasDE);
        rbTazasDE       = vista.findViewById(R.id.rbTazasDE);
        rbLitrosA       = vista.findViewById(R.id.rbLitrosA);
        rbCM3A          = vista.findViewById(R.id.rbCM3A);
        rbMililitrosA   = vista.findViewById(R.id.rbMiliLitrosA);
        rbGalonesA      = vista.findViewById(R.id.rbGalonesA);
        rbPintasA       = vista.findViewById(R.id.rbPintasA);
        rbCucharadasA   = vista.findViewById(R.id.rbCucharadasA);
        rbTazasA        = vista.findViewById(R.id.rbTazasA);

        Button bConvertir = vista.findViewById(R.id.bConvertir);

        rbLitrosDE.setOnClickListener(this);
        rbCM3DE.setOnClickListener(this);
        rbMililitrosDE.setOnClickListener(this);
        rbGalonesDE.setOnClickListener(this);
        rbPintasDE.setOnClickListener(this);
        rbCucharadasDE.setOnClickListener(this);
        rbTazasDE.setOnClickListener(this);
        rbLitrosA.setOnClickListener(this);
        rbCM3A.setOnClickListener(this);
        rbMililitrosA.setOnClickListener(this);
        rbGalonesA.setOnClickListener(this);
        rbPintasA.setOnClickListener(this);
        rbCucharadasA.setOnClickListener(this);
        rbTazasA.setOnClickListener(this);
        bConvertir.setOnClickListener(this);

        return vista;
    }

    private void SelecionadoDE() {

        RadioGroup rgDE = vista.findViewById(R.id.rgDE);
        int intSeleccionadoDeID     = rgDE.getCheckedRadioButtonId();

        habilitarTodos(1);

        // Check which radio button was clicked
        switch(intSeleccionadoDeID) {
            case R.id.rbLitrosDE:
                rbLitrosA.setEnabled(false);
                break;

            case R.id.rbCM3DE:
                rbCM3A.setEnabled(false);
                break;

            case R.id.rbMiliLitrosDE:
                rbMililitrosA.setEnabled(false);
                break;

            case R.id.rbGalonesDE:
                rbGalonesA.setEnabled(false);
                break;

            case R.id.rbPintasDE:
                rbPintasA.setEnabled(false);
                break;

            case R.id.rbCucharadasDE:
                rbCucharadasA.setEnabled(false);
                break;

            case R.id.rbTazasDE:
                rbTazasA.setEnabled(false);
                break;
        }
    }

    private void habilitarTodos(int i) {
        if (i == 1) {
            rbLitrosA.setEnabled(true);
            rbCM3A.setEnabled(true);
            rbMililitrosA.setEnabled(true);
            rbGalonesA.setEnabled(true);
            rbPintasA.setEnabled(true);
            rbCucharadasA.setEnabled(true);
            rbTazasA.setEnabled(true);
        }else{
            rbLitrosDE.setEnabled(true);
            rbCM3DE.setEnabled(true);
            rbMililitrosDE.setEnabled(true);
            rbGalonesDE.setEnabled(true);
            rbPintasDE.setEnabled(true);
            rbCucharadasDE.setEnabled(true);
            rbTazasDE.setEnabled(true);
        }
    }

    private void SelecionadoA() {

        RadioGroup rgA  = vista.findViewById(R.id.rgA);
        int intSeleccionadoAID      = rgA.getCheckedRadioButtonId();


        habilitarTodos(0);

        // Check which radio button was clicked
        switch(intSeleccionadoAID) {

            case R.id.rbLitrosA:
                rbLitrosDE.setEnabled(false);
                break;

            case R.id.rbCM3A:
                rbCM3DE.setEnabled(false);
                break;

            case R.id.rbMiliLitrosA:
                rbMililitrosDE.setEnabled(false);
                break;

            case R.id.rbGalonesA:
                rbGalonesDE.setEnabled(false);
                break;

            case R.id.rbPintasA:
                rbPintasDE.setEnabled(false);
                break;

            case R.id.rbCucharadasA:
                rbCucharadasDE.setEnabled(false);
                break;

            case R.id.rbTazasA:
                rbTazasDE.setEnabled(false);
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
            case R.id.rbCM3DE:
            case R.id.rbMiliLitrosDE:
                intermedioDe = fltEntrada / 1000;
                break;

            case R.id.rbGalonesDE:
                intermedioDe = fltEntrada / 0.264172f;
                break;

            case R.id.rbPintasDE:
                intermedioDe = fltEntrada / 2.1134f;
                break;

            case R.id.rbCucharadasDE:
                intermedioDe = fltEntrada / 66.6667f;
                break;

            case R.id.rbTazasDE:
                intermedioDe = fltEntrada / 4.2268f;
                break;

            default: // KG rbLitrosDE
                intermedioDe = fltEntrada;
                break;
        }

        float resultadoA;

        switch (intSeleccionadoAID) {
            case R.id.rbCM3A:
            case R.id.rbMiliLitrosA:
                resultadoA = intermedioDe * 1000;
                break;

            case R.id.rbGalonesA:
                resultadoA = intermedioDe * 0.264172f;
                break;

            case R.id.rbPintasA:
                resultadoA = intermedioDe * 2.1134f;
                break;

            case R.id.rbCucharadasA:
                resultadoA = intermedioDe * 66.6667f;
                break;

            case R.id.rbTazasA:
                resultadoA = intermedioDe * 4.2268f;
                break;
            default: // KG rbLitrosA
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
            case R.id.rbLitrosDE:
            case R.id.rbCM3DE:
            case R.id.rbMiliLitrosDE:
            case R.id.rbGalonesDE:
            case R.id.rbPintasDE:
            case R.id.rbCucharadasDE:
            case R.id.rbTazasDE:
                SelecionadoDE();
                break;
            case R.id.rbLitrosA:
            case R.id.rbCM3A:
            case R.id.rbMiliLitrosA:
            case R.id.rbGalonesA:
            case R.id.rbPintasA:
            case R.id.rbCucharadasA:
            case R.id.rbTazasA:
                SelecionadoA();
                break;
        }

    }
}
