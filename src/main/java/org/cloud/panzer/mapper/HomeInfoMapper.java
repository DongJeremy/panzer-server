package org.cloud.panzer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.cloud.panzer.model.Goods;
import org.cloud.panzer.model.HomeBanner;
import org.cloud.panzer.model.HomeProductSet;

import java.util.List;

@Mapper
public interface HomeInfoMapper {
    List<HomeProductSet> selectAllProductSet();
    List<HomeBanner> selectAllBanner();
    List<Goods> selectAllGoods();
}
