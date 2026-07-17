package org.hangling.paysystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.hangling.paysystem.entity.User;

import java.util.List;

@Mapper
public interface UserMapper{
    @Select("SELECT * FROM user")
    public List<User> getUserList();

    @Insert("Insert into user(user_name,password) values(#{userName},#{password})")
    public int insertUser(User user);
}
