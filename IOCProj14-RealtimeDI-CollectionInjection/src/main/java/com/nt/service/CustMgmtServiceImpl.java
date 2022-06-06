package com.nt.service;

import com.nt.bo.CustomerBo;
import com.nt.dao.CustomerDao;
import com.nt.dto.CustomerDto;

public final class CustMgmtServiceImpl implements CustMgmtService {
	private CustomerDao dao;
	
	public CustMgmtServiceImpl(CustomerDao dao) {
		super();
		this.dao = dao;
	}


	@Override
	public String calculateSimpleIntrest(CustomerDto dto) throws Exception {
		CustomerBo bo=null;
		//calculate intrest
		float intramt=0.0f;
		intramt=(dto.getRate()*dto.getPamt()*dto.getTime())/100;
		//set values from Dto to Bo
		bo=new CustomerBo();
		bo.setCname(dto.getCname());
		bo.setAddr(dto.getAddr());
		bo.setPamt(dto.getPamt());
		bo.setItramt(intramt);
				int count=dao.Insert(bo);
				if(count==0)
		return "Regestration Failed-> IntrestAmnt"+intramt;
				else
					return "Regestration Succeed -->"+intramt;
	}

}
