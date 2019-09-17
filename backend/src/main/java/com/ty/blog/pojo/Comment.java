package com.ty.blog.pojo;

import com.ty.blog.constant.TableNameConsts;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: Comment
 * @Description: 评论表
 * @author zhangtainyi
 * @date 2019/9/17 16:56
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = TableNameConsts.TY_COMMENT)
@Table(name = TableNameConsts.TY_COMMENT)
public class Comment implements Serializable {

    /**
     * 主键自增
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    /**
     * 评论id
     */
    @Column(name = "comment_id", unique = true, nullable = false)
    private Long commentId;

    /**
     * 创建时间
     */
    @Column(name = "create_time",nullable = false,length = 30)
    private String createTime;

    /**
     * 最后修改时间
     */
    @Column(name = "modify_time",nullable = false,length = 30)
    private String modifyTime;

}