package com.crio.jukebox.entities;

public class Song extends BaseEntity {
    private String name;
    private String gener;
    private String albumName;
    private String featuredArtist;

    public Song(String id, String name, String gener, String albumName, String featuredArtist) {
        this.id = id;
        this.name = name;
        this.gener = gener;
        this.albumName = albumName;
        this.featuredArtist = featuredArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getFeaturedArtist() {
        return featuredArtist;
    }

    public void setFeaturedArtist(String featuredArtist) {
        this.featuredArtist = featuredArtist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public String toString() {
        return "Song - " + this.name + "\n" + "Album - " + this.albumName + "\n" + "Artists - "
                + this.featuredArtist;
    }
}
