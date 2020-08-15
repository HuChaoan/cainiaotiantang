package com.bnzjy.group.pc.api.controller;

import com.bnzjy.group.pc.api.common.req.*;
import com.bnzjy.group.pc.api.common.resq.GroupPageRESQ;
import com.bnzjy.group.pc.api.common.resq.GroupViewRESQ;
import com.bnzjy.group.pc.api.dao.entity.BnzjGroup;
import com.bnzjy.group.pc.api.service.GroupService;
import com.pig4cloud.pig.common.core.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pc/eduservice/Group")
public class GroupController {

	@Autowired
	private GroupService groupService;

	//根据ID查询机构
	@PostMapping("/view")
	public R<GroupViewRESQ> getById(@RequestBody GroupViewREQ req) {
		return groupService.getById(req);
	}

	//查看全部机构
	@GetMapping("/list")
	public R list(@RequestParam(value = "currentPage") Integer currentPage,
					 @RequestParam(value = "pageSize") Integer pageSize){
		return groupService.list(currentPage, pageSize);
	}

	//新增机构
	@PostMapping("/save")
	public R save(@RequestBody GroupSaveREQ req) {
		return groupService.save(req);
	}

	//更新机构
	@PostMapping("/update")
	public R update(@RequestBody GroupUpadteREQ req) {
		return groupService.update(req);
	}

	//删除机构
	@DeleteMapping("/del")
	public R del(@RequestBody GroupDeleteREQ req) {
		return groupService.del(req);
	}

}

