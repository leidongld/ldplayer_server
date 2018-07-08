package com.example.ldplayer_server.controllers;

import com.example.ldplayer_server.IChannelRespository;
import com.example.ldplayer_server.beans.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChannelController {
    @Autowired
    private IChannelRespository iChannelRespository;

    /**
     * 获取全部频道信息
     *
     * @return
     */
    @RequestMapping(value = "/channels", method = RequestMethod.GET)
    public List<Channel> getChannelList() {
        return iChannelRespository.findAll();
    }
}
