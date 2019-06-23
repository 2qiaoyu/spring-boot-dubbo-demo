package org.spring.springboot.domain;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

/**
 * 城市实体类
 *
 * @author joham
 */
@Data
@Table(name = "city")
@Entity
public class City implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 城市编号
     */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    /**
     * 省份编号
     */
    @Column(name = "province_id")
    private Long provinceId;

    /**
     * 城市名称
     */
    @Column(name = "city_name")
    private String cityName;

    /**
     * 描述
     */
    @Column(name = "description")
    private String description;
}
