/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dal.ModuloConexao;
import java.sql.*;
import java.util.ArrayList;
import model.Animal;
import model.Especie;

/**
 *
 * @author srlucas
 */
public class AnimalController {
    Connection conexao = null;
    PreparedStatement preparedStmt = null;
    ResultSet resultSet = null;

    public AnimalController() {
        this.conexao = ModuloConexao.conector();
    }
    
    public void criarAnimal(Animal animal) {
        String sql = "INSERT INTO animals ("
                + "especieCod," +
                  "tempoDeVida," +
                  "detalhes," +
                  "habitat"
                + ") VALUES ("
                + "?, ?, ?, ?"
                + ")";
        
        try {
            preparedStmt = this.conexao.prepareStatement(sql);
            
            preparedStmt.setString(1, animal.getEspecie().getDescricao());
            preparedStmt.setString(2, animal.getTempoDeVida());
            preparedStmt.setString(3, animal.getDetalhes());
            preparedStmt.setString(4, animal.getHabitatNatural());
            
            preparedStmt.executeUpdate();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList<Animal> listAnimal() {
        String sql = "SELECT codigo, especieCod, tempoDeVida, detalhes, habitat FROM animals";
        
        try {
            preparedStmt = this.conexao.prepareStatement(sql);
            
            resultSet = preparedStmt.executeQuery();
            
            int size = resultSet.getFetchSize();
            
            ArrayList<Animal> animals = new ArrayList<>();
            
            while(resultSet.next()) {
                Animal animal = new Animal(
                    new Especie(resultSet.getString("especieCod")),
                    resultSet.getString("tempoDeVida"),
                    resultSet.getString("detalhes"),
                    resultSet.getString("habitat")
                );
                
                animal.setCodigo(resultSet.getInt("codigo"));
                
                animals.add(animal);
            }
            
            return animals;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
            return new ArrayList<>();
        }
    }
    
    public void updateAnimal(Animal animal) {
        String sql = "UPDATE animals SET especieCod=?, tempoDeVida=?, detalhes=?, habitat=? "
                + "WHERE codigo = ?";
        
        try {
            preparedStmt = this.conexao.prepareStatement(sql);
            
            preparedStmt.setString(1, animal.getEspecie().getDescricao());
            preparedStmt.setString(2, animal.getTempoDeVida());
            preparedStmt.setString(3, animal.getDetalhes());
            preparedStmt.setString(4, animal.getHabitatNatural());
            preparedStmt.setInt(5, animal.getCodigo());
            
            preparedStmt.executeUpdate();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteAnimal(int animalCod) {
        String sql = "DELETE FROM animals WHERE codigo = ?";
        
        try {
            preparedStmt = this.conexao.prepareStatement(sql);
            
            preparedStmt.setInt(1, animalCod);
            
            preparedStmt.executeUpdate();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
