package com.strong.ch02.util;

import java.util.List;

import com.strong.ch02.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// 通过继承JpaRepository，也继承了18个执行常用持久化操作的方法。
// JpaRepository是泛型接口，有两个参数：仓库操作的对象类型和ID属性的类型。
// 增加一个findByReader函数，作用是根据读者用户名查找阅读列表
public interface ReadingListRepository extends JpaRepository<Book, Long> {
	List<Book> findByReader(String reader);
}
