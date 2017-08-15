package com.atguigu.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.atguigu.bean.T_MALL_CLASS_3;
import com.atguigu.factory.MySessionFactory;
import com.atguigu.mapper.ClassMapper;
import com.google.gson.Gson;

public class Test01 {

	public static void main(String[] args) throws IOException {
		SqlSessionFactory myFactory = MySessionFactory.getMyFactory();
		SqlSession openSession = myFactory.openSession();
		ClassMapper mapper = openSession.getMapper(ClassMapper.class);
		
		List<T_MALL_CLASS_3> select_class_3 = mapper.select_class_3(15);
		
		Gson gson = new Gson();
		String json = gson.toJson(select_class_3);
		System.out.println(json);
		FileOutputStream fos =new FileOutputStream(new File("d:/tm_class_1_15.js"));
		fos.write(json.getBytes());
	}

}
