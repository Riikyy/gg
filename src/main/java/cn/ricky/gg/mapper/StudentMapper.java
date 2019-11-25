package cn.ricky.gg.mapper;

import cn.ricky.gg.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("StudentMapper")
public interface StudentMapper {
    @Select("select * from student")
    List<Student> findAll();
}
