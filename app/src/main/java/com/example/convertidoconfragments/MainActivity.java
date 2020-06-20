package com.example.convertidoconfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.convertidoconfragments.Fragmentos.FragmentArea;
import com.example.convertidoconfragments.Fragmentos.FragmentCocina;
import com.example.convertidoconfragments.Fragmentos.FragmentDetalleCocina;
import com.example.convertidoconfragments.Fragmentos.FragmentDistancia;
import com.example.convertidoconfragments.Fragmentos.FragmentMenuPrincipal;
import com.example.convertidoconfragments.Fragmentos.FragmentPeso;
import com.example.convertidoconfragments.Fragmentos.FragmentPresion;
import com.example.convertidoconfragments.Fragmentos.FragmentTemperatura;
import com.example.convertidoconfragments.Fragmentos.FragmentVolumen;
import com.example.convertidoconfragments.Interfaces.IComunicaFragments;

public class MainActivity extends AppCompatActivity implements IComunicaFragments {

    Fragment fragmentMenuPrincipal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentMenuPrincipal = new FragmentMenuPrincipal();

        if (findViewById(R.id.contenidoPrincipal) != null) {

            if(savedInstanceState != null){
                return;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.contenidoPrincipal,fragmentMenuPrincipal).commit();
        }else {
            getSupportFragmentManager().beginTransaction().replace(R.id.contenidoMenu,fragmentMenuPrincipal).commit();

        }

    }
    public void onClick(View view) {
        // Intent lanzar = null;
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragmento = null;

        switch(view.getId()) {
            case R.id.tvPeso:
                fragmento = new FragmentPeso();
                break;

            case R.id.tvDistancia:
                // lanzar = new Intent(MainActivity.this, ContenedorFragmentos.class);
                fragmento = new FragmentDistancia();
                break;

            case R.id.tvVolumen:
                fragmento = new FragmentVolumen();
                break;

            case R.id.tvCocina:
                fragmento = new FragmentCocina();
                break;

            case R.id.tvTemperatura:
                fragmento = new FragmentTemperatura();
                break;

            case R.id.tvPresion:
                fragmento = new FragmentPresion();
                break;

            case R.id.tvArea:
                fragmento = new FragmentArea();
                break;

            default:
                Toast.makeText(getApplicationContext(),"No implementado aún",Toast.LENGTH_SHORT).show();
                break;
        }
        // if (lanzar != null) startActivity(lanzar);
        if (findViewById(R.id.contenidoPrincipal) != null){
            if (fragmento != null) fragmentManager.beginTransaction()
                    .replace(R.id.contenidoPrincipal,fragmento)
                    .addToBackStack(null).commit();
        }else {
            if (fragmento != null) fragmentManager.beginTransaction()
                    .replace(R.id.contenidoOpcion,fragmento)
                    .addToBackStack(null).commit();
        }

    }

    @Override
    public void enviarMedidaCocina(MedidaCocina medidaCocina) {
        Fragment detalleFragment = new FragmentDetalleCocina();

        Bundle bundleEnvio = new Bundle();
        bundleEnvio.putSerializable("objeto",medidaCocina);
        detalleFragment.setArguments(bundleEnvio);

        getSupportFragmentManager().beginTransaction().
                replace(R.id.contenidoPrincipal,detalleFragment).addToBackStack(null).commit();

    }
}
