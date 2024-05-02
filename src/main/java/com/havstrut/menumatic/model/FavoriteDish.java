package com.havstrut.menumatic.model;

import jakarta.persistence.*;


@Entity
@Table
public class FavoriteDish {

    @EmbeddedId
    private FavoriteDishId favoriteDishId;

    public FavoriteDish(FavoriteDishId favoriteDishId) {
        this.favoriteDishId = favoriteDishId;
    }

    public FavoriteDish() {
    }

    public FavoriteDishId getFavoriteDishId() {
        return favoriteDishId;
    }

    public void setFavoriteDishId(FavoriteDishId favoriteDishId) {
        this.favoriteDishId = favoriteDishId;
    }
}
