package com.bnzjy.group.pc.api.common.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class GroupDeleteREQ implements Serializable {
	private static final long serialVersionUID = -6256391657735362769L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(value = "id")
	private Long id;
}
