package com.example.ldplayer_server;

import com.example.ldplayer_server.beans.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IChannelRespository extends JpaRepository<Channel, Integer> {
}
