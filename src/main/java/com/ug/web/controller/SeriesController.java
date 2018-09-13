package com.ug.web.controller;

import com.ug.common.vo.ResultVo;
import com.ug.common.vo.UserVo;
import com.ug.domain.*;
import com.ug.service.*;
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
    @Autowired
    private ReplyService replyService;
    @Autowired
    private UserService userService;
    @Autowired
    private SizeService sizeService;
    @Autowired
    private ColorService colorService;
    //获取系列ID查询出关于这个系列的所有信息
    @RequestMapping("/allseries.do")
    @ResponseBody
    public ResultVo querySeries(Integer id) {
        System.out.println("接收id：》》》"+id);
        if (id != null) {
            //用Integer接收在if条件中用null判断，是否接收成功？
            Series series = seriesService.selectById(id);
            series.setSeriesImgs(seriesImgService.queryById(id));
            //
            UserVo userVo = new UserVo();
            //通过系列ID查询所有该系列商品
            List<Goods> goodsList = goodsService.selectAll(id);
            System.out.println("系列商品："+goodsList);
            //List<GoodSize> goodSizes=goodSizeService.selectByGid(id);
            //System.out.println("商品对应的尺寸："+goodSizes);
            //根据商品名称搜索查询出该商品所有的信息
            //goodsService.searchAll()
            //Goods goods=goodsService.searchAll()
           /* int b=1;
            //遍历该系列商品
            for (Goods i:goodsList) {
                b++;
                //根据商品名称搜索查询出该商品所有的信息
                List<Goods> searchAll = goodsService.searchAll(i.getGdname());

            }*/
            int a= 1;
            //遍历该系列商品
            for (Goods i : goodsList) {
                System.out.println("执行次数："+a);
                a++;

                //通过商品ID查询该商品所有图片
                i.setGoodsImgs(goodsImgService.queryById(i.getId()));

                //通过商品ID查询出该商品所有尺寸
                List<Size> sizes =  sizeService.selectByGid(i.getId());
                System.out.println("商品尺寸："+sizes);
                i.setSizes(sizes);

                //通过商品ID查询出该商品所有颜色【颜色对应的图片】
                List<GoodsColorV> goodsColorVS = colorService.queryCByGid(i.getId());
                System.out.println("商品颜色："+goodsColorVS);
                i.setColors(goodsColorVS);

                //通过商品ID随机出该商品中的一条评价
                Reply reply = replyService.slectByGid(i.getId());
                System.out.println("随机的一条评价："+reply);
                //通过评价中的用户ID查询用户信息
                User user = userService.selectByUid(reply.getUid());
                userVo.setId(user.getId());
                userVo.setUsername(user.getUsername());
                userVo.setHeadimg(user.getHeadimg());
                userVo.setStar(reply.getStar());
                userVo.setComment(reply.getComment());
                userVo.setDatetime(reply.getDatetime());
                System.out.println("用户评论："+userVo);
                i.setUserVo(userVo);
            }

            series.setGoodsList(goodsList);
            //
            System.out.println("seriesVo：》》》" + series);
            return ResultVo.setOK("查询成功", series);
        } else {
            return ResultVo.setERROR("查询失败", null);
        }
    }
    //根据商品名称搜索查询出该商品所有的信息
    @RequestMapping("searchall.do")
    @ResponseBody
    private ResultVo searchAll(String gdname){
        System.out.println("接收gdname:》》》"+gdname);
        if (gdname!=null){
            UserVo userVo = new UserVo();
            List<Goods> searchAll = goodsService.searchAll(gdname);
            System.out.println("搜索查询商品"+searchAll);
            int a= 1;
            //遍历该系列商品
            for (Goods i : searchAll) {
                System.out.println("执行次数："+a);
                a++;

                //通过商品ID查询该商品所有图片
                i.setGoodsImgs(goodsImgService.queryById(i.getId()));

                //通过商品ID查询出该商品所有尺寸
                List<Size> sizes =  sizeService.selectByGid(i.getId());
                System.out.println("商品尺寸："+sizes);
                i.setSizes(sizes);

                //通过商品ID查询出该商品所有颜色【颜色对应的图片】
                List<GoodsColorV> goodsColorVS = colorService.queryCByGid(i.getId());
                System.out.println("商品颜色："+goodsColorVS);
                i.setColors(goodsColorVS);

                //通过商品ID随机出该商品中的一条评价
                Reply reply = replyService.slectByGid(i.getId());
                System.out.println("随机的一条评价："+reply);
                //通过评价中的用户ID查询用户信息
                User user = userService.selectByUid(reply.getUid());
                userVo.setId(user.getId());
                userVo.setUsername(user.getUsername());
                userVo.setHeadimg(user.getHeadimg());
                userVo.setStar(reply.getStar());
                userVo.setComment(reply.getComment());
                userVo.setDatetime(reply.getDatetime());
                System.out.println("用户评论："+userVo);
                i.setUserVo(userVo);
            }
            return ResultVo.setOK("查询成功", searchAll);
        }else {
            return ResultVo.setERROR("查询失败", null);
        }
    }

    //获取商品id查询出有关这个商品的所有评价
    @RequestMapping("alluservo.do")
    @ResponseBody
    public ResultVo allGdReply(Integer id) {
        System.out.println("接收id：》》》"+id);
        if (id != null) {
            List<UserVo> userVoList = replyService.queryById(id);

            return ResultVo.setOK("查询成功", userVoList);
        } else {
            return ResultVo.setERROR("查询失败", null);
        }
    }


}
