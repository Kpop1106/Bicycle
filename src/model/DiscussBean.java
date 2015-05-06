package model;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class DiscussBean {
	private int user_no;
	private java.util.Date discuss_time;
	private String discuss_title;
	private String discuss_content;
	private String discuss_kind;
	
	public static void main(String[] args) {
	 DiscussBean bean = new DiscussBean();
	 
	 bean.setDiscuss_title("你好");
	 bean.setDiscuss_content("哈哈哈哈哈哈哈哈");
	 bean.setDiscuss_kind("討論");
	 bean.setDiscuss_time(null);
	 
	 Session session = DefaultFactory.getSessionFactory().openSession();
	 Transaction tx = session.beginTransaction();
	 session.save(bean);
	 tx.commit();
	 session.close();
	 
	 DefaultFactory.shutdown();

	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public java.util.Date getDiscuss_time() {
		return discuss_time;
	}

	public void setDiscuss_time(java.util.Date discuss_time) {
		this.discuss_time = discuss_time;
	}

	public String getDiscuss_title() {
		return discuss_title;
	}

	public void setDiscuss_title(String discuss_title) {
		this.discuss_title = discuss_title;
	}

	public String getDiscuss_content() {
		return discuss_content;
	}

	public void setDiscuss_content(String discuss_content) {
		this.discuss_content = discuss_content;
	}

	public String getDiscuss_kind() {
		return discuss_kind;
	}

	public void setDiscuss_kind(String discuss_kind) {
		this.discuss_kind = discuss_kind;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
