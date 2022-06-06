package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBo;
import com.nt.dao.CustomerDao;

public  final class CustomerDaoImpl  implements CustomerDao{
	private static final String INSERT_CUST="INSERT INTO CUSTOMER(cname,addr,pamt,intamt) VALUES(?,?,?,?)";
private DataSource ds;

	public CustomerDaoImpl(DataSource ds) {
	this.ds = ds;
}
	@Override
	public int Insert(CustomerBo custBo) throws Exception {
	Connection con=ds.getConnection();
	//create Statement Obj
	PreparedStatement ps=con.prepareStatement(INSERT_CUST);
	ps.setString(1, custBo.getCname());
	ps.setString(2, custBo.getAddr());
	ps.setFloat(3, custBo.getPamt());
	ps.setFloat(4, custBo.getItramt());
	//execute query
	int count=ps.executeUpdate();
	ps.close();
	con.close();
		return count;
		
	}

}
