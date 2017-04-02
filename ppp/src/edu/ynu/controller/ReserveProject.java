package edu.ynu.controller;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.ynu.entity.ReserveProjectEntity;
import edu.ynu.entity.SelectedCondition;
import edu.ynu.mapper.ReserveProjectMapper;
import edu.ynu.util.MybatisUtil;

//ÏîÄ¿¿â
@Controller
public class ReserveProject {
	@RequestMapping(value = "/rProject",method = RequestMethod.GET)
	public List<ReserveProjectEntity> listALL() {
        MybatisUtil mybatisUtil = new MybatisUtil("Mybatis.xml");
        SqlSession session = mybatisUtil.getSessionFactory().openSession();
        try{
            ReserveProjectMapper reserveProjectMapper = session.getMapper(ReserveProjectMapper.class);
            return reserveProjectMapper.listAll();
        }finally {
            session.close();
        }

	}

}
