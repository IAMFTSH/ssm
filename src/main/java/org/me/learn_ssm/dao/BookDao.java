package org.me.learn_ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.me.learn_ssm.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    /**
     * 通过ID查询单本图书
     *
     * @param id
     * @return
     */
    Book queryById(long id);   /*注意用long*/

    /**
     * 查询所有图书
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return
     */
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 减少馆藏数量
     *
     * @param bookId
     * @return 如果影响行数等于>1，表示更新的记录行数
     */
    int reduceNumber(long bookId);
}
