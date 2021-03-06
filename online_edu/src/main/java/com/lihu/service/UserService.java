package com.lihu.service;

import com.lihu.entity.User;
import java.util.List;
import java.util.Map;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2022-04-17 23:34:45
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User selectById(Integer id);

    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<User> selectPage(int start, int limit);

    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<User> selectAll();
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> selectList(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);
	
	/**
     * 批量新增
     *
     * @param users 实例对象的集合
     * @return 影响行数
     */
	int batchInsert(List<User> users);
	
    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 修改
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    
    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    int count();
}