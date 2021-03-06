package com.lihu.dao;

import com.lihu.entity.Course;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (Course)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-14 13:47:09
 */
public interface CourseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Course selectById(Object id);
	
    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Course> selectPage(@Param("start") int start, @Param("limit") int limit);

    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<Course> selectAll();
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param course 实例对象
     * @return 对象列表
     */
    List<Course> selectList(Course course);

    /**
     * 新增数据
     *
     * @param course 实例对象
     * @return 影响行数
     */
    int insert(Course course);
	
	/**
     * 批量新增
     *
     * @param courses 实例对象的集合
     * @return 影响行数
     */
	int batchInsert(List<Course> courses);
	
    /**
     * 修改数据
     *
     * @param course 实例对象
     * @return 影响行数
     */
    int update(Course course);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    int count();
}