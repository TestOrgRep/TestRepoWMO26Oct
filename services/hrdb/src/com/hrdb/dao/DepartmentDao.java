/*Generated by WaveMaker Studio*/
package com.hrdb.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.hrdb.Department;

/**
 * Specifies methods used to obtain and modify Department related information
 * which is stored in the database.
 */
@Repository("hrdb.DepartmentDao")
public class DepartmentDao extends WMGenericDaoImpl<Department, Integer> {

    @Autowired
    @Qualifier("hrdbTemplate")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}

