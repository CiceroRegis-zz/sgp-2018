package br.com.df.sgp.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.df.sgp.model.Candidato;
import br.com.df.sgp.model.PesquisaEleitoral;
import br.com.df.sgp.model.Usuario;
import br.com.df.sgp.service.CadastroService;
import br.com.df.sgp.service.PesquisaEleitoralService;
import br.com.df.sgp.util.JsfUtil;

@ManagedBean(name = "pesquisaEleitoralController")
public class PesquisaEleitoralController implements Serializable {

	private static Logger logger = LoggerFactory.getLogger(PesquisaEleitoral.class);

	private static final long serialVersionUID = 1L;
	private Usuario usuarioLogado = new Usuario();
	private Usuario usuario = new Usuario();
	private Candidato candidato_Distrital = new Candidato();
	private PesquisaEleitoral pesquisaEleitoral = new PesquisaEleitoral();

	public String salvarPesquisa() {
		this.usuarioLogado = CadastroService.carregarUsuarioPorCpf(JsfUtil.getHttpServletRequest().getUserPrincipal().getName());
		this.pesquisaEleitoral.setIdResponsavel(usuarioLogado.getIdResponsavel());
		//this.candidato.setIdPesquisa(pesquisaEleitoral.getIdPesquisa());
		//PesquisaEleitoralService.salvarCandidato(this.candidato);
		PesquisaEleitoralService.salvarPesquisa(candidato_Distrital);
		JsfUtil.addInfoMessage(null, "Formulario Salva com Sucesso!");
		return "/pages/pesquisaEleitoral?faces-redirect=true";
	}
	
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public PesquisaEleitoral getPesquisaEleitoral() {
		return pesquisaEleitoral;
	}

	public void setPesquisaEleitoral(PesquisaEleitoral pesquisaEleitoral) {
		this.pesquisaEleitoral = pesquisaEleitoral;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	public Candidato getCandidato_Distrital() {
		return candidato_Distrital;
	}

	public void setCandidato_Distrital(Candidato candidato_Distrital) {
		this.candidato_Distrital = candidato_Distrital;
	}

}
