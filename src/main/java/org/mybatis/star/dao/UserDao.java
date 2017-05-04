package org.mybatis.star.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.star.entity.User;

/**
 * @author stanislav.lapitsky created 5/3/2017.
 */
public class UserDao extends GenericDAO<User, Long> {

    public UserDao(SqlSession session, String mappingName) {
        super(session, mappingName);
    }
}
