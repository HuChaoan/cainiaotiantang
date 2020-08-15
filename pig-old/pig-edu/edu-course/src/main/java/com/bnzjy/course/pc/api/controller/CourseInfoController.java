package com.bnzjy.course.pc.api.controller;

import com.bnzjy.course.pc.api.common.req.CourseInfoListREQ;
import com.bnzjy.course.pc.api.common.req.CourseInfoSaveREQ;
import com.bnzjy.course.pc.api.service.CourseInfoService;
import com.pig4cloud.pig.common.core.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @author: Mr.Luo
 * @create: 2020-06-05 14:35
 **/

@RestController
@RequestMapping("/pc/eduservice/courseInfo")
public class CourseInfoController {

	@Autowired
	private CourseInfoService courseInfoService;

	/**
	 * 通过id查询课程信息
	 */
	@GetMapping("/{id}")
	public R getById(@PathVariable Long id){

		return courseInfoService.getById(id);
	}
	/**
	 * 添加课程
	 */
	@PostMapping("/add")
	public R save(@RequestBody CourseInfoSaveREQ req){

		return courseInfoService.save(req);
	}
	/**
	 * 分页列表
	 */
	@PostMapping("/list")
	public R list(@RequestBody CourseInfoListREQ req){

		return courseInfoService.list(req);
	}
}
