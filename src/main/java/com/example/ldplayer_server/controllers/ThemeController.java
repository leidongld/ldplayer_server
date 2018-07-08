package com.example.ldplayer_server.controllers;

import com.example.ldplayer_server.IThemeRespository;
import com.example.ldplayer_server.beans.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ThemeController {
    @Autowired
    private IThemeRespository iThemeRespository;

    /**
     * 获取全部主题信息
     *
     * @return
     */
    @RequestMapping(value = "/themes", method = RequestMethod.GET)
    public List<Theme> getThemeList() {
        return iThemeRespository.findAll();
    }
}
