package com.example.ldplayer_server.controllers;

import com.example.ldplayer_server.IMusicRespository;
import com.example.ldplayer_server.beans.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MusicController {
    @Autowired
    private IMusicRespository iMusicRespository;

    /**
     * 获取全部的音乐信息
     *
     * @return
     */
    @RequestMapping(value = "/musics", method = RequestMethod.GET)
    public List<Music> getMusicList(){
        return iMusicRespository.findAll();
    }
}
