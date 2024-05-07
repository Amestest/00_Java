package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscSinger {

	public class AscTitle implements Comparator<Music>{

		@Override
		public int compare(Music 음악1, Music 음악2) {
			return 음악2.getSinger().compareTo(음악1.getSinger());
		}
		
	}
}
