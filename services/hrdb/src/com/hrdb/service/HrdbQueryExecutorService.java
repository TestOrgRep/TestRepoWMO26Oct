/*Generated by WaveMaker Studio*/

package com.hrdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.hrdb.models.query.InsertQueryUserRequest;
import com.hrdb.models.query.InsertQuesryEmployeeRequest;
import com.hrdb.models.query.InsertQuesryVacationRequest;

public interface HrdbQueryExecutorService {

    Integer executeInsertQuesryEmployee(InsertQuesryEmployeeRequest insertQuesryEmployeeRequest);

    Integer executeInsertQuery_User(InsertQueryUserRequest insertQueryUserRequest);

    Integer executeInsertQuesryVacation(InsertQuesryVacationRequest insertQuesryVacationRequest);

}


