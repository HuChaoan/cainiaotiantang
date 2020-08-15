package com.bnzjy.course.pc.api.service;

import com.bnzjy.course.pc.api.common.req.CourseInfoListREQ;
import com.bnzjy.course.pc.api.common.req.CourseInfoSaveREQ;
import com.bnzjy.course.pc.api.dao.CourseInfoDao;
import com.bnzjy.course.pc.api.dao.entity.BnzjCourseInfo;
import com.pig4cloud.pig.common.core.exception.CheckedException;
import com.pig4cloud.pig.common.core.util.R;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * @description:
 * @author: Mr.Luo
 * @create: 2020-06-05 14:54
 **/
@Service
public class CourseInfoService {

	@Autowired
	private CourseInfoDao courseInfoDao;

	// 通过id查询课程
	public R getById(Long id) {
		if(StringUtils.isEmpty(id)){
			throw new CheckedException("课程主键不能为空");
		}
		// 操作数据库
		BnzjCourseInfo courseInfo = courseInfoDao.getById(id);
		if(ObjectUtils.isEmpty(courseInfo)){
			throw new CheckedException("查询失败");
		}
		// 封装
		return R.ok(courseInfo);
	}

	// 添加课程
	public R save(CourseInfoSaveREQ req) {
		if(ObjectUtils.isEmpty(req)){
			throw new CheckedException("不能为空！");
		}
		BnzjCourseInfo bnzjCourseInfo = new BnzjCourseInfo();
		BeanUtils.copyProperties(req, bnzjCourseInfo);
		bnzjCourseInfo.setCreatetime(new Date());
		bnzjCourseInfo.setModifytime(new Date());
		BnzjCourseInfo courseInfo = courseInfoDao.save(bnzjCourseInfo);
		if(ObjectUtils.isEmpty(courseInfo)){
			throw new CheckedException("保存课程失败！");
		}
		return R.ok(courseInfo);
	}

	// 课程分页列表
	public R list(CourseInfoListREQ req) {
		if(ObjectUtils.isEmpty(req)){
			throw new CheckedException("分页参数不能为空！");
		}
		return R.ok();
	}

}
