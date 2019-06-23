package org.spring.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboResposity;
import org.spring.springboot.dubbo.CityDubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author joham
 */
@Service(version = "1.0.0")
@Slf4j
public class CityDubboServiceImpl implements CityDubboService {

    @Autowired
    private CityDubboResposity cityDubboResposity;

    @Override
    public City findCityByName(String cityName) {
        log.info("i am server two");
        return cityDubboResposity.findByCityName(cityName);
    }
}
