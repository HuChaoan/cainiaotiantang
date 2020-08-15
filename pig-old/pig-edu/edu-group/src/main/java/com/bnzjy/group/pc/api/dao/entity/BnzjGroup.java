package com.bnzjy.group.pc.api.dao.entity;

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
@ApiModel(value="BnzjGroup对象",description="机构对象BnzjGroup")
@Table ( name ="bnzj_group" )
public class BnzjGroup  implements Serializable {
	private static final long serialVersionUID =  6770651637340764936L;

	/**ID*/
   	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**编码*/
   	@Column(name = "code" )
	private String code;

	/**机构名称*/
   	@Column(name = "gname" )
	private String gname;

	/**简称*/
   	@Column(name = "sname" )
	private String sname;

	/**邮箱地址*/
   	@Column(name = "email" )
	private String email;

	/**电话*/
   	@Column(name = "phone" )
	private String phone;

	/**公司地址*/
   	@Column(name = "address" )
	private String address;

	/**负责人*/
   	@Column(name = "charge_name" )
	private String chargename;

	/**负责人电话*/
   	@Column(name = "charge_phone" )
	private String chargephone;

	/**备注*/
   	@Column(name = "remark" )
	private String remark;

	/**启用状态(1启用，0禁用)*/
   	@Column(name = "enabled" )
	private Boolean enabled;

	/**创建人工号*/
   	@Column(name = "creator" )
	private String creator;

	/**创建时间*/
   	@Column(name = "create_time" )
	@CreatedDate
	private Date createtime;

	/**修改人工号*/
   	@Column(name = "modify_by" )
	private String modifyby;

	/**修改时间*/
   	@Column(name = "modify_time" )
	private Date modifytime;

	/**创建人*/
   	@Column(name = "creator_name" )
	private String creatorname;

	/**修改人*/
   	@Column(name = "modify_name" )
	private String modifyname;

}
