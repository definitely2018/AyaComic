package com.example.aya.demo.service.impl;

import com.example.aya.demo.dao.ComicDetail;
import com.example.aya.demo.dao.impl.ComicDetailImpl;
import com.example.aya.demo.service.ComicDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Aya
 */
@Service
public class ComicDetailServiceImpl implements ComicDetailService {
    @Autowired
    private ComicDetailImpl comicDetailImpl;

    @Override
    public ComicDetail saveComicDetail(ComicDetail comicDetail) {
        return comicDetailImpl.save(comicDetail);
    }
}
