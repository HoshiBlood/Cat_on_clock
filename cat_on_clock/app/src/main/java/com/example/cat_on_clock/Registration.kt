package com.example.cat_on_clock

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.AuthResult
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task

//private lateinit var nameLogin: EditText
//private lateinit var emailLogin: EditText
//private lateinit var passwordLogin: EditText
//private lateinit var btnLogin: ImageView
//
//private lateinit var mAuth: FirebaseAuth

//private EditText name_login;
//private EditText email_login;
//private EditText password_login;
//private ImageView btn_login;
//
//private FirebaseAuth mAuth;

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.registration)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun  textView6(view: View) {
        val intent = Intent(this, LogIn::class.java)
        startActivity(intent)
    }

//    name_login = findViewById(R.id.name_login);
//    email_login = findViewById(R.id.email_login);
//    password_login = findViewById(R.id.password_login);
//    btn_login = findViewById(R.id.btn_login);
//    mAuth = FirebaseAuth.getInstance();
//    btn_login.setOnClickListener(new View.OnClickListener(){
//        @Override
//        public void onClick(View v){
//            if (email_login.getText().toString().isEmpty() || password_login.getText().toString().isEmpty() || name_login.getText().toString().isEmpty()){
//                Toast.makeText(Registration.this, "Fields cannot be empty", Toast.LENGTH_SHORT).show();
//            }else{
//                mAuth.signInWhithEmailAndPassword(email_login.getText().toString(), password_login.getText().toString())
//                    .addOnCompleteListener(new OnCompletListener<AuthResult>(){
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task){
//                            if (task.isSuccessful()){
//                                intent intent = new intent(Registration.this, ProfileActivity.class);
//                                startActivity(intent);
//                            }else{
//                                Toast.makeText(Registration.this, "You have some errors", Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    });
//            }
//        }
//    });

//    btnLogin.setOnClickListener {
//        if (emailLogin.text.toString().isEmpty() || passwordLogin.text.toString().isEmpty() || nameLogin.text.toString().isEmpty()) {
//            Toast.makeText(this@Registration, "Fields cannot be empty", Toast.LENGTH_SHORT).show()
//        } else {
//            mAuth.signInWithEmailAndPassword(emailLogin.text.toString(), passwordLogin.text.toString())
//                .addOnCompleteListener { task ->
//                    if (task.isSuccessful) {
//                        val intent = Intent(this@Registration, ProfileActivity::class.java)
//                        startActivity(intent)
//                    } else {
//                        Toast.makeText(this@Registration, "You have some errors", Toast.LENGTH_SHORT).show()
//                    }
//                }
//        }
//    }
    fun  btn_login(view: View) {
        val intent = Intent(this, Calendar::class.java)
        startActivity(intent)
    }


}