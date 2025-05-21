package com.patrones.playlist;

import java.util.ArrayList;
import java.util.List;

import com.patrones.factory.SongFactory;
import com.patrones.schemas.Song;

public class Playlist {

    private String name;
    private List<Song> songs = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

    public void addSong(String songname, String artist) {
        this.songs.add(SongFactory.CreateItem(songname, artist));
    }
    
    @Override
    public String toString() {
        String out = "\nPlaylist: > " + name;
        for (Song song: songs) {
            out += "\n\t" + song.toString();
        }
        return out;
    }
}
