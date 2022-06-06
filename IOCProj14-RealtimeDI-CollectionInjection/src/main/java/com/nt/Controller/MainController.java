package com.nt.Controller;

import com.nt.dto.CustomerDto;
import com.nt.service.CustMgmtService;
import com.nt.vo.CustomerVo;

public class MainController {
	private CustMgmtService service;

	public MainController(CustMgmtService service) {
		super();
		this.service = service;
	}
	public String ProcessEmployeeDetails(CustomerVo vo) throws Exception {
		CustomerDto dto=null;
		//convert Vo to Dto
		dto=new CustomerDto();
		dto.setCname(vo.getCname());
		dto.setAddr(vo.getAddr());
		dto.setPamt(vo.getPamt());
		dto.setRate(vo.getRate());
		dto.setTime(vo.getTime());
		return service.calculateSimpleIntrest(dto);
		
	}

}
