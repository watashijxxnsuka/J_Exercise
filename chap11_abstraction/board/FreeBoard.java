package chap11_abstraction.board;

public class FreeBoard extends Board {
	
	String attachFile;
	
	
	public FreeBoard(long id, String title, String content, String writer, String creDate, String attachFile) {
		super(id, title, content, writer, creDate);
		this.attachFile = attachFile;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void post() {
		System.out.println("자유게시판에 게시글을 작성합니다.");
		System.out.println(this.attachFile + "을 업로드합니다.");
	}
	
	@Override
	public void modify() {
		System.out.println("자유게시판에 글을 수정합니다.");
		System.out.println(this.attachFile + "을 수정합니다.");
	}
	
	@Override
	public void delete() {
		System.out.println("자유게시판의 글을 삭제합니다.");
		System.out.println(this.attachFile + "을 삭제합니다.");
	}

}
