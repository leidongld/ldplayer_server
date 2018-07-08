package com.example.ldplayer_server.controllers;

import com.example.ldplayer_server.IVideoRespository;
import com.example.ldplayer_server.beans.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class VideoController {
    @Autowired
    private IVideoRespository iVideoRespository;

    /**
     * 获取全部的视频信息
     *
     * @return
     */
    @RequestMapping(value = "/videos", method = RequestMethod.GET)
    public List<Video> getVideoList(){
        return iVideoRespository.findAll();
    }
}
