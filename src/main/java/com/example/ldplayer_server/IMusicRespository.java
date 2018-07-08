package com.example.ldplayer_server;


import com.example.ldplayer_server.beans.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMusicRespository extends JpaRepository<Music, Integer> {
}
