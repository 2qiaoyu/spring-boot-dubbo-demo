package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.spring.springboot.domain.City;
import org.springframework.stereotype.Component;

/**
 * @author joham
 */
@Component
public class CityDubboConsumerService {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.server}",
            registry = "${dubbo.registry.address}",
            retries = -1,
            check = false,
            loadbalance = "roundrobin")
    CityDubboService cityDubboService;

    public City printCity(String cityName) {
        City city = cityDubboService.findCityByName(cityName);
        return city;
    }
}
