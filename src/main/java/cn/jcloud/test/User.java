package cn.jcloud.test;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import cn.jcloud.constent.IDG;
import cn.jcloud.domain.BizDomain;

/** 
 * @author  蒋维 
 * @date 创建时间：2018年3月28日 下午6:01:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Entity
@Table(name="user")
@GenericGenerator(name="id",strategy = IDG.DISTRIBUTED_IDENTITY)
public class User extends BizDomain<Long> {
	private String userName;
	private String passWord;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
