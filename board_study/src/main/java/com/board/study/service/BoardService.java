package com.board.study.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.board.study.dto.board.BoardRequestDto;
import com.board.study.entity.board.BoardRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardService {

	private final BoardRepository boardRepository;
	
	@Transactional
	public Long Save (BoardRequestDto boardSaveDto) {
		return boardRepository.save(boardSaveDto.toEntity().getId());
	}
}
