package com.example.RentACar.Dao;
import com.example.RentACar.Connection.DatabaseConnection;
import com.example.RentACar.model.ContractResponseModel;

import com.example.RentACar.model.SignedContractRequestModel;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;


public interface ContractDao {
    Connection conn = DatabaseConnection.getConnection();
    List<LocalDate> getCarOccupiedDates(String car_id);
    List<ContractResponseModel> getAllContracts();
    List<ContractResponseModel> getAllPendingContracts();
    List<ContractResponseModel> getContractHistory (String user_id);
    void deleteContract (String contract_id);
    void updateContractApproval (String contract_id, boolean approval);
    boolean userHasPendingContract (String user_id);
    void addContractToDatabase(SignedContractRequestModel contract);

}
