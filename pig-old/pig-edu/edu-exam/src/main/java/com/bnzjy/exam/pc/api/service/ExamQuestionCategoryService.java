package com.bnzjy.exam.pc.api.service;

import com.bnzjy.exam.pc.api.common.req.ExamQuestionCategoryViewREQ;
import com.bnzjy.exam.pc.api.common.resq.ExamQuestionCategoryViewRESQ;
import com.bnzjy.exam.pc.api.dao.ExamQuestionCategoryDao;
import com.pig4cloud.pig.common.core.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamQuestionCategoryService {

	@Autowired
	private ExamQuestionCategoryDao examQuestionCategoryDao;

	public R<ExamQuestionCategoryViewRESQ> list(ExamQuestionCategoryViewREQ req) {
		return R.ok();
	}

}
