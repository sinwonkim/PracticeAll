package service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.springS.dao.TestDAO;

@Service
public class TestServiceImpl implements TestService {

	@Inject
	private TestDAO testDAO;
	
	@Override
	public int insertTest() {
		// TODO Auto-generated method stub
		return testDAO.insertTest();
	}

}
