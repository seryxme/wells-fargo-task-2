package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String portfolioName;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(String portfolioName, Client client) {
        this.portfolioName = portfolioName;
        this.client = client;
    }

    private Long getPortfolioId() {
        return portfolioId;
    }

    private String getPortfolioName() {
        return portfolioName;
    }

    private void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    private Client getClient() {
        return client;
    }

    private void setClient(Client client) {
        this.client = client;
    }
}
