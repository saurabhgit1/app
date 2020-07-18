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
public class Signup_fragment extends Fragment {

    public Signup_fragment() {
        // Required empty public constructor
    }

    EditText signup_email;
    EditText signup_pwd;
    Button signup_button;
    FirebaseAuth mAuth;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        signup_button=getActivity().findViewById(R.id.buttonsignup);
        signup_email=getActivity().findViewById(R.id.signupFragmentemail);
        signup_pwd=getActivity().findViewById(R.id.signupFragmentpwd);

        mAuth=FirebaseAuth.getInstance();

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });


    }

    void signup(){
        String email=signup_email.getText().toString();
       String pwd=signup_pwd.getText().toString();
       mAuth.createUserWithEmailAndPassword(email,pwd)
                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(getContext(), "Signed Up", Toast.LENGTH_SHORT).show();
                       }
                       else{
                           Toast.makeText(getActivity(), "Sign Up Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
