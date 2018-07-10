package com.example.ldplayer_server.controllers;

import com.example.ldplayer_server.IBannRespository;
import com.example.ldplayer_server.beans.Bann;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BannController {
    @Autowired
    private IBannRespository iBannRespository;

    /**
     * 获取全部轮播图信息
     *
     * @return
     */
    @RequestMapping(value = "/banners", method = RequestMethod.GET)
    public List<Bann> getBannerList() {
        return iBannRespository.findAll();
    }

    /**
     * 根据categoryId过滤Banner
     *
     * @param categoryId
     * @return
     */
    @RequestMapping(value = "/banners/{categoryId}", method = RequestMethod.GET)
    public List<Bann> getBannerList(@PathVariable("categoryId") Integer categoryId) {
        List<Bann> bannerList = iBannRespository.findAll();
        List<Bann> resList = new ArrayList<>();
        for (Bann banner : bannerList) {
            if (banner.getCategoryId() == categoryId) {
                resList.add(banner);
            }
        }
        return resList;
    }
}
