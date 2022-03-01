package com.mps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mps.bindings.PassengerRequest;
import com.mps.bindings.TicketResponse;
import com.mps.dao.IrctcDao;

@Service
public class IrctcService {
	@Autowired
	private IrctcDao dao;
	private static Integer i=1001;
	public String saveTicket(PassengerRequest preq)
	{
			TicketResponse tr=new TicketResponse();
			tr.setName(preq.getName());
			tr.setFrom(preq.getFrom());
			tr.setTo(preq.getTo());
			tr.setStatus("Confirmed");
			tr.setCost("Rs1990.00");
			tr.setJdate(preq.getJdate());
			tr.setPnr("PNR"+i++);
			System.out.println("Ticket in Service Layer!!");
			return dao.saveTicket(tr);
	}
	
	public TicketResponse getTicketByPnr(String pnr)
	{
		return dao.getTicketByPnr(pnr);
	}
	
	public String updateTicket(TicketResponse tr)
	{
		String pnr=dao.updateTicket(tr);
		String msg="Ticket updated successfully!! "+pnr;
		return msg;	
	}
	
	public String deleteTicket(String pnr)
	{
		return dao.deleteTicket(pnr);
	}
}
