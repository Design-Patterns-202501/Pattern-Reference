package com.patrones.schemas;

public class Song {

    private Long id;
    private String name;
    private byte[] songBytes = new byte[1000000];
    private Artist artist;

    public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Song(Long id, String name, Artist artist) {
        this.id = id;
        this.name = name;
        this.artist = artist;
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
	public byte[] getSongBytes() {
		return songBytes;
	}
	public void setSongBytes(byte[] songBytes) {
		this.songBytes = songBytes;
	}

    @Override
    public String toString() {
        return "Song{ " + name + " id= " + id + "}";
    }
}
