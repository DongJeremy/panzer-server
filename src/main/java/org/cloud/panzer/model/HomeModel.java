package org.cloud.panzer.model;

import java.util.List;

public class HomeModel {
    private List<HomeBanner> homeBannerList;
    private List<HomeProductSet> homeProductSetList;
    private List<Goods> goodsList;

    public HomeModel() {
    }

    public HomeModel(List<HomeBanner> homeBannerList, List<HomeProductSet> homeProductSetList, List<Goods> goodsList) {
        this.homeBannerList = homeBannerList;
        this.homeProductSetList = homeProductSetList;
        this.goodsList = goodsList;
    }

    public List<HomeBanner> getHomeBannerList() {
        return homeBannerList;
    }

    public void setHomeBannerList(List<HomeBanner> homeBannerList) {
        this.homeBannerList = homeBannerList;
    }

    public List<HomeProductSet> getHomeProductSetList() {
        return homeProductSetList;
    }

    public void setHomeProductSetList(List<HomeProductSet> homeProductSetList) {
        this.homeProductSetList = homeProductSetList;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }
}
