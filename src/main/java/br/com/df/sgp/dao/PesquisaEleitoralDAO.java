package br.com.df.sgp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.df.sgp.model.Candidato;
import br.com.df.sgp.model.PesquisaEleitoral;

public class PesquisaEleitoralDAO {

	private static Logger logger = LoggerFactory.getLogger(PesquisaEleitoral.class);

	public boolean salvarCandidato(Candidato candidato_Distrital) {
		Integer resultado = null;
		Connection conn = null;

		PreparedStatement pst = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(
					"INSERT INTO candidato_distrital (id,nome,siglaPartido)");
			sql.append("VALUES (?,?,?)");
			conn = Conexao.getConnection();
				
			
			pst = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
			pst.setLong(1, candidato_Distrital.getId());
			pst.setString(2, candidato_Distrital.getNome());
			pst.setString(3, candidato_Distrital.getSiglaPartido());
			if (pst.executeUpdate() == 1) {
				return true;
			}
			ResultSet keys = pst.getGeneratedKeys();
			if (keys.next()) {
				resultado = keys.getInt(1);
			}
		} catch (Exception e) {
			logger.error("#>> Error: " + e.getMessage());
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception ex) {
				logger.error("#>> Error: " + ex.getMessage());
			}
		} finally {
			Conexao.closeConnection(conn, pst, null);
		}
		return false;
	}
	
	
}
