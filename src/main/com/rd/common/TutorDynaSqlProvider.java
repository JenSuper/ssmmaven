package com.rd.common;

import com.rd.pojo.User;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.jdbc.SQL;

public class TutorDynaSqlProvider {

    public String updateTutor(final User tutor)
    {
        return new SQL() {{
            UPDATE("user");
            if (tutor.getName() != null) {
                SET("name = #{name}");
            }
            if (tutor.getPassword() != null) {
                SET("password = #{password}");
            }
            WHERE("id = #{id}");
        }}.toString();
    }
}

