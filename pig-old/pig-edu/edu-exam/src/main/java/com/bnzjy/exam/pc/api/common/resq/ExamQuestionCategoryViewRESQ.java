package com.bnzjy.exam.pc.api.common.resq;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class ExamQuestionCategoryViewRESQ implements Serializable {
	private static final long serialVersionUID = 7492075925905581786L;

	/**分类ID*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/**上级分类*/
	@Column(name = "parent_id" )
	private Long parentid;

	/**分类名称*/
	@Column(name = "category_name" )
	private String categoryname;

	/**是否删除  0-未删除 1-已删除*/
	@Column(name = "is_delete" )
	private Boolean isdelete;

	/**创建人*/
	@Column(name = "creator" )
	private Long creator;

	/**创建时间*/
	@Column(name = "create_time" )
	@CreatedDate
	private Date createtime;

	/**修改人*/
	@Column(name = "modify_by" )
	private Long modifyby;

	/**修改时间*/
	@Column(name = "modify_time" )
	private Date modifytime;

	/**创建人名称*/
	@Column(name = "creator_name" )
	private String creatorname;

	/**修改人名称*/
	@Column(name = "modify_name" )
	private String modifyname;

}
