package main.ryan.test.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import main.ryan.test.business.TestManager;
import main.ryan.test.business.vo.TestVO;

@Service("TestService")
public class TestManagerImpl implements TestManager {

	@Override
	public List<TestVO> search() throws Exception {
		List<TestVO> voList = new ArrayList<TestVO>();
		TestVO vo = new TestVO();
		vo.setCity("�x�_��");
		vo.setDescription("�O�_���O���إ��ꪺ���ҥ��P�����A��1949�~���_�������إ��ꤤ���F���Ҧb�a");
		voList.add(vo);
		vo = new TestVO();
		vo.setCity("�s�_��");
		vo.setDescription("�s�_���O���إ��ꪺ���ҥ��A���O�W�H�f�ƦW�Ĥ@�������C������¶�O�_��");
		voList.add(vo);
		return voList;
	}

}
