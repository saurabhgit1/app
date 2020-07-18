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

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;


/**
 * A simple {@link Fragment} subclass.
 */
public class PhoneLoginFragment extends Fragment {

    public PhoneLoginFragment() {
        // Required empty public constructor
    }

    EditText phonefragmobnum;
    Button phonefragbutton;
    FirebaseAuth mAuth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone_login, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        phonefragmobnum = getActivity().findViewById(R.id.phonefrag_mobnumedittext);
        phonefragbutton = getActivity().findViewById(R.id.phonefrag_button);

        mAuth = FirebaseAuth.getInstance();

        phonefragbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getContext(), "button clicked", Toast.LENGTH_SHORT).show();
                login_using_phone();
            }
        });




    }

    void login_using_phone(){

       String mobnum=phonefragmobnum.getText().toString();
        Toast.makeText(getContext(), mobnum, Toast.LENGTH_SHORT).show();

        PhoneAuthProvider.getInstance().verifyPhoneNumber("+91"+mobnum,60, TimeUnit.SECONDS,getActivity(),mCallbacks);
    }

    PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks=new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        @Override
        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
            Toast.makeText(getContext(), "onVerificationCompleted", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onVerificationFailed(@NonNull FirebaseException e) {
            Toast.makeText(getContext(), "onVerificationFailed", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(s, forceResendingToken);
            Toast.makeText(getContext(), "Code is Sent", Toast.LENGTH_SHORT).show();
        }
    };

//    mCallbacks =new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
//        @Override
//        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
//            Toast.makeText(getContext(), "onVerificationCompleted", Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        public void onVerificationFailed(@NonNull FirebaseException e) {
//            Toast.makeText(getContext(), "onVerificationFailed", Toast.LENGTH_SHORT).show();
//
//        }
//
//        @Override
//        public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
//            super.onCodeSent(s, forceResendingToken);
//            Toast.makeText(getContext(), "Code is Sent", Toast.LENGTH_SHORT).show();
//        }
//    };

}
