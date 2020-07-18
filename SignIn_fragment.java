package com.example.storeit;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignIn_fragment extends Fragment {

    public SignIn_fragment() {
        // Required empty public constructor
    }

    EditText signin_email;
    EditText signin_pwd;
    Button signin_button;
    FirebaseAuth mAuth;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        signin_email = getActivity().findViewById(R.id.signinFragmentemail);
        signin_pwd = getActivity().findViewById(R.id.signinFragmentpwd);
        signin_button = getActivity().findViewById(R.id.buttonsignin);

        mAuth = FirebaseAuth.getInstance();

        signin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signin();
            }
        });


    }

    void signin(){
        String email=signin_email.getText().toString();
        String pwd=signin_pwd.getText().toString();

        mAuth.signInWithEmailAndPassword(email,pwd)
                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(getContext(), "Signed In", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(getActivity(), "Sign In Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
