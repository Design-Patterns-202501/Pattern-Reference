package com.patrones.entities;

public class Article {
    private Long id;
    private String name;
    private Double value;

    public Article(Long id, String name, Double value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public Article() {}

    public Long getId() { return this.id; };
    public void setId(Long id) { this.id = id; };

    public String getName() { return this.name; };
    public void setName(String name) { this.name = name; };

    public Double getValue() { return this.value; };
    public void setValue(Double value) { this.value = value; };

    @Override
    public String toString() {
        return "Articulo id: " + this.id.toString();
    }
};
