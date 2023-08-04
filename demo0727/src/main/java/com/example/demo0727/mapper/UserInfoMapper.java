package com.example.demo0727.mapper;

import com.example.demo0727.pojo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserInfoMapper {
    void add(UserInfo userInfo);

    /**
     * 删除一条数据
     * @param id 被删除数据的id
     */
    void delete(Integer id);

    /**
     * 修改一条数据
     * @param userInfo 修改的数据
     */
    void update(UserInfo userInfo);

    /**
     * 根据id去查询一条数据
     * @param id 查询的id
     */
    UserInfo queryById(Integer id);

    /**
     * 查询全部数据
     * @return
     */
    List<UserInfo> queryAll();
}




