package com.bnzjy.course.pc.api.dao;

import com.bnzjy.course.pc.api.dao.entity.BnzjCourseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: Mr.Luo
 * @create: 2020-06-05 14:58
 **/
@Repository
public interface CourseInfoDao extends JpaRepository<BnzjCourseInfo,Long>, JpaSpecificationExecutor<BnzjCourseInfo> {

	@Query(value = "from BnzjCourseInfo where id=?1")
	BnzjCourseInfo getById(Long id);

}
