package org.cloud.panzer.serivce;

import org.cloud.panzer.model.Goods;
import org.cloud.panzer.model.HomeBanner;
import org.cloud.panzer.model.HomeProductSet;

import java.util.List;

public interface HomeInfoService {
    List<HomeProductSet> selectAllProductSet();
    List<HomeBanner> selectAllBanner();
    List<Goods> selectAllGoods();
}
