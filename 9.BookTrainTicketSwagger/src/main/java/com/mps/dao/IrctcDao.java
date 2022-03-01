package com.mps.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mps.bindings.TicketResponse;

@Repository
public class IrctcDao {
	Map<String,TicketResponse> tmap = new HashMap<>();
	
	public String saveTicket(TicketResponse response)
	{
			tmap.put(response.getPnr(), response);
			System.out.println("Ticked in DAO Layer!!");
			return response.getPnr();
	}
	
	public TicketResponse getTicketByPnr(String pnr)
	{
		if(tmap.containsKey(pnr))
		{
			System.out.println("Ticket retrieved from map!!");
			return tmap.get(pnr);
		}
		return null;
	}
	
	public String updateTicket(TicketResponse tr)
	{
		tmap.put(tr.getPnr(), tr);
		return tr.getPnr();
	}
	
	public String deleteTicket(String pnr)
	{
		String msg=null;
		if(tmap.containsKey(pnr))
		{
			tmap.remove(pnr);
			msg="Ticket Deleted Successfully!!";
		}
		else
			msg="Ticket Not Found!!";
		return msg;		
	}
}
