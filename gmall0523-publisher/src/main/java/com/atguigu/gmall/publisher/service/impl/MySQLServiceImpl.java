package com.atguigu.gmall.publisher.service.impl;

import com.atguigu.gmall.publisher.mapper.TrademarkStatMapper;
import com.atguigu.gmall.publisher.service.MySQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MySQLServiceImpl implements MySQLService {

    @Autowired
    TrademarkStatMapper trademarkStatMapper;


    @Override
    public List<Map> getTrademardStat(String startDate, String endDate, int topN) {
        return trademarkStatMapper.selectTradeSum(startDate,endDate,topN);
    }
}
