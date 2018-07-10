package com.example.ldplayer_server.controllers;

import com.example.ldplayer_server.IChannelRespository;
import com.example.ldplayer_server.beans.Bann;
import com.example.ldplayer_server.beans.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    /**
     * 根据categoryId过滤Channel
     *
     * @param categoryId
     * @return
     */
    @RequestMapping(value = "/channels/{categoryId}", method = RequestMethod.GET)
    public List<Channel> getBannerList(@PathVariable("categoryId") Integer categoryId) {
        List<Channel> channelList = iChannelRespository.findAll();
        List<Channel> resList = new ArrayList<>();
        for (Channel channel : channelList) {
            if (channel.getCategoryId() == categoryId) {
                resList.add(channel);
            }
        }
        return resList;
    }
}
