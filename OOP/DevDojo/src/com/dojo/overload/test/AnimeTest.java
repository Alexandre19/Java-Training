package com.dojo.overload.test;

import com.dojo.overload.domino.Anime;

public class AnimeTest {
    public static void main(String[] args) {

        Anime anime = new Anime();

        anime.setType("TV");
        anime.setEpisodes(12);
        anime.print();
    }
}
