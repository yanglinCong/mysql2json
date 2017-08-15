package com.atguigu.mapper;

import java.util.List;

import com.atguigu.bean.T_MALL_CLASS_1;
import com.atguigu.bean.T_MALL_CLASS_2;
import com.atguigu.bean.T_MALL_CLASS_3;

public interface ClassMapper {
	List<T_MALL_CLASS_1> select_class_1();
	List<T_MALL_CLASS_2> select_class_2(int id);
	List<T_MALL_CLASS_3> select_class_3(int id);

}
