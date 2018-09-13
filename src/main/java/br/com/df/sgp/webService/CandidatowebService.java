package br.com.df.sgp.webService;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import br.com.df.sgp.model.Candidato;

@ManagedBean
public class CandidatowebService{

	private Candidato candidato = new Candidato();

	/*WebResource webResource = client.resource("https://dadosabertos.camara.leg.br/api/v2/deputados/73886");
	System.out.println(webResource.path("dadosabertos").get(String.class));*/
	
	public List<Candidato> getlistar() {
	Client client =  Client.create();      
	
	WebResource resource = client.resource("https://dadosabertos.camara.leg.br/api/v2/blocos/571");
    //System.out.println(resource.get(String.class));

    String json = resource.get(String.class);
    Gson gson = new Gson();
    List<Candidato>candidatos = Arrays.asList(gson.fromJson(json, Candidato.class));
    return candidatos;
	}
    
		
		
		/*String json = "https://dadosabertos.camara.leg.br/api/v2/blocos/571";

	    JsonObject jsonObject = new Gson().fromJson(json, JsonObject.class);
	    JsonArray jsonArray = jsonObject.getAsJsonArray("servers");

	    String[] arrName = new Gson().fromJson(jsonArray, String[].class);

	    List<String> lstName = new ArrayList<>();
	    lstName = Arrays.asList(arrName);

	    for (String str : lstName) {
	        System.out.println(str);
	    }    
		
	}*/
	
	public static void main(String[] args) {
		CandidatowebService candidatowebService = new CandidatowebService();
		candidatowebService.getlistar();
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	

}
