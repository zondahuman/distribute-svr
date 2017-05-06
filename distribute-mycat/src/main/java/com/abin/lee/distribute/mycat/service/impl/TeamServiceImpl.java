package com.abin.lee.distribute.mycat.service.impl;

import com.abin.lee.distribute.mycat.dao.TeamMapper;
import com.abin.lee.distribute.mycat.model.Team;
import com.abin.lee.distribute.mycat.service.CompanyService;
import com.abin.lee.distribute.mycat.service.TeamService;
import com.abin.lee.distribute.mycat.vo.request.TeamVo;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by abin on 2017/4/27 17:48.
 * distribute-svr
 * com.abin.lee.distribute.mycat.service.impl
 */
@Service
public class TeamServiceImpl implements TeamService {

    @Resource
    TeamMapper teamMapper;



    @Override
    public void insert(TeamVo teamVo) {
        Team team = new Team();
        try {
            PropertyUtils.copyProperties(team, teamVo);
            team.setCreateTime(new Date());
            team.setUpdateTime(new Date());
            team.setVersion(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.teamMapper.insert(team);
    }




}
