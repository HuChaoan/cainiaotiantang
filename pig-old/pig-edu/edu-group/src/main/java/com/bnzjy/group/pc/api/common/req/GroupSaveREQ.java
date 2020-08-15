package com.bnzjy.group.pc.api.common.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class GroupSaveREQ implements Serializable {

	private static final long serialVersionUID = 3060537573589562824L;

	/**编码*/
	@Column(name = "code" )
	@ApiModelProperty(value = "编码")
	private String code;

	/**机构名称*/
	@Column(name = "gname" )
	@ApiModelProperty(value = "机构名称")
	private String gname;

	/**简称*/
	@Column(name = "sname" )
	@ApiModelProperty(value = "简称")
	private String sname;

	/**邮箱地址*/
	@Column(name = "email" )
	@ApiModelProperty(value = "邮箱地址")
	private String email;

	/**电话*/
	@Column(name = "phone" )
	@ApiModelProperty(value = "电话")
	private String phone;

	/**公司地址*/
	@Column(name = "address" )
	@ApiModelProperty(value = "公司地址")
	private String address;

	/**负责人*/
	@Column(name = "charge_name" )
	@ApiModelProperty(value = "负责人")
	private String chargename;

	/**负责人电话*/
	@Column(name = "charge_phone" )
	@ApiModelProperty(value = "负责人电话")
	private String chargephone;

	/**备注*/
	@Column(name = "remark" )
	@ApiModelProperty(value = "备注")
	private String remark;

	/**启用状态(1启用，0禁用)*/
	@Column(name = "enabled" )
	@ApiModelProperty(value = "启用状态(1启用，0禁用)")
	private Boolean enabled;

	/**创建人工号*/
	@Column(name = "creator" )
	@ApiModelProperty(value = "创建人工号")
	private String creator;

	/**创建时间*/
	@Column(name = "create_time" )
	@CreatedDate
	@ApiModelProperty(value = "创建时间")
	private Date createtime;

	/**修改人工号*/
	@Column(name = "modify_by" )
	@ApiModelProperty(value = "修改人工号")
	private String modifyby;

	/**修改时间*/
	@Column(name = "modify_time" )
	@ApiModelProperty(value = "修改时间")
	private Date modifytime;

	/**创建人*/
	@Column(name = "creator_name" )
	@ApiModelProperty(value = "创建人")
	private String creatorname;

	/**修改人*/
	@Column(name = "modify_name" )
	@ApiModelProperty(value = "修改人")
	private String modifyname;
}
