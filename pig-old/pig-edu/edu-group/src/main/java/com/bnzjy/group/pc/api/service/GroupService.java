package com.bnzjy.group.pc.api.service;

import com.bnzjy.group.pc.api.common.req.*;
import com.bnzjy.group.pc.api.common.resq.GroupPageRESQ;
import com.bnzjy.group.pc.api.common.resq.GroupViewRESQ;
import com.bnzjy.group.pc.api.dao.GroupDao;
import com.bnzjy.group.pc.api.dao.entity.BnzjGroup;
import com.pig4cloud.pig.common.core.exception.CheckedException;
import com.pig4cloud.pig.common.core.util.BeanUtil;
import com.pig4cloud.pig.common.core.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
public class GroupService {

	@Autowired
	private GroupDao groupDao;

	// 通过id查询机构
	public R<GroupViewRESQ> getById(GroupViewREQ req) {
		Long id = req.getId();
		if (StringUtils.isEmpty(id)) {
			throw new CheckedException("机构主键不能为空");
		}
		// 操作数据库
		BnzjGroup bnzjGroup = groupDao.getById(id);
		if (ObjectUtils.isEmpty(bnzjGroup)) {
			throw new CheckedException("查询失败");
		}
		return R.ok(BeanUtil.copyProperties(bnzjGroup, GroupViewRESQ.class));
	}

	// 分页查询所有机构
	public R list(Integer currentPage, Integer pageSize) {
		PageRequest pageRequest = PageRequest.of(currentPage-1,pageSize);
		Page<BnzjGroup> page = groupDao.findAll(pageRequest);
		return R.ok(page);
	}

	// 新增机构
	public R save(GroupSaveREQ req) {
		BnzjGroup bnzjGroup = BeanUtil.copyProperties(req, BnzjGroup.class);
		if (ObjectUtils.isEmpty(bnzjGroup)) {
			throw new CheckedException("保存失败！");
		}
		return R.ok(groupDao.save(bnzjGroup), "保存成功！");
	}

	// 更新机构
	public R update(GroupUpadteREQ req) {
		BnzjGroup bnzjGroup = BeanUtil.copyProperties(req, BnzjGroup.class);
		if (ObjectUtils.isEmpty(bnzjGroup)) {
			throw new CheckedException("更新失败！");
		}
		return R.ok(groupDao.save(bnzjGroup), "更新成功！");
	}

	// 删除机构
	public R del(GroupDeleteREQ req) {
		BnzjGroup bnzjGroup = BeanUtil.copyProperties(req, BnzjGroup.class);
		groupDao.deleteById(bnzjGroup.getId());
		if (!ObjectUtils.isEmpty(bnzjGroup)) {
			throw new CheckedException("删除失败！");
		}
		return R.ok("删除成功！");
	}

}
