package org.zgn.plm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zgn.plm.beans.Config;
import org.zgn.plm.common.beans.ResultBean;
import org.zgn.plm.services.ConfigService;

import java.util.Collection;

@RequestMapping("/config")
@RestController
public class ConfigController {

	@Autowired
	ConfigService configService;

	@GetMapping("/all")
	public ResultBean<Collection<Config>> getAll() {
		return new ResultBean<Collection<Config>>(configService.getAll());
	}

	@PostMapping("/add")
	public ResultBean<Long> add(Config config) {
		return new ResultBean<Long>(configService.add(config));
	}

	@PostMapping("/delete")
	public ResultBean<Boolean> delete(long id) {
		return new ResultBean<Boolean>(configService.delete(id));
	}
}
