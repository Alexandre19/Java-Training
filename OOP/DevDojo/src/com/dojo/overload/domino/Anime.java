package com.dojo.overload.domino;

public class Anime {

    private String name;

    private String type;
    private int episodes;

    public void print(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName(){

        return this.name;
    }
    public void setType(String type){

        this.type = type;
    }

    public String getType(){

        return this.type;
    }

    public void setEpisodes(int episodes){

        this.episodes = episodes;
    }

    public int getEpisodes(){

        return this.episodes;
    }
}
