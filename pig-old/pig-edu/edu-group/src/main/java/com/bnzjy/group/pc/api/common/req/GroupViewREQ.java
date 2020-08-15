package com.bnzjy.group.pc.api.common.req;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class GroupViewREQ implements Serializable {
	private static final long serialVersionUID = 5809716188537369214L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
}
