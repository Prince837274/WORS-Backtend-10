package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.EventDTO;
import com.rays.form.EventForm;
import com.rays.service.EventServiceInt;

@RestController
@RequestMapping(value = "Event")
public class EventCtl  extends BaseCtl<EventForm, EventDTO, EventServiceInt>{

	public ORSResponse preload() {

    ORSResponse res = new ORSResponse(true);
    HashMap<Integer, String> map = new HashMap<Integer, String>();

    map.put(1, "Music Festival");
    map.put(2, "Tech Conference");
    map.put(3, "Startup Meetup");
    map.put(4, "Food Carnival");
    map.put(5, "Business Summit");
    map.put(6, "Art Exhibition");
    map.put(7, "Sports Tournament");

    res.addResult("eventName", map);

    return res;
}
}
