package org.spring.springboot.dubbo;

import org.spring.springboot.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joham
 */
@RestController
public class CityDubboController {

    @Autowired
    private CityDubboConsumerService cityDubboConsumerService;

    @GetMapping("city")
    public City city(String cityName) {
        return cityDubboConsumerService.printCity(cityName);
    }
}
