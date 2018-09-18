package br.com.df.sgp.webService;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.df.sgp.model.Candidato;

/***
 * 
 * @author cicer
 *
 */

@ManagedBean
@ApplicationScoped
public class CandidatowebService {

	Candidato candidato = new Candidato();

	List<Candidato> candidatos = new ArrayList<>();
	
	public List<Candidato> listaCandidatosGovernador(){
		
		candidatos = new ArrayList<>();
		
		candidatos.add(new Candidato("ALBERTO FRAGA	","DEM	"));
		candidatos.add(new Candidato("IBANEIS","DEM	"));
		candidatos.add(new Candidato("ALEXANDRE GUERRA	","NOVO	"));
		candidatos.add(new Candidato("RENAN ROSA ","PCO"));
		candidatos.add(new Candidato("ELIANA PEDROSA ","PROS"));
		candidatos.add(new Candidato("GENERAL PAULO CHAGAS ","PRP"));
		candidatos.add(new Candidato("RODRIGO ROLLEMBERG","	PSB"));
		candidatos.add(new Candidato("ROGÉRIO ROSSO","PSD"));
		candidatos.add(new Candidato("FÁTIMA SOUSA","PSOL"));
		candidatos.add(new Candidato("GUILLEN","PSTU"));
		candidatos.add(new Candidato("JÚLIO MIRAGAYA","PT"));
		return candidatos;
	}
	
	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

}