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
public class CRUD extends SQLServer {

    public static boolean login(String email, String senha) {

        ResultSet result = SQLServer
                .getQuery("SELECT email, senha FROM USUARIO WHERE email='" + email + "' and senha='" + senha + "' ;");

        try {
            if (result.next()) {

                return (result.getString("email").equals(email) && result.getString("senha").equals(senha));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

            return false;
        }

        return false;
    }

    public static void excluirConta(String email, String senha) {

        try {
            SQLServer.executeQuery("DELETE FROM USUARIO WHERE email='" + email
                    + "' and senha='" + senha + "' ;");
        } catch (Exception e) {

        }

    }

    public static void criarUsuario(Usuario usuario) {

        SQLServer.executeQuery(
                "INSERT INTO USUARIO VALUES ('"
                + usuario.getCpf()
                + "', '" + usuario.getNome()
                + "', '" + usuario.getEmail()
                + "', '" + usuario.getTelefone()
                + "', '" + usuario.getSenha()
                + "', '" + usuario.getNome() //usuario
                + "', '" + usuario.getConvidado()
                + "', '" + usuario.getAdministrador()
                + "');"
        );

    }
    
    public static void alterarSenha(String email, String senha) {
        
        SQLServer.executeQuery(
                "UPDATE USUARIO SET senha='"
                +senha
                +"' WHERE email='"
                +email
                +"';"
        );
    }

}
