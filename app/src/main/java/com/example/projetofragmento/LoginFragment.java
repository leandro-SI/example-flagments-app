package com.example.projetofragmento;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private TextView texto;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // passando o inflater para uma variavel
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        texto = view.findViewById(R.id.tv_login);
        texto.setText("TESTEEEEE");


        return view;

    }

}
