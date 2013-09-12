package com.prosper.dispatcher.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "article")
public class ArticleController {

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody String get(@PathVariable("id") String id) {
		return "success";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String post() {
		return "success";
	}

	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	public @ResponseBody String put(@PathVariable("id") String id) {
		return "success";
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	public @ResponseBody String delete(@PathVariable("id") String id) {
		return "success";
	}
	
	@RequestMapping(value = "{list/id}", method = RequestMethod.GET)
	public @ResponseBody String listGet(@PathVariable("id") String id) {
		return "success";
	}

	@RequestMapping(value = "{match/id}", method = RequestMethod.POST)
	public @ResponseBody String matchPost(@PathVariable("id") String id) {
		return "success";
	}
	
}
