package com.example.kassimentz.loginapplication.model;

/**
 * Created by 630910144 on 30/04/2016.
 */
public class Usuarios {
    String usuario;
    String senha;

    public Usuarios(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuarios usuarios = (Usuarios) o;

        if (!usuario.equals(usuarios.usuario)) return false;
        return senha.equals(usuarios.senha);

    }

    @Override
    public int hashCode() {
        int result = usuario.hashCode();
        result = 31 * result + senha.hashCode();
        return result;
    }
}
