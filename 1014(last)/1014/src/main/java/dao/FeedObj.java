package dao;

public class FeedObj{
	
	private String id, content, ts;
	
	public FeedObj(String id, String content, String ts) {
		
		this.content = content;
		this.id = id;
		this.ts = ts;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}
	

}