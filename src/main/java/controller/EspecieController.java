/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dal.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Especie;

/**
 *
 * @author srlucas
 */
public class EspecieController {

    Connection conexao = null;
    PreparedStatement preparedStmt = null;
    ResultSet resultSet = null;

    public EspecieController() {
        this.conexao = ModuloConexao.conector();
    }

    public ArrayList<Especie> listEspecie() {
        String sql = "SELECT descricao FROM especies";

        try {
            preparedStmt = this.conexao.prepareStatement(sql);

            resultSet = preparedStmt.executeQuery();

            int size = resultSet.getFetchSize();

            ArrayList<Especie> especies = new ArrayList<>();

            while (resultSet.next()) {
                especies.add(new Especie(
                        resultSet.getString("descricao")
                ));
            }

            return especies;
        } catch (Exception e) {
            System.out.println(e.getMessage());

            return new ArrayList<>();
        }
    }
}
