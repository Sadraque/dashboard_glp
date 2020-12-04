/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sadra
 */
public class UsuarioDAO extends SQLServer {


	public static boolean login(String email, String senha) {

		ResultSet result = SQLServer
				.getQuery("SELECT email, senha FROM USUARIO WHERE email='" + email + "' and senha='" + senha + "' ;");

		try {
			if (result.next()) {

				return (result.getString("email").equals(email) && result.getString("senha").equals(senha)) ? true
						: false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return false;
		}

		return false;
	}

}

    

