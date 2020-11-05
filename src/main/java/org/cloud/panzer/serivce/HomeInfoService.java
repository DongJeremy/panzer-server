package org.cloud.panzer.serivce;

import org.cloud.panzer.model.Goods;
import org.cloud.panzer.model.HomeBanner;
import org.cloud.panzer.model.HomeShortcut;

import java.util.List;

public interface HomeInfoService {
    List<HomeShortcut> selectAllShortcut();
    List<HomeBanner> selectAllBanner();
    List<Goods> selectAllGoods();
}
