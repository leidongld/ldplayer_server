package com.example.ldplayer_server;

import com.example.ldplayer_server.beans.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArtistRespository extends JpaRepository<Artist, Integer> {
}
