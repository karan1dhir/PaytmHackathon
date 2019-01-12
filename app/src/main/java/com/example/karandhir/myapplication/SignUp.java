package com.example.karandhir.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SignUp extends Fragment {
    public SignUp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sign_up, container, false);
        final Button signUp=(Button)view.findViewById(R.id.buttonsignUp);


        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(view==signUp) {
                   /* Intent intentSignUp = new Intent(getActivity(), MyOtp.class);
                      startActivity(intentSignUp);*/
                }

            }
        });
        return view;
    }
}
