package com.example.projetofragmento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoLogar;
    private boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoLogar = findViewById(R.id.btn_logar);

        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //retorna o objeto para manipular o fragmento
                //FragmentManager fragmentManager = getFragmentManager();
                //FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if(status == true){
//                    LoginFragment loginFragment = new LoginFragment();
//                    // adicionar fragmento
//                    fragmentTransaction.add(R.id.rl_container_fragmento, loginFragment);
//                    fragmentTransaction.commit();
                    addFragment();
                    botaoLogar.setText("Cadastre-se");
                    status = false;

                }else{
//                    CadastroFragment cadastroFragment = new CadastroFragment();
//
//                    //adicionar fragmento
//                    fragmentTransaction.add(R.id.rl_container_fragmento, cadastroFragment);
//                    fragmentTransaction.commit();
                    repleceFragment();
                    botaoLogar.setText("Logar");
                    status = true;
                }








            }
        });
    }

    public void addFragment() {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        LoginFragment loginFragment = new LoginFragment();

        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.rl_container_fragmento, loginFragment, "f1");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void repleceFragment() {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CadastroFragment cadastroFragment = new CadastroFragment();

        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.rl_container_fragmento, cadastroFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
