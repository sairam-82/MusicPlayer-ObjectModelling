package com.crio.jukebox.services;

import java.util.Optional;
import com.crio.jukebox.entities.Song;

public interface ISongService {

    public void loadData(String fileName) throws Exception;

    public boolean existById(String song);

    public Optional<Song> getSongById(String string);
}
