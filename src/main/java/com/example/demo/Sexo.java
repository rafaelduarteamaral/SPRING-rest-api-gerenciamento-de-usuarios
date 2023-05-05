package com.example.demo;

public enum Sexo{
	   M("Masculino"), F("Feminino"), NI("Não informar");
	   
	   private String sexo;

	   Sexo(String sexo){
	      this.sexo = sexo;
	   }

	   public String getSexo(){return this.sexo;}

	}
