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

	List<Candidato> candidatosGovernador = new ArrayList<>();
	
	public List<Candidato> listaCandidatosGovernador(){
		
		candidatosGovernador = new ArrayList<>();
		
		candidatosGovernador.add(new Candidato("ALBERTO FRAGA	","DEM	"));
		candidatosGovernador.add(new Candidato("IBANEIS","DEM	"));
		candidatosGovernador.add(new Candidato("ALEXANDRE GUERRA	","NOVO	"));
		candidatosGovernador.add(new Candidato("RENAN ROSA ","PCO"));
		candidatosGovernador.add(new Candidato("ELIANA PEDROSA ","PROS"));
		candidatosGovernador.add(new Candidato("GENERAL PAULO CHAGAS ","PRP"));
		candidatosGovernador.add(new Candidato("RODRIGO ROLLEMBERG","	PSB"));
		candidatosGovernador.add(new Candidato("ROGÉRIO ROSSO","PSD"));
		candidatosGovernador.add(new Candidato("FÁTIMA SOUSA","PSOL"));
		candidatosGovernador.add(new Candidato("GUILLEN","PSTU"));
		candidatosGovernador.add(new Candidato("JÚLIO MIRAGAYA","PT"));
		return candidatosGovernador;
	}
	
	
	public List<Candidato> listaCandidatosDristrital(){
		List<Candidato> candidatosDistrital = new ArrayList<>();
		
		candidatosDistrital.add(new Candidato("ADRIANA GLORIA	","AVANTE"));
		candidatosDistrital.add(new Candidato("AKILLA MARINHO	","AVANTE"));
		candidatosDistrital.add(new Candidato("ALFREDO JUNIOR	","AVANTE"));
		candidatosDistrital.add(new Candidato("ANGELA TEIXEIRA	","AVANTE"));
		candidatosDistrital.add(new Candidato("ARTHUR CARDOSO	","AVANTE"));
		candidatosDistrital.add(new Candidato("BILL SAÚDE	    ","AVANTE"));
		candidatosDistrital.add(new Candidato("BISMARCK UBER, CABIFY E 99	","AVANTE"));
		candidatosDistrital.add(new Candidato("BOLIVAR ROCHA	","AVANTE"));
		candidatosDistrital.add(new Candidato("CAMARGO","AVANTE"));
		candidatosDistrital.add(new Candidato("CAROL DOS ANIMAIS	","AVANTE"));
		candidatosDistrital.add(new Candidato("CORREA LEÃO DE JUDÁ	","AVANTE"));
		candidatosDistrital.add(new Candidato("CRISTIA LIMA	","AVANTE"));
		candidatosDistrital.add(new Candidato("DELEGADO MAURO CEZAR	","AVANTE"));
		candidatosDistrital.add(new Candidato("DRA. JANE	","AVANTE"));
		candidatosDistrital.add(new Candidato("DR. CARLOS	","AVANTE"));
		candidatosDistrital.add(new Candidato("DR. ROBERTO LUCENA	","AVANTE"));
		candidatosDistrital.add(new Candidato("FLÁVIO CARDOSO	","AVANTE"));
		candidatosDistrital.add(new Candidato("GABI DA JUVENTUDE","AVANTE"));
		candidatosDistrital.add(new Candidato("GEORGIA QUARTIN	","AVANTE"));
		candidatosDistrital.add(new Candidato("GORDINHO DA FARMÁCIA	","AVANTE"));
		candidatosDistrital.add(new Candidato("ISAURA BARBOSA	","AVANTE"));
		candidatosDistrital.add(new Candidato("JOAO CARDOSO PROFESSOR-AUDITOR	","AVANTE"));
		candidatosDistrital.add(new Candidato("KLEYSON MORENO	","AVANTE"));
		candidatosDistrital.add(new Candidato("KYARA ZARUTY LGBTI	","AVANTE"));
		candidatosDistrital.add(new Candidato("LULO SENA	","AVANTE"));
		candidatosDistrital.add(new Candidato("MAICON MIRANDA	","AVANTE"));
		candidatosDistrital.add(new Candidato("MAJOR LOURIVAL	","AVANTE"));
		candidatosDistrital.add(new Candidato("MARCOS MAURÍCIO	","AVANTE"));
		candidatosDistrital.add(new Candidato("MC BANDIDA	","AVANTE"));
		candidatosDistrital.add(new Candidato("MILENE DA CEILÂDIA	","AVANTE"));
		candidatosDistrital.add(new Candidato("NERY DO BRASIL	","AVANTE"));
		candidatosDistrital.add(new Candidato("PAULA ALVES PSICOPEDAGOGA	","AVANTE"));
		candidatosDistrital.add(new Candidato("PR. CÉLIO SANTANA	","AVANTE"));
		candidatosDistrital.add(new Candidato("PROF. DIEGO MATOS DA FERCAL	","AVANTE"));
		candidatosDistrital.add(new Candidato("PROFESSOR NIVALDO	","AVANTE"));
		candidatosDistrital.add(new Candidato("PROF. IRAN LIMA	","AVANTE"));
		candidatosDistrital.add(new Candidato("PROF. SEVERINO CAJAZEIRAS	","AVANTE"));
		candidatosDistrital.add(new Candidato("RAFAEL MOREIRA	","AVANTE"));
		candidatosDistrital.add(new Candidato("REGINALDO SARDINHA	","AVANTE"));
		candidatosDistrital.add(new Candidato("","AVANTE"));
		
		
		return candidatosDistrital;
		
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