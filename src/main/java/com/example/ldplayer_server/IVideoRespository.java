package com.example.ldplayer_server;

import com.example.ldplayer_server.beans.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVideoRespository extends JpaRepository<Video, Integer> {
}
