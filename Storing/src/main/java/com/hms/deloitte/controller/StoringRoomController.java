package com.hms.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hms.deloitte.model.StoringRoom;
import com.hms.deloitte.service.StoringRoomService;



@Controller
public class StoringRoomController {
	
	
	@Autowired
	private StoringRoomService storingRoomService;
	
	@RequestMapping(value = "/rooms",method = RequestMethod.GET)
	public String listRooms(Model model) {
	model.addAttribute("storingRoom",new StoringRoom());
	model.addAttribute("listRooms",this.storingRoomService.listRooms());
	return "Storing";
	}
	
	@RequestMapping(value = "/incrementRooms",method = RequestMethod.POST)
	public String incrementRooms(@ModelAttribute("storingRoom") Integer noOfRooms)
	{
	 System.out.println("Room is occupied" + noOfRooms);
	 this.storingRoomService.incrementRoom();
	 return "redirect:/rooms";
	}
	
	@RequestMapping(value = "/decrementRooms",method = RequestMethod.POST)
	public String decrementRooms(@ModelAttribute("storingRoom") Integer noOfRooms)
	{
	 System.out.println("Room is vacant" + noOfRooms);
	 this.storingRoomService.decrementRoom();
	 return "redirect:/rooms";
	}
	
	
	/*@RequestMapping("/store")
	public ModelAndView store()
	{
			return new ModelAndView("Storing");
		
	}*/
	
	
	
}
