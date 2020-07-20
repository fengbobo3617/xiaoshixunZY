package com.xiaoshu.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.PcompanyMapper;
import com.xiaoshu.dao.PpersonMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Pcompany;
import com.xiaoshu.entity.Pperson;
import com.xiaoshu.entity.PpersonExample;
import com.xiaoshu.entity.PpersonExample.Criteria;
import com.xiaoshu.entity.PpersonVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;

@Service
public class PpersonService {

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

	
	
	}*/
	@Autowired
	private PpersonMapper pm;
	public PageInfo<PpersonVo> findUserPage(PpersonVo ppersonVo, int pageNum, int pageSize, String ordername, String order) {
		PageHelper.startPage(pageNum, pageSize);
		ordername = StringUtil.isNotEmpty(ordername)?ordername:"userid";
		order = StringUtil.isNotEmpty(order)?order:"desc";
		PpersonExample example=new PpersonExample();
		example.setOrderByClause(ordername+" "+order);
		Criteria criteria = example.createCriteria();
			List<PpersonVo> userList=pm.findAllPperson(ppersonVo);
		PageInfo<PpersonVo> pageInfo = new PageInfo<PpersonVo>(userList);
		return pageInfo;
	}
	// 新增
		public void addPperson(Pperson t) throws Exception {
			pm.insert(t);
		};

		// 修改
		public void updatePperson(Pperson t) throws Exception {
			pm.updateByPrimaryKeySelective(t);
		};

		// 删除
		public void deleteUser(Integer id) throws Exception {
			pm.deleteByPrimaryKey(id);
		}
		@Autowired
		private PcompanyMapper pcm;
		public List<Pcompany> findAllName() {
			return pcm.selectAll();
		}
		/*// 通过角色判断是否存在
		public Pperson existUserWithRoleId(Integer pid) throws Exception {
			PpersonExample example=new PpersonExample();
			Criteria criteria = example.createCriteria();
			
			criteria.andPidEqualTo(pid);
			List<Pperson> userList = pm.selectByExample(example);
			return userList.isEmpty()?null:userList.get(0);
		}*/
		// 通过用户名判断是否存在，（新增时不能重名）
		public Pperson existPpersonWithpName(String pName) throws Exception {
			PpersonExample example=new PpersonExample();
			Criteria criteria = example.createCriteria();
			
			criteria.andPNameEqualTo(pName);
			List<Pperson> userList = pm.selectByExample(example);
			return userList.isEmpty()?null:userList.get(0);
		}
		public List<PpersonVo> findPperson(PpersonVo ppersonVo) {
			return pm.findPperson(ppersonVo);
		};



}
