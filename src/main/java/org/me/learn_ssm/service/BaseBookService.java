package org.me.learn_ssm.service;

import org.me.learn_ssm.dto.AppointExecution;
import org.me.learn_ssm.entity.Book;

import java.util.List;

public interface BaseBookService {
    /**
     * 查询一本图书
     *
     * @param bookId
     * @return
     */
    Book getById(long bookId);

    /**
     * 查询所有图书
     *
     * @return
     */
    List<Book> getList();

    /**
     * 预约图书
     *
     * @param bookId
     * @param studentId
     * @return
     */
    AppointExecution appoint(long bookId, long studentId);
}
