package com.patrones.schemas;

public class Client {

    private Long id;
    private String name;
    private double balance;
    private String state;

    public Client() {}

    public Client(Long id, String name, double balance, String state) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.state = state;
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
    
}
