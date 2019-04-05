package br.com.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.ws.RequestWrapper;

import br.com.rest.imc.CalculaImc;

@Path( "/informacoes" )
public class InformacoesResource {
	
	
	@GET
	@Path("nome={nome}?idade={idade}?linguagem={linguagem}")
	public String showInfo( @PathParam("nome") String nome
			, @PathParam("idade") int idade
			, @PathParam("linguagem") String linguagem ) {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Eu ")
			.append(nome)
			.append(", trabalho e estudo, tenho ")
			.append(String.valueOf(idade))
			.append(" e adoro programar em ")
			.append(linguagem);
		
		return builder.toString();
	}
	
	@GET
	@Path("imc/altura={altura}?peso={peso}")
	public String showImc( @PathParam("altura") double altura, @PathParam("peso") double peso ) {
		
		CalculaImc imc = new CalculaImc(altura, peso);
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Eu tenho ")
			.append(Math.round(altura))
			.append(" de altura e tenho ")
			.append(Math.round(peso))
			.append(" KG. Eu estou ")
			.append(imc.getResultado());
		
		return builder.toString();
	}

}
