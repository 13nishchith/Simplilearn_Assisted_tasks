package com.spring.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.events.NewsEvent;

@Component
public class NewsListener {

	@EventListener
	public void listenNewsEvent(NewsEvent ne) {
		System.out.println("News Event published ::");
	}
}
