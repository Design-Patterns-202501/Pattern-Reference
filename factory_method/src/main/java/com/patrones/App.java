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

        System.out.println("\nArticles n ==> " + size.toString());

        boolean confirm  = articlesDAO.SaveProduct(
                new Article(new Long(1), "Articulo", 3.21)
                );

        if (!confirm) {
            System.out.println("Something went bad");
            return;
        }

        articles = articlesDAO.findAllProducts();
        size = articles.size();

        System.out.println("\nArticles n ==> " + size.toString());
    }
}
