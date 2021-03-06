package com.example.dannyang27.sportpoints.activities;

import android.os.Parcel;
import android.os.Parcelable;


public class Jugador implements Parcelable {

    private String nombre;
    private String apellidos;
    private String email;
    private String direccion;
    private String fechaNacimiento;
    private String password;

    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String getEmail(){
        return this.email;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    public String getPassword(){
        return this.password;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setPassword(String password){
        this.password = password;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(apellidos);
        parcel.writeString(email);
        parcel.writeString(direccion);
        parcel.writeString(fechaNacimiento);
        parcel.writeString(password);

    }

    public static final Parcelable.Creator<Jugador> CREATOR
            = new Parcelable.Creator<Jugador>() {
        public Jugador createFromParcel(Parcel in) {
            return new Jugador(in);
        }

        public Jugador[] newArray(int size) {
            return new Jugador[size];
        }
    };

    private Jugador(Parcel in) {
        nombre = in.readString();
        apellidos = in.readString();
        email = in.readString();
        direccion = in.readString();
        fechaNacimiento = in.readString();
        password = in.readString();
    }
}
