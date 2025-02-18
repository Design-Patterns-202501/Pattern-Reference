package com.patrones;

import java.util.List;

import com.patrones.dao.ArticlesDAO;
import com.patrones.entities.Article;

public class App {
    public static void main(String[] args) {
        // Creation of DAO
        ArticlesDAO articlesDAO = new ArticlesDAO();

        List<Article> articles = articlesDAO.findAllProducts();
        Integer size = articles.size();

        System.out.println("Articles n ==> " + size.toString());
    }
}
