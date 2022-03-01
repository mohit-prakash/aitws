package com.mps.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mps.bindings.TicketResponse;

@Repository
public class IrctcDao {
	Map<String , TicketResponse> tmap=new HashMap<>();
	
	public String saveTicket(TicketResponse tr)
	{
		tmap.put(tr.getPnr(), tr);
		return tr.getPnr();
	}
	
	public TicketResponse getTicketByPnr(String pnr)
	{
		if(tmap.containsKey(pnr))
			return tmap.get(pnr);
		return null;
	}
}
