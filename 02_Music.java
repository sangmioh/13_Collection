package com.kh.chap01_list.part02_mvc.model.vo;

//VO : Value Object ���� ��� �뵵�� Ŭ���� => MVC ���� �߿��� Model�� �ش��
public class Music {

	//�ʵ��
	private String title;   //�뷡 ����
	private String artist;  //������
	
	//�����ں�
	//�⺻������
	public Music() {
		super();
	}
	
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
    //�޼ҵ��
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	};
	
	
	
	
	
	
	
	
}