package com.bnzjy.exam.pc.api.controller;

import com.bnzjy.exam.pc.api.common.req.ExamQuestionCategoryViewREQ;
import com.bnzjy.exam.pc.api.common.resq.ExamQuestionCategoryViewRESQ;
import com.bnzjy.exam.pc.api.service.ExamQuestionCategoryService;
import com.pig4cloud.pig.common.core.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pc/eduservice/examQuestionCategory")
public class ExamQuestionCategoryController {

	@Autowired
	private ExamQuestionCategoryService examQuestionCategoryService;

	//查看题库分类树形结构列表
	@PostMapping("/list")
	public R<ExamQuestionCategoryViewRESQ> list(@RequestBody ExamQuestionCategoryViewREQ req){
		return examQuestionCategoryService.list(req);
	}

}
