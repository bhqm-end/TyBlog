package com.ty.blog.dao;

import com.ty.blog.pojo.Relation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: RelationDao
 * @Description: 关系实体持久层
 * @author zhangtainyi
 * @date 2019/9/17 16:20
 *
 */
@Repository
public interface RelationDao extends JpaRepository<Relation, Integer> {

    /**
     * 通过关系类型type和关系码值1查询结果集
     * @param type 关系类型
     * @param code2 关系码值2
     * @return
     */
    List<Relation> findAllByRelationTypeAndCode1In(String type, List<String> code2);

}
