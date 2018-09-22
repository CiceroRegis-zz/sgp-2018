package br.com.df.sgp.service;


import br.com.df.sgp.dao.PesquisaEleitoralDAO;
import br.com.df.sgp.model.Candidato;

public class PesquisaEleitoralService {

	private static PesquisaEleitoralDAO pesquisaEleitoralDAO = new PesquisaEleitoralDAO();

	public static boolean salvarPesquisa(Candidato candidato_Distrital) {

		return pesquisaEleitoralDAO.salvarCandidato(candidato_Distrital);
	}
	
	
	/*public static boolean salvarCandidato(Candidato candidato) {
		
		return pesquisaEleitoralDAO.salvarCandidato(candidato);
	}*/

}
