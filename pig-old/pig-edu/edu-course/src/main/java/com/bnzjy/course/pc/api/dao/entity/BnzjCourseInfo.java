package com.bnzjy.course.pc.api.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Data;
import lombok.ToString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.CreatedDate;
import java.util.Date;

@Data
@Entity
@ApiModel(value="",description="")
@Table ( name ="bnzj_course_info" )
public class BnzjCourseInfo implements Serializable {

	private static final long serialVersionUID = -3966052985976857395L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**标题*/
	@Column(name = "title" )
	private String title;

	/**课程类型(关联fb_sys_dictionary表主键id)*/
	@Column(name = "course_type" )
	private Long coursetype;

	/**推荐值*/
	@Column(name = "recommend_num" )
	private Long recommendnum;

	/**分数*/
	@Column(name = "score" )
	private Long score;

	/**学分*/
	@Column(name = "credit" )
	private Long credit;

	/**简介*/
	@Column(name = "remark" )
	private String remark;

	/**封面图片*/
	@Column(name = "picture_url" )
	private String pictureurl;

	/**课程文件*/
	@Column(name = "course_file" )
	private String coursefile;

	/**目录id*/
	@Column(name = "category_id" )
	private Long categoryid;

	/**课程时间(单位：分钟)*/
	@Column(name = "course_time" )
	private Long coursetime;

	/**直播课程状态：默认0未开始；1直播中；2已结束；3录制完成；4转码完成*/
	@Column(name = "live_status" )
	private Integer livestatus;

	/**直播人id*/
	@Column(name = "live_person_id" )
	private Long livepersonid;

	/**直播开始时间（编辑时定的开播时间）*/
	@Column(name = "live_start_time" )
	private Date livestarttime;

	/**直播真实开始时间*/
	@Column(name = "live_real_start_time" )
	private Date liverealstarttime;

	/**是否删除 0否 1是*/
	@Column(name = "is_delete" )
	private String isdelete;

	/**是否允许下载 0否 1是*/
	@Column(name = "is_download" )
	private String isdownload;

	/**是否看完 0否 1是*/
	@Column(name = "is_over" )
	private String isover;

	/**直播观看人数*/
	@Column(name = "viewers_count" )
	private Long viewerscount;

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
