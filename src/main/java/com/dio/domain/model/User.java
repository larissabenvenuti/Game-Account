package com.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private GameAccount gameAccount;

    @OneToOne(cascade = CascadeType.ALL)
    private GameCard card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<GameFeature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<GameNews> news;

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

    public GameAccount getGameAccount() {
        return gameAccount;
    }

    public void setGameAccount(GameAccount gameAccount) {
        this.gameAccount = gameAccount;
    }

    public GameCard getCard() {
        return card;
    }

    public void setCard(GameCard card) {
        this.card = card;
    }

    public List<GameFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<GameFeature> features) {
        this.features = features;
    }

    public List<GameNews> getNews() {
        return news;
    }

    public void setNews(List<GameNews> news) {
        this.news = news;
    }

}