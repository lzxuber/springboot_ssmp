package com.lzx.domain;
//lombok

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

//@Setter
//@Getter
//data 唯独没有生成构造方法
@Data
public class Book  implements Serializable{


    private static final long serialVersionUID = -1405103476647723097L;
    private Integer id;
    private String type;
    private String name;
    private String description;

}
