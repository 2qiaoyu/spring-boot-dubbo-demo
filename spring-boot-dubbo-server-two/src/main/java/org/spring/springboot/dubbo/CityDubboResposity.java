package org.spring.springboot.dubbo;

import org.spring.springboot.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author joham
 */
@Repository
public interface CityDubboResposity extends JpaRepository<City, String> {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     */
    City findByCityName(String cityName);
}
