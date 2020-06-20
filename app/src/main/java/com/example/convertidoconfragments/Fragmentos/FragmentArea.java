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
import com.example.convertidoconfragments.Utilidades;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentPresion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentArea extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    // Inicializo los radioButtons
    private RadioButton
            rbOpcion1De, rbOpcion2De, rbOpcion3De, rbOpcion4De, rbOpcion5De,
            rbOpcion6De, rbOpcion7De, rbOpcion8De, rbOpcion9De, rbOpcion10De,
            rbOpcion1A , rbOpcion2A , rbOpcion3A , rbOpcion4A , rbOpcion5A,
            rbOpcion6A , rbOpcion7A , rbOpcion8A , rbOpcion9A , rbOpcion10A;

    private View vista;

    public FragmentArea() {
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
        vista = inflater.inflate(R.layout.fragment_area, container, false);


        rbOpcion1De      = vista.findViewById(R.id.rbM2DE);
        rbOpcion2De      = vista.findViewById(R.id.rbCM2DE);
        rbOpcion3De      = vista.findViewById(R.id.rbDM2DE);
        rbOpcion4De      = vista.findViewById(R.id.rbPies2DE);
        rbOpcion5De      = vista.findViewById(R.id.rbHectareasDE);
        rbOpcion6De      = vista.findViewById(R.id.rbPulgadas2DE);
        rbOpcion7De      = vista.findViewById(R.id.rbKM2DE);
        rbOpcion8De      = vista.findViewById(R.id.rbYardas2DE);
        rbOpcion9De      = vista.findViewById(R.id.rbAcresDE);
        rbOpcion10De     = vista.findViewById(R.id.rbMillas2DE);

        rbOpcion1A      = vista.findViewById(R.id.rbM2A);
        rbOpcion2A      = vista.findViewById(R.id.rbCM2A);
        rbOpcion3A      = vista.findViewById(R.id.rbDM2A);
        rbOpcion4A      = vista.findViewById(R.id.rbPies2A);
        rbOpcion5A      = vista.findViewById(R.id.rbHectareasA);
        rbOpcion6A      = vista.findViewById(R.id.rbPulgadas2A);
        rbOpcion7A      = vista.findViewById(R.id.rbKM2A);
        rbOpcion8A      = vista.findViewById(R.id.rbYardas2A);
        rbOpcion9A      = vista.findViewById(R.id.rbAcresA);
        rbOpcion10A     = vista.findViewById(R.id.rbMillas2A);

        Button bConvertir = vista.findViewById(R.id.bConvertir);

        rbOpcion1De.setOnClickListener(this);
        rbOpcion2De.setOnClickListener(this);
        rbOpcion3De.setOnClickListener(this);
        rbOpcion4De.setOnClickListener(this);
        rbOpcion5De.setOnClickListener(this);
        rbOpcion6De.setOnClickListener(this);
        rbOpcion7De.setOnClickListener(this);
        rbOpcion8De.setOnClickListener(this);
        rbOpcion9De.setOnClickListener(this);
        rbOpcion10De.setOnClickListener(this);

        rbOpcion1A.setOnClickListener(this);
        rbOpcion2A.setOnClickListener(this);
        rbOpcion3A.setOnClickListener(this);
        rbOpcion4A.setOnClickListener(this);
        rbOpcion5A.setOnClickListener(this);
        rbOpcion6A.setOnClickListener(this);
        rbOpcion7A.setOnClickListener(this);
        rbOpcion8A.setOnClickListener(this);
        rbOpcion9A.setOnClickListener(this);
        rbOpcion10A.setOnClickListener(this);

        bConvertir.setOnClickListener(this);

        return vista;
    }

    private void SelecionadoDE() {

        RadioGroup rgDE = vista.findViewById(R.id.rgDE);
        int intSeleccionadoDeID     = rgDE.getCheckedRadioButtonId();

        habilitarTodos(1);

        // Check which radio button was clicked
        switch(intSeleccionadoDeID) {
            case R.id.rbM2DE:
                rbOpcion1A.setEnabled(false);
                break;

            case R.id.rbCM2DE:
                rbOpcion2A.setEnabled(false);
                break;

            case R.id.rbDM2DE:
                rbOpcion3A.setEnabled(false);
                break;

            case R.id.rbPies2DE:
                rbOpcion4A.setEnabled(false);
                break;

            case R.id.rbHectareasDE:
                rbOpcion5A.setEnabled(false);
                break;

            case R.id.rbPulgadas2DE:
                rbOpcion6A.setEnabled(false);
                break;

            case R.id.rbKM2DE:
                rbOpcion7A.setEnabled(false);
                break;

            case R.id.rbYardas2DE:
                rbOpcion8A.setEnabled(false);
                break;

            case R.id.rbAcresDE:
                rbOpcion9A.setEnabled(false);
                break;

            case R.id.rbMillas2DE:
                rbOpcion10A.setEnabled(false);
                break;
        }
    }

    private void habilitarTodos(int i) {
        if (i == 1) {
            rbOpcion1A.setEnabled(true);
            rbOpcion2A.setEnabled(true);
            rbOpcion3A.setEnabled(true);
            rbOpcion4A.setEnabled(true);
            rbOpcion5A.setEnabled(true);
            rbOpcion6A.setEnabled(true);
            rbOpcion7A.setEnabled(true);
            rbOpcion8A.setEnabled(true);
            rbOpcion9A.setEnabled(true);
            rbOpcion10A.setEnabled(true);
        }else{
            rbOpcion1De.setEnabled(true);
            rbOpcion2De.setEnabled(true);
            rbOpcion3De.setEnabled(true);
            rbOpcion4De.setEnabled(true);
            rbOpcion5De.setEnabled(true);
            rbOpcion6De.setEnabled(true);
            rbOpcion7De.setEnabled(true);
            rbOpcion8De.setEnabled(true);
            rbOpcion9De.setEnabled(true);
            rbOpcion10De.setEnabled(true);
        }
    }

    private void SelecionadoA() {

        RadioGroup rgA  = vista.findViewById(R.id.rgA);
        int intSeleccionadoAID      = rgA.getCheckedRadioButtonId();

        habilitarTodos(0);

        // Check which radio button was clicked
        switch(intSeleccionadoAID) {

            case R.id.rbM2A:
                rbOpcion1De.setEnabled(false);
                break;

            case R.id.rbCM2A:
                rbOpcion2De.setEnabled(false);
                break;

            case R.id.rbDM2A:
                rbOpcion3De.setEnabled(false);
                break;

            case R.id.rbPies2A:
                rbOpcion4De.setEnabled(false);
                break;

            case R.id.rbHectareasA:
                rbOpcion5De.setEnabled(false);
                break;

            case R.id.rbPulgadas2A:
                rbOpcion6De.setEnabled(false);
                break;

            case R.id.rbKM2A:
                rbOpcion7De.setEnabled(false);
                break;

            case R.id.rbYardas2A:
                rbOpcion8De.setEnabled(false);
                break;

            case R.id.rbAcresA:
                rbOpcion9De.setEnabled(false);
                break;

            case R.id.rbMillas2A:
                rbOpcion10De.setEnabled(false);
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
            case R.id.rbCM2DE:
                intermedioDe = fltEntrada / Utilidades.CM2;
                break;

            case R.id.rbDM2DE:
                intermedioDe = fltEntrada / Utilidades.DM2;
                break;

            case R.id.rbPies2DE:
                intermedioDe = fltEntrada / Utilidades.PIES2;
                break;

            case R.id.rbHectareasDE:
                intermedioDe = fltEntrada * Utilidades.HECTAREAS;
                break;

            case R.id.rbPulgadas2DE:
                intermedioDe = fltEntrada / Utilidades.PULGADAS2;
                break;

            case R.id.rbKM2DE:
                intermedioDe = fltEntrada * Utilidades.KM2;
                break;

            case R.id.rbYardas2DE:
                intermedioDe = fltEntrada / Utilidades.YARDAS2;
                break;

            case R.id.rbAcresDE:
                intermedioDe = fltEntrada * Utilidades.ACRES;
                break;

            case R.id.rbMillas2DE:
                intermedioDe = fltEntrada * Utilidades.MILLAS2;
                break;

            default: // M² rbM2DE
                intermedioDe = fltEntrada;
                break;
        }

        float resultadoA;

        switch (intSeleccionadoAID) {
            case R.id.rbCM2A:
                resultadoA = intermedioDe * Utilidades.CM2;
                break;

            case R.id.rbDM2A:
                resultadoA = intermedioDe * Utilidades.DM2;
                break;

            case R.id.rbPies2A:
                resultadoA = intermedioDe * Utilidades.PIES2;
                break;

            case R.id.rbHectareasA:
                resultadoA = intermedioDe / Utilidades.HECTAREAS;
                break;

            case R.id.rbPulgadas2A:
                resultadoA = intermedioDe * Utilidades.PULGADAS2;
                break;

            case R.id.rbKM2A:
                resultadoA = intermedioDe / Utilidades.KM2;
                break;

            case R.id.rbYardas2A:
                resultadoA = intermedioDe * Utilidades.YARDAS2;
                break;

            case R.id.rbAcresA:
                resultadoA = intermedioDe / Utilidades.ACRES;
                break;

            case R.id.rbMillas2A:
                resultadoA = intermedioDe / Utilidades.MILLAS2;
                break;

            default: // M² rbM2A
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
            case R.id.rbM2DE:
            case R.id.rbCM2DE:
            case R.id.rbDM2DE:
            case R.id.rbPies2DE:
            case R.id.rbHectareasDE:
            case R.id.rbPulgadas2DE:
            case R.id.rbKM2DE:
            case R.id.rbYardas2DE:
            case R.id.rbAcresDE:
            case R.id.rbMillas2DE:
                SelecionadoDE();
                break;
            case R.id.rbM2A:
            case R.id.rbCM2A:
            case R.id.rbDM2A:
            case R.id.rbPies2A:
            case R.id.rbHectareasA:
            case R.id.rbPulgadas2A:
            case R.id.rbKM2A:
            case R.id.rbYardas2A:
            case R.id.rbAcresA:
            case R.id.rbMillas2A:
                SelecionadoA();
                break;
        }

    }
}
