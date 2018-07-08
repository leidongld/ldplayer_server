package com.example.ldplayer_server.controllers;

import com.example.ldplayer_server.IArtistRespository;
import com.example.ldplayer_server.beans.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArtistController {
    @Autowired
    private IArtistRespository iArtistRespository;

    /**
     * 获取全部歌手信息
     *
     * @return
     */
    @RequestMapping(value = "/artists" , method = RequestMethod.GET)
    public List<Artist> getArtistList() {
        return iArtistRespository.findAll();
    }
}
