package com.bnzjy.course.pc.api.common.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: Mr.Luo
 * @create: 2020-06-06 11:33
 **/
@Data
public class CourseInfoListREQ implements Serializable {

	private static final long serialVersionUID = 169170033118556600L;

	private int currentPage = 1;

	private int pageSize = 10;

}
