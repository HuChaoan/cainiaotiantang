package com.bnzjy.group.pc.api.common.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class GroupPageREQ implements Serializable {
	private static final long serialVersionUID = 5809716188537369214L;

	/**当前页*/
	@ApiModelProperty(value = "当前页", required = true)
	private int currentPage;

	/**每页记录数*/
	@ApiModelProperty(value = "每页记录数", required = true)
	private int pageSize;

}
