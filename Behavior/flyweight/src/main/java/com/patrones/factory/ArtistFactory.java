package com.patrones.factory;

import java.util.HashMap;
import java.util.Map;

import com.patrones.schemas.Artist;

public class ArtistFactory {

    public static boolean enableFlyweight = true;
    private static final Map<String, Artist> artists = new HashMap<>();
    private static Long sequence = 0L;
    
    public static Artist CreateItem(String name) {
        if (enableFlyweight && artists.containsKey(name)) {
            return artists.get(name);
        } else {
            Artist nwArtist = new Artist(++sequence, name, "Colombia");
            artists.put(name, nwArtist);
            return nwArtist;
        }
    }
}
