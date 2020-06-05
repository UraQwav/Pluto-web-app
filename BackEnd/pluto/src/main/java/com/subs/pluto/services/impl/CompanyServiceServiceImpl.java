package com.subs.pluto.services.impl;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;

import com.subs.pluto.entity.PlCompanyServices;
import com.subs.pluto.repository.CompanyServisesRepository;
import com.subs.pluto.services.CompanyServiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.*;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

@Service
@Component
public class CompanyServiceServiceImpl implements CompanyServiceService{
    @Autowired
    private CompanyServisesRepository companyServiceRepository;

    public CompanyServiceServiceImpl(CompanyServisesRepository companyServiceRepository) {
        this.companyServiceRepository = companyServiceRepository;
    }
    @Value("${spring.datasource.url}")
    private String OracleServerUrl;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcCall simpleJdbcCallRefCursor;
    @PostConstruct
    public void init2() {
        jdbcTemplate.setResultsMapCaseInsensitive(true);

        simpleJdbcCallRefCursor  = new SimpleJdbcCall(jdbcTemplate)
            .withProcedureName("PL_COMPANY_SERVICE_BY_ID")
            .returningResultSet("o_c_book",
                    BeanPropertyRowMapper.newInstance(PlCompanyServices.class));
    }
    private static final String PL_COMPANY_SERVICE_BY_ID = "\n"+
            "create or replace PROCEDURE PL_COMPANY_SERVICE_BY_ID( \n" +
            "PARAM_COMPANY_SERVIC_ID IN PL_COMPANY_SERVICES.ID%TYPE, \n" +
            "o_c_book OUT SYS_REFCURSOR) \n" +
            "AS BEGIN \n" +
            "OPEN o_c_book FOR \n" +
            "SELECT * FROM PL_COMPANY_SERVICES \n" +
            "WHERE PL_COMPANY_SERVICES.ID = PARAM_COMPANY_SERVIC_ID; \n" +
            "END;";

    @Override
    public Iterable<PlCompanyServices> getCompanyServiceByID(BigDecimal id) {
        jdbcTemplate.execute(PL_COMPANY_SERVICE_BY_ID);
        SqlParameterSource paramaters = new MapSqlParameterSource()
        .addValue("PARAM_COMPANY_SERVIC_ID", id);

        Map out = simpleJdbcCallRefCursor.execute(paramaters);

        if (out == null) {
            return Collections.emptyList();
        } else {
            out.get("o_c_book");
            return (Iterable) out.get("o_c_book");
        }
    }

    @Override
    public PlCompanyServices add(PlCompanyServices companyServise) {
        companyServiceRepository.save(companyServise);
        return companyServise;
    }
    @Override
    public Iterable<PlCompanyServices> getall() {
        return companyServiceRepository.findAll();
    }

}