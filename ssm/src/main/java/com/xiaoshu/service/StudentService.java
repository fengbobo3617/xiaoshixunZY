package com.xiaoshu.service;

import java.util.List;

import org.mybatis.generator.internal.util.StringUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.SchoolMapper;
import com.xiaoshu.dao.StudentMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.School;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.StudentExample;
import com.xiaoshu.entity.StudentExample.Criteria;
import com.xiaoshu.entity.StudentVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;

@Service
public class StudentService {

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
	private StudentMapper sm;
	public PageInfo<StudentVo> findUserPage(StudentVo studentVo, int pageNum, int pageSize, String ordername, String order) {
		PageHelper.startPage(pageNum, pageSize);
		ordername = StringUtil.isNotEmpty(ordername)?ordername:"userid";
		order = StringUtil.isNotEmpty(order)?order:"desc";
		StudentExample example=new StudentExample();
		example.setOrderByClause(ordername+" "+order);
		Criteria criteria = example.createCriteria();
		
		List<StudentVo> slist=sm.findStudent(studentVo);
		PageInfo<StudentVo> pageInfo = new PageInfo<StudentVo>(slist);
		return pageInfo;
	}
	@Autowired
	private SchoolMapper scm;
	public List<School> findSchool() {
		return scm.selectAll();
	}
	// 新增
	public void addUser(Student t) throws Exception {
			sm.insert(t);
		};

		// 修改
		public void updateUser(Student t) throws Exception {
			sm.updateByPrimaryKeySelective(t);
		};

		// 删除
		public void deleteUser(Integer id) throws Exception {
			sm.deleteByPrimaryKey(id);
		};
		// 通过用户名判断是否存在，（新增时不能重名）
		public Student existUserWithUserName(String sname) throws Exception {
			StudentExample example=new StudentExample();
			Criteria criteria = example.createCriteria();
			criteria.andSnameEqualTo(sname);
			
			List<Student> userList = sm.selectByExample(example);
			return userList.isEmpty()?null:userList.get(0);
		}
		public List<StudentVo> findStudent(StudentVo studentVo) {
			
			return sm.findStudent(studentVo);
		};


}
