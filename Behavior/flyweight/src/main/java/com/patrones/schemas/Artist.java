package com.patrones.schemas;

public class Artist {

    private Long id;
    private String name;
    private String originCountry;
    private byte[] mem = new byte[10000];

    public Artist(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.originCountry = country;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

}
