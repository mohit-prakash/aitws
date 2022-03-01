package com.mps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.bindings.PassengerRequest;
import com.mps.bindings.TicketResponse;
import com.mps.dao.IrctcDao;

@Service
public class IrctcService {
	
	@Autowired
	private IrctcDao idao;
	private static Integer i=1001;
	
	public String bookTicket(PassengerRequest preq)
	{
		TicketResponse tr=new TicketResponse();
		tr.setFrom(preq.getFrom());
		tr.setJdate(preq.getJdate());
		tr.setName(preq.getName());
		tr.setTo(preq.getTo());
		tr.setCost("Rs1900.00");
		tr.setStatus("Confirmed");
		tr.setPnr("PNR"+i++);
		idao.saveTicket(tr);
		return tr.getPnr();
	}
	
	public TicketResponse getTicketByPnr(String pnr)
	{
		return idao.getTicketByPnr(pnr);
	}

}
