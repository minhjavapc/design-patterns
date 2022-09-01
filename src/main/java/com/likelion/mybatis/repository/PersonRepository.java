package com.likelion.mybatis.repository;

import com.likelion.mybatis.entity.Person;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PersonRepository {
    @Select("select count(1) from PERSON")
    int count();

    @Select("SELECT * FROM PERSON WHERE id = #{id}")
    @Results(value = {
            @Result(property = "id", column = "id")
            , @Result(property = "fullName", column = "fullName")
            , @Result(property = "dateOfBirth", column = "dateOfBirth")
    })
    Person findById(long id);

    @Delete("DELETE FROM PERSON WHERE id = #{id}")
    int deleteById(long id);

    @Insert(" INSERT INTO PERSON (fullName, dateOfBirth) " + " VALUES (#{fullName}, #{dateOfBirth}) ")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Person person);

    @Update("Update PERSON set fullName=#{fullName} where id=#{id}")
    int update(Person person);
}
