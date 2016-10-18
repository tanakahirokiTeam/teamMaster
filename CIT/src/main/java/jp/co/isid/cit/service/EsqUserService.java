package jp.co.isid.cit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import jp.co.isid.cit.dao.EsqUserDao;
import jp.co.isid.cit.dto.LoginUser;
import jp.co.isid.cit.entity.EsqUser;

@Service
public class EsqUserService implements UserDetailsService {

	private final EsqUserDao esqUserDao;

	@Autowired
	public EsqUserService(EsqUserDao esqUserDao) {
		this.esqUserDao = esqUserDao;
	}

	@Override
	public UserDetails loadUserByUsername(String esqid) throws UsernameNotFoundException {
		EsqUser uinfo = esqUserDao.selectById(esqid);
		if (uinfo == null) {
			throw new UsernameNotFoundException(esqid + " not found");
		}
		return new LoginUser(uinfo);
	}
}