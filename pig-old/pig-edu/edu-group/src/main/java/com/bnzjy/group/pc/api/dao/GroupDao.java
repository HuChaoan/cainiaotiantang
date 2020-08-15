package com.bnzjy.group.pc.api.dao;

import com.bnzjy.group.pc.api.dao.entity.BnzjGroup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupDao extends JpaRepository<BnzjGroup,Long>, JpaSpecificationExecutor<BnzjGroup> {

	//根据id查询机构
	@Query(value = "from BnzjGroup where id = ?1")
	BnzjGroup getById(Long id);

	//查询所有机构
//	@Query(value = "select * from BnzjGroup limit ?1,?2",nativeQuery = true)
//	Page<BnzjGroup> findAll(Integer currentPage, Integer pageSize);
	Page<BnzjGroup> findAll(Pageable pageable);

}
