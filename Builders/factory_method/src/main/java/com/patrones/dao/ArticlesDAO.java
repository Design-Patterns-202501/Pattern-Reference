package com.patrones.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.patrones.entities.Article;
import com.patrones.factory.DatabaseFactory;
import com.patrones.factory.interfaces.IAdapter;

public class ArticlesDAO {
        
    private IAdapter dbAdapter;

    public ArticlesDAO() {
        dbAdapter = DatabaseFactory.getDefaultAdapter();
    }

    public List<Article> findAllProducts() {
        List<Article> products = new ArrayList<Article>();

        try (Connection con = dbAdapter.getConnection()) {
            PreparedStatement statement = con.prepareStatement("SELECT * FROM articles");
            ResultSet results = statement.executeQuery();

            while (results.next()) {
                products.add(new Article(
                            results.getLong(1),
                            results.getString(2),
                            results.getDouble(3)
                            ));
            }

            return products;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean SaveProduct(Article article) {
        try (Connection con = dbAdapter.getConnection()) {
            PreparedStatement statement = con.prepareStatement("INSERT INTO articles VALUES (?, ?,?)");

            statement.setLong(1, article.getId());
            statement.setString(2, article.getName());
            statement.setDouble(3, article.getValue());

            statement.executeUpdate();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
};
