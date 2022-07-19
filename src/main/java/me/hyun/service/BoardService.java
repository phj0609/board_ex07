package me.hyun.service;

import java.util.List;

import me.hyun.model.BoardVO;
import me.hyun.model.Criteria;

public interface BoardService {
	List<BoardVO> readAll(Criteria criteria);
	BoardVO read(Long bno);
	void register(BoardVO vo);
	void modify(BoardVO vo);
	void remove(Long bno);
}
