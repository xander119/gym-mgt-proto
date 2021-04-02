package cn.gym.mgt.gymmgtproto.dto;

import cn.gym.mgt.gymmgtproto.comon.RequestPage;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class StaticDataRequestBody extends RequestPage implements Serializable {

    @ApiModelProperty(value = "类型", required = false)
    private String typeCode;

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
}
