package com.bnzjy.exam.pc.api.dao;

import com.bnzjy.exam.pc.api.dao.entity.BnzjExamQuestionCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamQuestionCategoryDao  extends JpaRepository<BnzjExamQuestionCategory,Long>, JpaSpecificationExecutor<BnzjExamQuestionCategory> {

	@Query(value = "select id from BnzjExamQuestionCategory where parent_id=?1",nativeQuery=true)
	List<BnzjExamQuestionCategory> findByParentId(Long id);

}
