package org.zgn.plm.daos;


import org.zgn.plm.beans.Config;

import java.util.Collection;

public interface ConfigDao {

	Collection<Config> getAll();

	long add(Config config);

	boolean delete(long id);

}
