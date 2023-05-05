package com.sv.taller2.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class User {
	
    private String username;
    private Date fechaContratacion;
    private String email;
    @JsonIgnore
	private int iD;
    @JsonIgnore
    private boolean active;
    private String rol;
    
    @JsonIgnore
    private String password;

    public User() {
        super();
    }

    public User(int iD, String username, String password, String email, Date fechaContratacion, boolean active, String rol) {
        super();
        this.iD = iD;
        this.username = username;
        this.password = password;
        this.email = email;
        this.fechaContratacion = fechaContratacion;
        this.active = active;
        this.rol = rol;

    }
    
    public int getID() {
        return iD;
    }

    public void setID(int iD) {
        this.iD = iD;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

	@Override
	public String toString() {
		return "User [username=" + username + ", fechaContratacion=" + fechaContratacion + ", rol=" + rol + "]";
	}

}