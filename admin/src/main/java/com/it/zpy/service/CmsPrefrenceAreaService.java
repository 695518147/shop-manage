package com.it.zpy.service;

import com.it.zpy.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 优选专区管理Service
 * Created by macro on 2018/6/1.
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优选专区
     */
    List<CmsPrefrenceArea> listAll();
}
