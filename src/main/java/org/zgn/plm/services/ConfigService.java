package org.zgn.plm.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zgn.plm.beans.Config;
import org.zgn.plm.daos.ConfigDao;

import java.util.Collection;

import static org.zgn.plm.common.utils.CheckUtil.check;
import static org.zgn.plm.common.utils.CheckUtil.notEmpty;
import static org.zgn.plm.common.utils.CheckUtil.notNull;


@Service
public class ConfigService {

	private static final Logger logger = LoggerFactory.getLogger(ConfigService.class);

	@Autowired
	ConfigDao dao;

	public Collection<Config> getAll() {
		// 校验通过后打印重要的日志
		logger.info("getAll start ...");

		Collection<Config> data = dao.getAll();

		logger.info("getAll end, data size:" + data.size());

		return data;
	}

	public long add(Config config) {
		// 参数校验
		notNull(config, "param.is.null");
		notEmpty(config.getName(), "name.is.null");
		notEmpty(config.getValue(), "value.is.null");
		
		// 校验通过后打印重要的日志
		logger.info("add config:" + config);

		long newId = dao.add(config);

		// 修改操作需要打印操作结果
		logger.info("add config success, id:" + newId);

		return newId;
	}

	public boolean delete(long id) {
		// 参数校验
		check(id > 0L, "id.error", id);

		boolean result = dao.delete(id);

		// 修改操作需要打印操作结果
		logger.info("delete config success, id:" + id + ", result:" + result);

		return dao.delete(id);
	}

	public boolean delete2(long id) {
		// XXX 示例代码
		int userType = getCurrentUserType();

		// 校验通过后打印重要的日志
		logger.info("delete config, id: " + id + ", userType: " + userType);

		boolean result = false;

		if (userType == 1) {
			// 做这些事情
		} else {
			// 做那些事情
		}

		// 修改操作需要打印操作结果
		logger.info("delete config success, id:" + id + ", result:" + result);

		return result; // 示例代码
	}

	private int getCurrentUserType() {
		return 2;
	}



}
