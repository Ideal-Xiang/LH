package com.ug.web.controller;

import com.ug.common.vo.ResultVo;
import com.ug.common.vo.SeriesVo;
import com.ug.domain.Goods;
import com.ug.domain.Series;
import com.ug.service.GoodsImgService;
import com.ug.service.GoodsService;
import com.ug.service.SeriesImgService;
import com.ug.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SeriesController {

    @Autowired
    private SeriesService seriesService;
    @Autowired
    private SeriesImgService seriesImgService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private GoodsImgService goodsImgService;

    @RequestMapping("/allseries.do")
    @ResponseBody
    public ResultVo querySeries(Integer id) {
        System.out.println("接收id：》》》"+id);
        if (id != null) {
            //
            Series series = seriesService.selectById(id);
            series.setSeriesImgs(seriesImgService.queryById(id));
            //
            List<Goods> goodsList = goodsService.selectAll(id);
            for (Goods i : goodsList) {
                i.setGoodsImgs(goodsImgService.queryById(i.getId()));
            }
            //
            SeriesVo seriesVo = new SeriesVo();
            seriesVo.setSeries(series);
            seriesVo.setGoodsList(goodsList);
            System.out.println("seriesVo：》》》" + seriesVo);
            return ResultVo.setOK("查询成功", seriesVo);
        } else {
            return ResultVo.setERROR("查询失败", null);
        }
    }






}
