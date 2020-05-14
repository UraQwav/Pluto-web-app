package com.subs.pluto.services.impl;

import com.subs.pluto.entity.User;
import com.subs.pluto.entity.UserType;
import com.subs.pluto.repository.UserRepository;
import com.subs.pluto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.*;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall simpleJdbcCall;
    @PostConstruct
    public void init() {
        jdbcTemplate.setResultsMapCaseInsensitive(true);

        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("PL_PROC_GET_USER_BY_LOGIN_AND_PASSWORD");
    }
    private static final String SQL_STORED_PROC_REF_1="\n" +
            "CREATE OR REPLACE PROCEDURE PL_PROC_GET_USERS(\n" +
            "   O_C_USERS OUT SYS_REFCURSOR)\n" +
            "AS\n" +
            "BEGIN\n" +
            "  OPEN O_C_USERS FOR\n" +
            "  SELECT * FROM PL_USERS;\n" +
            "END;\n";
    private static final String SQL_STORED_PROC_REF = "create or replace PROCEDURE PL_PROC_GET_USER_BY_LOGIN_AND_PASSWORD(\n" +
            "PARAM_USER_LOGIN IN PL_USERS.USER_EMAIL%TYPE,\n" +
            "PARAM_USER_PASSWORD IN PL_USERS.USER_PASSWORD%TYPE,\n" +
            "PARAM_USER_ID OUT PL_USERS.USER_ID%TYPE,\n" +
            "PARAM_USER_DATE_OF_BIRTHDAY OUT PL_USERS.USER_DATE_OF_BIRTHDAY%TYPE,\n" +
            "PARAM_USER_EMAIL2 OUT PL_USERS.USER_EMAIL%TYPE,\n" +
            "PARAM_USER_FIRST_NAME OUT PL_USERS.USER_FIRST_NAME%TYPE,\n" +
            "PARAM_USER_GENDER OUT PL_USERS.USER_GENDER%TYPE,\n" +
            "PARAM_USER_IMAGE_PATH OUT PL_USERS.USER_IMAGE_PATH%TYPE,\n" +
            "PARAM_USER_LAST_NAME OUT PL_USERS.USER_LAST_NAME%TYPE,\n" +
            "PARAM_USER_PASSWORD2 OUT PL_USERS.USER_PASSWORD%TYPE,\n" +
            "PARAM_USER_PHONE OUT PL_USERS.USER_PHONE%TYPE,\n" +
            "PARAM_USER_REGISTRATION_DATE OUT PL_USERS.USER_REGISTRATION_DATE%TYPE,\n" +
            "PARAM_USER_TYPE_ID OUT PL_USERS.USER_TYPE_ID%TYPE)\n" +
            "AS BEGIN \n" +
            "SELECT USER_ID, \n" +
            "USER_DATE_OF_BIRTHDAY, \n" +
            "USER_EMAIL,  \n" +
            "USER_FIRST_NAME,    \n" +
            "USER_GENDER,    \n" +
            "USER_IMAGE_PATH,\n" +
            "USER_LAST_NAME, \n" +
            "USER_PASSWORD,  \n" +
            "USER_PHONE,      \n" +
            "USER_REGISTRATION_DATE,   \n" +
            "USER_TYPE_ID \n" +
            "INTO\n" +
            "PARAM_USER_ID, \n" +
            "PARAM_USER_DATE_OF_BIRTHDAY,\n" +
            "PARAM_USER_EMAIL2,      \n" +
            "PARAM_USER_FIRST_NAME,  \n" +
            "PARAM_USER_GENDER,      \n" +
            "PARAM_USER_IMAGE_PATH,\n" +
            "PARAM_USER_LAST_NAME, \n" +
            "PARAM_USER_PASSWORD2,  \n" +
            "PARAM_USER_PHONE,      \n" +
            "PARAM_USER_REGISTRATION_DATE,  \n" +
            "PARAM_USER_TYPE_ID \n" +
            "FROM PL_USERS WHERE PL_USERS.USER_EMAIL = PARAM_USER_LOGIN AND PL_USERS.USER_PASSWORD = PARAM_USER_PASSWORD;\n" +
            "END;";
    @Override

    public User registrationUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User getUserByLoginAndPassword(String userLogin, String userPassword) {
        User user = new User();
        jdbcTemplate.execute(SQL_STORED_PROC_REF);
        SqlParameterSource paramaters = new MapSqlParameterSource()
                .addValue("PARAM_USER_LOGIN", userLogin)
                .addValue("PARAM_USER_PASSWORD", userPassword);

        try {

            Map out = simpleJdbcCall.execute(paramaters);

            if (out != null) {
                user.setId((BigDecimal) out.get("PARAM_USER_ID"));
                user.setUserType(new UserType((BigDecimal) out.get("PARAM_USER_TYPE_ID")));
                user.setDateOfBirthday((Date) out.get("PARAM_USER_DATE_OF_BIRTHDAY"));
                user.setEmail((String) out.get("PARAM_USER_EMAIL2"));
                user.setFirstName((String) out.get("PARAM_USER_FIRST_NAME"));
                user.setGender((String) out.get("PARAM_USER_GENDER"));
                user.setLastName((String) out.get("PARAM_USER_LAST_NAME"));
                user.setPassword((String) out.get("PARAM_USER_PASSWORD2"));
                user.setPhone((String) out.get("PARAM_USER_PHONE"));
                user.setRegistrationDate((Date) out.get("PARAM_USER_REGISTRATION_DATE"));
            }

        } catch (Exception e) {
            // ORA-01403: no data found, or any java.sql.SQLException
            System.err.println(e.getMessage());
        }
        return user;
    }


}
