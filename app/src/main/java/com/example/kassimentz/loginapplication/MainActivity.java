package com.example.kassimentz.loginapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kassimentz.loginapplication.model.Usuarios;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Usuarios> usuarios;
    EditText editNome;
    EditText editPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarios = criaUsuarios();

        editNome = (EditText) findViewById(R.id.editNome);
        editPassword = (EditText) findViewById(R.id.editPassword);

    }

    public void verificaLogin (View v){

        Context contexto = getApplicationContext();
        String texto;
        int duracao = Toast.LENGTH_SHORT;
        Toast toast;
        Usuarios user = new Usuarios(editNome.getText().toString(), editPassword.getText().toString());

        if(usuarios.contains(user)){
            texto = "Login Realizado com sucesso!";
            toast= Toast.makeText(contexto, texto,duracao);
            toast.show();
        }else{
            texto = "Usuario ou senha incorretos";
            toast= Toast.makeText(contexto, texto,duracao);
            toast.show();
        }

    }
    private List<Usuarios> criaUsuarios(){
        Usuarios u1 = new Usuarios("user1", "user1");
        Usuarios u2 = new Usuarios("user2", "user2");
        Usuarios u3 = new Usuarios("user3", "user3");
        Usuarios u4 = new Usuarios("user4", "user4");
        Usuarios u5 = new Usuarios("user5", "user5");
        Usuarios u6 = new Usuarios("user6", "user6");
        Usuarios u7 = new Usuarios("user7", "user7");

        usuarios = new ArrayList<Usuarios>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        usuarios.add(u6);
        usuarios.add(u7);

        return usuarios;
    }
}
