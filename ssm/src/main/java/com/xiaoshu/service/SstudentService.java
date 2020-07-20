package com.xiaoshu.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.SschoolMapper;
import com.xiaoshu.dao.SstudentMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Sschool;
import com.xiaoshu.entity.Sstudent;
import com.xiaoshu.entity.SstudentExample;
import com.xiaoshu.entity.SstudentExample.Criteria;
import com.xiaoshu.entity.SstudentVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;

@Service
public class SstudentService {

	/*@Autowired
	UserMapper userMapper;

	// 查询所有
	public List<User> findUser(User t) throws Exception {
		return userMapper.select(t);
	};

	// 数量
	public int countUser(User t) throws Exception {
		return userMapper.selectCount(t);
	};

	// 通过ID查询
	public User findOneUser(Integer id) throws Exception {
		return userMapper.selectByPrimaryKey(id);
	};

	

	// 登录
	public User loginUser(User user) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andPasswordEqualTo(user.getPassword()).andUsernameEqualTo(user.getUsername());
		List<User> userList = userMapper.selectByExample(example);
		return userList.isEmpty()?null:userList.get(0);
	};

	

	// 通过角色判断是否存在
	public User existUserWithRoleId(Integer roleId) throws Exception {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleidEqualTo(roleId);
		List<User> userList = userMapper.selectByExample(example);
		return userList.isEmpty()?null:userList.get(0);
	}*/
	@Autowired
	private SstudentMapper ssm;
	public PageInfo<SstudentVo> findUserPage(SstudentVo sstudentVo, int pageNum, int pageSize, String ordername, String order) {
		PageHelper.startPage(pageNum, pageSize);
		ordername = StringUtil.isNotEmpty(ordername)?ordername:"userid";
		order = StringUtil.isNotEmpty(order)?order:"desc";
		SstudentExample example=new SstudentExample();
		
		example.setOrderByClause(ordername+" "+order);
		Criteria criteria = example.createCriteria();
		
		List<SstudentVo> list=ssm.findSstudent(sstudentVo);
		PageInfo<SstudentVo> pageInfo = new PageInfo<SstudentVo>(list);
		return pageInfo;
	}
	@Autowired
	private SschoolMapper ssm2;
	
	
	public List<Sschool> findSschool() {
		return ssm2.selectAll();
	}
	// 新增
		public void addUser(SstudentVo t) throws Exception {
			ssm.insert(t);
		};

		// 修改
		public void updateUser(SstudentVo t) throws Exception {
			ssm.updateByPrimaryKeySelective(t);
		};

		// 删除
		public void deleteUser(Integer id) throws Exception {
			ssm.deleteByPrimaryKey(id);
		};
		// 通过用户名判断是否存在，（新增时不能重名）
		public Sstudent existUserWithUserName(String sname) throws Exception {
			SstudentExample example=new SstudentExample();
			Criteria criteria = example.createCriteria();
			criteria.andSnameEqualTo(sname);
			List<Sstudent> userList =ssm.selectByExample(example);
			return userList.isEmpty()?null:userList.get(0);
		}
		public List<SstudentVo> findSstudent(SstudentVo sstudentVo) {
			
			return ssm.findSstudent(sstudentVo);
		}
		//查询报表
		public List<SstudentVo> getEcharts() {
			return ssm.getEcharts();
		}
		


}
