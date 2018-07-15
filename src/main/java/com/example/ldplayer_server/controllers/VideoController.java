package com.example.ldplayer_server.controllers;

import com.example.ldplayer_server.IVideoRespository;
import com.example.ldplayer_server.beans.Bann;
import com.example.ldplayer_server.beans.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    /**
     * 根据categoryId过滤Video
     *
     * @param themeId
     * @return
     */
    @RequestMapping(value = "/videos/{themeId}", method = RequestMethod.GET)
    public List<Video> getVideoList(@PathVariable("themeId") Integer themeId) {
        List<Video> videoList = iVideoRespository.findAll();
        List<Video> resList = new ArrayList<>();
        for (Video video : videoList) {
            if (video.getThemeId() == themeId) {
                resList.add(video);
            }
        }
        return resList;
    }
}
