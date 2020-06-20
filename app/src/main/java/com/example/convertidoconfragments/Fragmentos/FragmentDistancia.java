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
 * Use the {@link FragmentDistancia#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentDistancia extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    // Inicializo los radioButtons
    private RadioButton rbKMDE, rbMDE,rbCMDE, rbMillasDE, rbPiesDE, rbPulgadasDE, rbYardasDE,
                        rbKMA, rbMA,rbCMA, rbMillasA, rbPiesA, rbPulgadasA, rbYardasA;

    private View vista;

    public FragmentDistancia() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentDistancia.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentDistancia newInstance(String param1, String param2) {
        FragmentDistancia fragment = new FragmentDistancia();
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

        vista = inflater.inflate(R.layout.fragment_distancia, container, false);

        rbKMDE          = vista.findViewById(R.id.rbKMDE);
        rbMDE           = vista.findViewById(R.id.rbMDE);
        rbCMDE          = vista.findViewById(R.id.rbCMDE);
        rbMillasDE      = vista.findViewById(R.id.rbMillasDE);
        rbPiesDE        = vista.findViewById(R.id.rbPiesDE);
        rbPulgadasDE    = vista.findViewById(R.id.rbPulgadasDE);
        rbYardasDE      = vista.findViewById(R.id.rbYardasDE);
        rbKMA           = vista.findViewById(R.id.rbKMA);
        rbMA            = vista.findViewById(R.id.rbMA);
        rbCMA           = vista.findViewById(R.id.rbCMA);
        rbMillasA       = vista.findViewById(R.id.rbMillasA);
        rbPiesA         = vista.findViewById(R.id.rbPiesA);
        rbPulgadasA     = vista.findViewById(R.id.rbPulgadasA);
        rbYardasA       = vista.findViewById(R.id.rbYardasA);
        Button bConvertir = vista.findViewById(R.id.bConvertir);

        rbKMDE.setOnClickListener(this);
        rbMDE.setOnClickListener(this);
        rbCMDE.setOnClickListener(this);
        rbMillasDE.setOnClickListener(this);
        rbPiesDE.setOnClickListener(this);
        rbPulgadasDE.setOnClickListener(this);
        rbYardasDE.setOnClickListener(this);
        rbKMA.setOnClickListener(this);
        rbMA.setOnClickListener(this);
        rbCMA.setOnClickListener(this);
        rbMillasA.setOnClickListener(this);
        rbPiesA.setOnClickListener(this);
        rbPulgadasA.setOnClickListener(this);
        rbYardasA.setOnClickListener(this);
        bConvertir.setOnClickListener(this);

        return vista;
    }

    private void SelecionadoDE() {

        RadioGroup rgDE = vista.findViewById(R.id.rgDE);
        int intSeleccionadoDeID     = rgDE.getCheckedRadioButtonId();

        habilitarTodos(1);

        // Check which radio button was clicked
        switch(intSeleccionadoDeID) {
            case R.id.rbKMDE:
                rbKMA.setEnabled(false);
                break;

            case R.id.rbMDE:
                rbMA.setEnabled(false);
                break;

            case R.id.rbCMDE:
                rbCMA.setEnabled(false);
                break;

            case R.id.rbMillasDE:
                rbMillasA.setEnabled(false);
                break;

            case R.id.rbPiesDE:
                rbPiesA.setEnabled(false);
                break;

            case R.id.rbPulgadasDE:
                rbPulgadasA.setEnabled(false);
                break;

            case R.id.rbYardasDE:
                rbYardasA.setEnabled(false);
                break;
        }
    }

    private void habilitarTodos(int i) {
        if (i == 1) {
            rbKMA.setEnabled(true);
            rbMA.setEnabled(true);
            rbCMA.setEnabled(true);
            rbMillasA.setEnabled(true);
            rbPiesA.setEnabled(true);
            rbPulgadasA.setEnabled(true);
            rbYardasA.setEnabled(true);
        }else{
            rbKMDE.setEnabled(true);
            rbMDE.setEnabled(true);
            rbCMDE.setEnabled(true);
            rbMillasDE.setEnabled(true);
            rbPiesDE.setEnabled(true);
            rbPulgadasDE.setEnabled(true);
            rbYardasDE.setEnabled(true);
        }
    }

    private void SelecionadoA() {

        RadioGroup rgA  = vista.findViewById(R.id.rgA);
        int intSeleccionadoAID      = rgA.getCheckedRadioButtonId();


        habilitarTodos(0);

        // Check which radio button was clicked
        switch(intSeleccionadoAID) {

            case R.id.rbKMA:
                rbKMDE.setEnabled(false);
                break;

            case R.id.rbMA:
                rbMDE.setEnabled(false);
                break;

            case R.id.rbCMA:
                rbCMDE.setEnabled(false);
                break;

            case R.id.rbMillasA:
                rbMillasDE.setEnabled(false);
                break;

            case R.id.rbPiesA:
                rbPiesDE.setEnabled(false);
                break;

            case R.id.rbPulgadasA:
                rbPulgadasDE.setEnabled(false);
                break;

            case R.id.rbYardasA:
                rbYardasDE.setEnabled(false);
                break;
        }
    }


    private void ConvertirDistancia() {

        EditText etEntrada = vista.findViewById(R.id.etEntrada);

        String strEntrada   = etEntrada.getText().toString();
        if(strEntrada.isEmpty()){
            Toast.makeText(getContext(), R.string.valida_valor,
                    Toast.LENGTH_LONG).show();
            return;
        }
        float fltEntrada    = Float.parseFloat(strEntrada);

        RadioGroup rgDE = vista.findViewById(R.id.rgDE);
        int intSeleccionadoDeID     = rgDE.getCheckedRadioButtonId();

        RadioGroup rgA  = vista.findViewById(R.id.rgA);
        int intSeleccionadoAID      = rgA.getCheckedRadioButtonId();

        float intermedioDe;
        switch(intSeleccionadoDeID) {
            case R.id.rbMDE:
                intermedioDe = fltEntrada / 1000;
                break;

            case R.id.rbCMDE:
                intermedioDe = fltEntrada / 100000;
                break;

            case R.id.rbMillasDE:
                intermedioDe = fltEntrada / 0.621371f;
                break;

            case R.id.rbPiesDE:
                intermedioDe = fltEntrada / 3280.84f;
                break;

            case R.id.rbPulgadasDE:
                intermedioDe = fltEntrada / 39370.08f;
                break;

            case R.id.rbYardasDE:
                intermedioDe = fltEntrada / 1093.61f;
                break;

            default: // KG rbKMDE
                intermedioDe = fltEntrada;
                break;
        }

        float resultadoA;

        switch(intSeleccionadoAID) {
            case R.id.rbMA:
                resultadoA = intermedioDe * 1000;
                break;

            case R.id.rbCMA:
                resultadoA = intermedioDe * 100000;
                break;

            case R.id.rbMillasA:
                resultadoA = intermedioDe * 0.621371f;
                break;

            case R.id.rbPiesA:
                resultadoA = intermedioDe * 3280.84f;
                break;

            case R.id.rbPulgadasA:
                resultadoA = intermedioDe * 39370.08f;
                break;

            case R.id.rbYardasA:
                resultadoA = intermedioDe * 1093.61f;
                break;
            default: // KG rbKMA
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
            case R.id.rbKMDE:
            case R.id.rbMDE:
            case R.id.rbCMDE:
            case R.id.rbMillasDE:
            case R.id.rbPiesDE:
            case R.id.rbPulgadasDE:
            case R.id.rbYardasDE:
                SelecionadoDE();
                break;
            case R.id.rbKMA:
            case R.id.rbMA:
            case R.id.rbCMA:
            case R.id.rbMillasA:
            case R.id.rbPiesA:
            case R.id.rbPulgadasA:
            case R.id.rbYardasA:
                SelecionadoA();
                break;
        }

    }

}
