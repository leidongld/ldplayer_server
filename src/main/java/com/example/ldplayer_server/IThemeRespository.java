package com.example.ldplayer_server;

import com.example.ldplayer_server.beans.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IThemeRespository extends JpaRepository<Theme, Integer> {
}
