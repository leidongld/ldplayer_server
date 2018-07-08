package com.example.ldplayer_server;

import com.example.ldplayer_server.beans.Bann;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBannRespository extends JpaRepository<Bann, Integer> {
}
