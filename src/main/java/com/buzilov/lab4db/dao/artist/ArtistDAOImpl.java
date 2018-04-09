package com.buzilov.lab4db.dao.artist;

import com.buzilov.lab4db.datastorage.DataStorageFake;
import com.buzilov.lab4db.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArtistDAOImpl implements ArtistDAO{
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Artist insertArtist(Artist artist) {
        dataStorage.getArtists().add(artist);
        return artist;
    }

    @Override
    public Artist getArtist(int id) {
        return dataStorage.getArtists().stream()
                .filter(el -> el.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public Artist updateArtist(Artist artist) {
        for(Artist a: dataStorage.getArtists())
        {
            if(a.getId() == artist.getId())
            {
                a.setName(artist.getName());
                break;
            }
        }
        return artist;
    }

    @Override
    public Artist deleteArtist(int id) {
        Artist artist = dataStorage.getArtists()
                .stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .get();
        dataStorage.getArtists().remove(artist);
        return artist;
    }

    @Override
    public List<Artist> getAll() {
        return dataStorage.getArtists();
    }
}
