package com.example.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ajt_btn.setOnClickListener(){
            if (nom_editText.text.toString() == null){
                Toast.makeText(this,"Merci d'entrée votre nom !",Toast.LENGTH_LONG).show()
            }
            if (prenom_editText.text.toString()== null) {
                Toast.makeText(this,"Merci d'entrée votre prénom !",Toast.LENGTH_LONG).show()
            }
            if(adresse_editText.text.toString() == null) {
                Toast.makeText(this,"Merci d'entrée votre adresse !",Toast.LENGTH_LONG).show()
            }
            if( email_editText.text.toString() == null || android.util.Patterns.EMAIL_ADDRESS.matcher(email_editText.text.toString()).matches()){
                Toast.makeText(this,"Votre email est incorrecte !",Toast.LENGTH_LONG).show()
            }
             /* if(!Patterns.EMAIL_ADDRESS.matcher(email_editText.text.toString())){
                 Toast.makeText(this,"Votre email est incorrecte !",Toast.LENGTH_LONG).show()
             }*/
            if (tel_editText.text.toString().length<8 || tel_editText.text.toString()== null){
                Toast.makeText(this," Votre numéro est incorrecte !",Toast.LENGTH_LONG).show()
            }
            if(user_editText.text.toString() == null) {
                Toast.makeText(this,"Merci d'entrée votre nom d'utilisateur !",Toast.LENGTH_LONG).show()
            }

            Toast.makeText(this," Utilisateur ajoutée avec succés !",Toast.LENGTH_LONG).show()

        }

    }
}
