package com.example.storeit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

//    EditText editText1email;
//    EditText editText2pwd;
//    Button buttonsignup;
//    Button buttonsignin;
//    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        editText1email=findViewById(R.id.edittext1);
//        editText2pwd=findViewById(R.id.edittext2);
//        buttonsignup=findViewById(R.id.buttonsignup);
//        buttonsignin=findViewById(R.id.buttonsignin);
//        mAuth=FirebaseAuth.getInstance();


//        buttonsignup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                signup();
//            }
//        });
//        buttonsignin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                signin();
//            }
//        });


//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String email=editText1email.getText().toString();
//                String pwd=editText2pwd.getText().toString();
//
//                mAuth.signInWithEmailAndPassword(email,pwd)
//                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                if(task.isSuccessful()){
//                                    Toast.makeText(MainActivity.this, "signed in", Toast.LENGTH_SHORT).show();
//                                }
//                                else{
//                                    Toast.makeText(MainActivity.this, "not signed in", Toast.LENGTH_SHORT).show();
//                                }
//                            }
//                        });
//            }
//        });

    }


//    void signup(){
//        String email=editText1email.getText().toString();
//        String pwd=editText2pwd.getText().toString();
//
//        mAuth.createUserWithEmailAndPassword(email,pwd)
//                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if(task.isSuccessful()){
//                            Toast.makeText(MainActivity.this, "Signed Up", Toast.LENGTH_SHORT).show();
//                        }
//                        else{
//                            Toast.makeText(MainActivity.this, "Sign Up Failed", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//    }
//
//    void signin(){
//        String email=editText1email.getText().toString();
//        String pwd=editText2pwd.getText().toString();
//
//        mAuth.signInWithEmailAndPassword(email,pwd)
//                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if(task.isSuccessful()){
//                            Toast.makeText(MainActivity.this, "Signed In", Toast.LENGTH_SHORT).show();
//                        }
//                        else{
//                            Toast.makeText(MainActivity.this, "Sign In Failed", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//    }

}
