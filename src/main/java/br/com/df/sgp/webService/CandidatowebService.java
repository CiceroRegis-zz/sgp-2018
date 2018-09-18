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
	
	
	public List<Candidato> listaCandidatosDristrital(){
		
		candidatos.add(new Candidato("ADRIANA GLORIA	","AVANTE"));
		candidatos.add(new Candidato("AKILLA MARINHO	","AVANTE"));
		candidatos.add(new Candidato("ALFREDO JUNIOR	","AVANTE"));
		candidatos.add(new Candidato("ANGELA TEIXEIRA	","AVANTE"));
		candidatos.add(new Candidato("ARTHUR CARDOSO	","AVANTE"));
		candidatos.add(new Candidato("BILL SAÚDE	    ","AVANTE"));
		candidatos.add(new Candidato("BISMARCK UBER, CABIFY E 99	","AVANTE"));
		candidatos.add(new Candidato("BOLIVAR ROCHA	","AVANTE"));
		candidatos.add(new Candidato("CAMARGO","AVANTE"));
		candidatos.add(new Candidato("CAROL DOS ANIMAIS	","AVANTE"));
		candidatos.add(new Candidato("CORREA LEÃO DE JUDÁ	","AVANTE"));
		candidatos.add(new Candidato("CRISTIA LIMA	","AVANTE"));
		candidatos.add(new Candidato("DELEGADO MAURO CEZAR	","AVANTE"));
		candidatos.add(new Candidato("DRA. JANE	","AVANTE"));
		candidatos.add(new Candidato("DR. CARLOS	","AVANTE"));
		candidatos.add(new Candidato("DR. ROBERTO LUCENA	","AVANTE"));
		candidatos.add(new Candidato("FLÁVIO CARDOSO	","AVANTE"));
		candidatos.add(new Candidato("GABI DA JUVENTUDE","AVANTE"));
		candidatos.add(new Candidato("GEORGIA QUARTIN	","AVANTE"));
		candidatos.add(new Candidato("GORDINHO DA FARMÁCIA	","AVANTE"));
		candidatos.add(new Candidato("ISAURA BARBOSA	","AVANTE"));
		candidatos.add(new Candidato("JOAO CARDOSO PROFESSOR-AUDITOR	","AVANTE"));
		candidatos.add(new Candidato("KLEYSON MORENO	","AVANTE"));
		candidatos.add(new Candidato("KYARA ZARUTY LGBTI	","AVANTE"));
		candidatos.add(new Candidato("LULO SENA	","AVANTE"));
		candidatos.add(new Candidato("MAICON MIRANDA	","AVANTE"));
		candidatos.add(new Candidato("MAJOR LOURIVAL	","AVANTE"));
		candidatos.add(new Candidato("MARCOS MAURÍCIO	","AVANTE"));
		candidatos.add(new Candidato("MC BANDIDA	","AVANTE"));
		candidatos.add(new Candidato("MILENE DA CEILÂDIA	","AVANTE"));
		candidatos.add(new Candidato("NERY DO BRASIL	","AVANTE"));
		candidatos.add(new Candidato("PAULA ALVES PSICOPEDAGOGA	","AVANTE"));
		candidatos.add(new Candidato("PR. CÉLIO SANTANA	","AVANTE"));
		candidatos.add(new Candidato("PROF. DIEGO MATOS DA FERCAL	","AVANTE"));
		candidatos.add(new Candidato("PROFESSOR NIVALDO	","AVANTE"));
		candidatos.add(new Candidato("PROF. IRAN LIMA	","AVANTE"));
		candidatos.add(new Candidato("PROF. SEVERINO CAJAZEIRAS	","AVANTE"));
		candidatos.add(new Candidato("RAFAEL MOREIRA	","AVANTE"));
		candidatos.add(new Candidato("REGINALDO SARDINHA	","AVANTE"));
		candidatos.add(new Candidato("","AVANTE"));
		
		
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